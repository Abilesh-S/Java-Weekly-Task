package com.kovanlabs.intern.week.task.inheritanceday7;
abstract class Shape{
    abstract double area();
}
class Circle extends Shape{
    double radius;
    Circle(float radius){
        this.radius = radius;
    }
    double area(){
        return radius * radius * Math.PI;
    }

}
class Square extends Shape{
    double sides;
    Square(double sides){
        this.sides = sides;
    }
    double area(){
        return sides*sides;
    }

}
class ShapeFactory{
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(5);
        shapes[1] = new Square(5);
        double sum=0;
        for(Shape i : shapes){
            sum += i.area();
        }
        System.out.println("Total area of the Shapes "+sum);
    }

}