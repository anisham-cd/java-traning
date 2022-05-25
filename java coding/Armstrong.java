package com.company;
import java.util.Scanner;
import java.lang.Math;

public class Armstrong {
    public static void main(String args[]) {
        int num = 1535, temp = 0;
        int result = 0;
        int val = 0;
        int digit = 0;
        temp = num;
        for (;num>0;) {
            num = num / 10;
            //num=temp/10;
            digit++;
           // num = temp;
        }
        num = temp;
        for (; num > 0; ) {
            //int result = 0;
            val = num % 10;
            result = (int) (result + (Math.pow(val, digit)));
            num = num / 10;
        }
        num = temp;
        if ((num != result)) {
            System.out.println("Not an armstrong");
        } else {
            System.out.println("Armstrong");
        }
    }
    }


