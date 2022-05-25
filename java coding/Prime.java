package com.company;
import java.util.Scanner;

public class Prime {
    public static void main(String args[] ) {
        int count = 0;
        //Scanner scan=new Scanner(System.in);
        int n =10; //scan.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
          }
        }
        if (count == 2) {
            System.out.println("prime");
        }
        else{
            System.out.println("not a prime");
        }
    }
}
