package com.company;
import java.util.Scanner;

public class Factorial {
    public static void main(String args[]){
        int n=5,fact=1;
        //int fact;
        //temp=fact;not necessary
        System.out.println("Enter the number");
        for(int i=0;i<=5;i++) {
            fact = fact * n;
            //--n;n-- both are same
            n--;
            System.out.println(fact);
        }
    }
}
