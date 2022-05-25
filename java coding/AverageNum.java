package com.company;
import java.util.Scanner;

public class AverageNum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double a,b,c,average;
        System.out.println("Enter first number");
        a=sc.nextDouble();
        System.out.println("Enter second number");
        b=sc.nextDouble();
        System.out.println("Enter third number");
        c=sc.nextDouble();
        average=(a+b+c)/3;
        System.out.println("Enter average number:"+ average);
    }
}
