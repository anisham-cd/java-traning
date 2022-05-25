package com.company;
import java.util.Random;

public class RandomNum {
    public static void main(String args[]){
        Random random=new Random();
        int a=random.nextInt(10);
        int b=random.nextInt(50);
        System.out.println("Random number");
        System.out.println(a);
        System.out.println(b);
    }
}
