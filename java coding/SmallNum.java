package com.company;
import java.util.Scanner;

public class SmallNum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a,b,c,temp,smallest;
        System.out.println("Enter first number");
        a=sc.nextInt();
        System.out.println("Enter second number");
        b=sc.nextInt();
        System.out.println("Enter third number");
        c=sc.nextInt();
        temp=a<b?a:b;
        smallest=c<temp?c:temp;
        System.out.println("Enter smallest number");
        System.out.println(smallest);

    }
}
