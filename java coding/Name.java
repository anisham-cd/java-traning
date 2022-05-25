package com.company;
import java.util.Scanner;

public class Name {
    public static void main(String args[]){
        String name = "Hari";//literal
        String name1="Hai";
        //String name1="Hari"; refernce
        String name2=name+" "+name;
        String name3=new String("HELLO");//heap
        String name4=name3+name2;
        System.out.println(name4);
    }
}
