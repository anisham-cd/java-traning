package com.company;
import java.util.Scanner;

public class Quot {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        int divisor=scan.nextInt();
        int quotient=num/divisor;
        int remainder=num%divisor;
      //  int num1=quotient & remainder;
        System.out.println(num);
        System.out.println(quotient);
        System.out.println(remainder);
    }
}
