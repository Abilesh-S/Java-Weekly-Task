package com.kovanlabs.intern.week.task.enumday9;

import java.util.Scanner;

enum Operation{
    ADD("+"){
        public double apply(double num1 , double num2){
            return num1 + num2;
        }
    },
    SUB("-"){
        public double apply(double num1 , double num2){
            if(num2 > num1){
                return num2 - num1;
            }
            return num1 - num2;
        }
    },
    MUL("*"){
        public double apply(double num1 , double num2){
            return num1 * num2;
        }
    },
    DIV("/"){
        public double apply(double num1 , double num2){
            return num1 / num2;
        }
    },
    MOD("%"){
        public double apply(double num1 , double num2){
            return num1 % num2;
        }
    },
    POW("**"){
        public double apply(double num1 , double num2){
            return Math.pow(num1, num2);
        }
    };
    private String operationSymbol;
    Operation(String operationSymbol){
        this.operationSymbol = operationSymbol;
    }
    public String getOperationSymbol() {
        return operationSymbol;
    }

    public abstract double apply(double num1 , double num2);
}

public class CalculatorUsingEnum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1 , num2 ;
        System.out.println("Enter number 1 & 2: ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        char   operationSymbol;
        System.out.println("Enter operation to be performed: ");
        operationSymbol = input.next().charAt(0);
        switch(operationSymbol){
            case '+':
                System.out.println(num1+" "+Operation.ADD.getOperationSymbol()+" "+num2+" = " + Operation.ADD.apply(num1 , num2));
                break;
            case '-':
                System.out.println(num1+" "+Operation.SUB.getOperationSymbol()+" "+num2+" = " + Operation.SUB.apply(num1 , num2));
                break;
            case '*':
                System.out.println(num1+" "+Operation.MUL.getOperationSymbol()+" "+num2+" = " + Operation.MUL.apply(num1 , num2));
                break;
            case '/':
                System.out.println(num1+" "+Operation.DIV.getOperationSymbol()+" "+num2+" = " + Operation.DIV.apply(num1 , num2));
                break;
            case '%':
                System.out.println(num1+" "+Operation.MOD.getOperationSymbol()+" "+num2+" = " + Operation.MOD.apply(num1 , num2));
                break;
            case 'P' :
                System.out.println(num1+" "+Operation.POW.getOperationSymbol()+" "+num2+" = " + Operation.POW.apply(num1 , num2));
                break;
            default:
                System.out.println("Invalid Operation");

        }

    }
}
