package com.kovanlabs.intern.week.task.topicspractice;

interface Pay{
    void bankTransfer(float amount);
    void cash(float cash);
}

abstract class EmployeeDetails{
    protected String name ,id;
    protected float salary;
    EmployeeDetails(String name,String id,float salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    public float getSalary() {
        return salary;
    }
    abstract public void setSalary(float salary);

}
class FullTimeEmployee extends EmployeeDetails implements Pay{
    FullTimeEmployee(String name,String id,float salary){
        super(name,id,salary);
    }
    @Override
    public void setSalary(float salary) {
        super.salary=salary;
    }
    @Override
    public void bankTransfer(float amount) {
        if(amount>salary){
            System.out.println("Amount greater than Salary");
        }
        else{
            salary=salary-amount;
            setSalary(salary);
        }
    }
    @Override
    public void cash(float amount) {
        if(amount>salary){
            System.out.println("Amount greater than Salary");
        }
        else{
            salary=salary-amount;
            setSalary(salary);
        }
    }
}
class PartTimeEmployee extends EmployeeDetails implements Pay{
    PartTimeEmployee(String name,String id,float salary){
        super(name,id,salary);
    }
    @Override
    public void setSalary(float salary1) {
        super.salary=salary1;

    }
    @Override
    public void bankTransfer(float amount) {
        if(amount>salary){
            System.out.println("Amount greater than Salary");
        }
        else{
            salary=salary-amount;
            setSalary(salary);
        }
    }
    @Override
    public void cash(float amount) {
        if(amount>salary){
            System.out.println("Amount greater than Salary");
        }
        else{
            salary=salary-amount;
            setSalary(salary);
        }
    }

}


public class EmployeeManagementSystem {
    public static void main(String[] args) {
        EmployeeDetails e1 = new FullTimeEmployee("Abilesh","22BCS002",50000);
        e1.setSalary(5000);
        System.out.println("Employee Salary e1 ; "+e1.getSalary());
        Pay p1 = (Pay) e1;
        p1.cash(1000);
        System.out.println("Employee Total Balance e1 ; "+e1.getSalary());

    }
}
