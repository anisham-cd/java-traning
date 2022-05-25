package com.company;
public class StringCompare {
	public static void main(String[] args) {
	    String one="Anisha";
	    String two="anisha";
	    String three=new String("Anisha");
	    Boolean str=one.equals(two);
	    Boolean str1=one.equals(three);
	    Boolean str2=two.equals(three);
	    System.out.println(str);
	    System.out.println(str1);
	    System.out.println(str2);
	}
}

