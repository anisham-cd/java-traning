package com.company;
import java.util.Scanner;

public class OddNum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter odd number :");
        for(int i=0;i<=n;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
}
