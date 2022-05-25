package com.company;
import java.util.Scanner;


public class Array{
    public static void main(String args[]) {
        Scanner scan=new Scanner(System.in);
        int arr[]={1,2,3,4,5};
        int var[]=new int[4];
        for(int i=0;i<=4;i++){
             var[i]=scan.nextInt();
        }
        System.out.println(var[0]);
    }
}