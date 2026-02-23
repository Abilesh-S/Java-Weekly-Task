package com.kovanlabs.intern.week.task.oopscollection.topicspractice;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class ExceptionPractice {
    private static void divisionByZero(){
        try{
            int div = 10 / 0 ;
            System.out.println(div);
        }
        catch(ArithmeticException e){
            System.out.println(e.toString());
        }
    }
    private static void inputMistMatchException(){
        try(Scanner input = new Scanner(System.in);){
            int a = input.nextInt();
            int b = input.nextInt();
            System.out.println(a+b);

        }
        catch (InputMismatchException e){
            System.out.println(e.toString());
        }
    }

    private static void arrayIndexOutOfBoundException(){
        int[] arr = new int[10];
        try{
            System.out.println(arr[11]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.toString());
        }
    }

    private static void nullPointerException(){
        try{
            String a = null;
            System.out.println(a.length());
        }
        catch (NullPointerException e){
            System.out.println(e.toString());
        }
    }

    private static void multiCatch(){

        try(Scanner input = new Scanner(System.in)){
            int choice = input.nextInt();
            if(choice == 1 ){
                int[] arr = new int[10];
                System.out.println(arr[11]);
            }
            else{
                String a = null;
                System.out.println(a.length());
            }

        } catch (NullPointerException e) {
            System.out.println(e.toString());
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.toString());
        }
    }

    private static void numberFormatException(){
        String s = "Kattapa";
        try{
            Integer a = Integer.parseInt(s);
            System.out.println(a);
        }catch (NumberFormatException e){
            System.out.println(e.toString());
        }
    }

    private static void menuDrivenCalculator(){
        System.out.println("Menu driven calculator\n1.Addition \n2.Subtraction \n3.Multiplication \n4.Division");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        int a = input.nextInt();
        int b = input.nextInt();
        switch(choice){
            case 1:
                try{System.out.println("Add : "+(a+b));}catch(ArithmeticException e){e.printStackTrace();}
                break;
            case 2:
                try{if(a>b){System.out.println("Subtraction : "+(a-b));}
                else{System.out.println("Subtraction : "+(b-a));}}catch(ArithmeticException e){e.printStackTrace();}
                break;
            case 3:
                try{System.out.println("Multiplication : "+(a*b));}catch(ArithmeticException e){e.printStackTrace();}
                break;
            case 4:
                try{System.out.println("Division : "+(a/b));}
                catch (ArithmeticException e){
                    System.out.println(e.toString());}
                break;
            default:
                System.out.println("Invalid choice");

        }

    }
    private static void nestedException(){
        int a = 10 , b = 0;
        try{
           try{
               int[] arr = new int[10];
               System.out.println(arr[11]);
           }catch(ArrayIndexOutOfBoundsException e){
               System.out.println(e.toString());
           }
           System.out.println(a/0);
        }
        catch (ArithmeticException e){
            System.out.println(e.toString());
        }
    }

    public static void main(String[] args) {
        nestedException();
    }

}
