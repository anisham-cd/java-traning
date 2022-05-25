package com.company;
import java.util.Scanner;
public class NPrime {
    public static void main(String args[]) {
        int count = 0;
        //Scanner scan = new Scanner(System.in);
        //int n = scan.nextInt();
        int n=100;
        for (int i = 1; i <= n; i++) {
            //System.out.println("p");
            count=0;
            for (int j = 1; j <= n; j++) {
                //System.out.println(n);

                //count = 0;
                if (i % j == 0) {
                    count++;
                    //count=0;
                }
            }
            if (count == 2) {
                System.out.println(i);
            }
        }
    }
}
