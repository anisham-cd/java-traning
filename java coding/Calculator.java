package com.company;
import java.util.Scanner;

public class Calculator {
    public static void main(String args[]){
        char operator;
        double n1,n2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the operator : +,-,/,% or *");
        operator=sc.next().charAt(0);
        n1=sc.nextDouble();
        n2=sc.nextDouble();
        switch (operator){
            case '+':
                System.out.println(n1+n2);
                break;
            case '-':
                System.out.println(n1-n2);
                break;
            case '*':
                System.out.println(n1*n2);
                break;
            case '/':
                System.out.println(n1/n2);
                break;
            case '%':
                System.out.println(n1%n2);
                break;



        }
    }
}
