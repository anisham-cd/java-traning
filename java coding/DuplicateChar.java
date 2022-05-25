package com.company;
import java.util.Scanner;

//public class DuplicateChar {
//}
public class DuplicateChar{
    public static void main(String[] args) {
        String str1 = "ANISHANISHA";
        int count;

        char string[] = str1.toCharArray();

        System.out.println("Duplicate characters in a given string: ");
        for (int i = 0; i < string.length; i++) {
            count = 1;
            for (int j = i + 1; j < string.length; j++) {
                if (string[i] == string[j]) {// && string[i] != ' ') {
                    count++;
                    string[j] = '0';
                }
            }

            if (count >= 2 && string[i] != '0')
                System.out.println(string[i]+ " :"+count);
        }
    }
}