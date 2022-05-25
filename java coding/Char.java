package com.company;
import java.util.Scanner;

public class Char {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        char name=scan.next().charAt(1);
        System.out.println(name);
        if((name=='a')&&(name=='e')&&(name=='i')&&(name=='o')&&(name=='u')){
          System.out.println("vowel");
        }
        else{
            System.out.println("constant");

        }
    }
}
