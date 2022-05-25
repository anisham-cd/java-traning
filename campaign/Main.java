package com.company.campaign;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Module> arr = new ArrayList<>();
        boolean opt = true;
        int choice = 0;
        int sum=0;
        while (opt == true) {
            System.out.println("Enter 1 : value\nEnter 2 : exit");

            choice = sc.nextInt();
            if (choice == 1) {
                String otp=sc.nextLine();
                System.out.println("Enter Name:");
                String name = sc.nextLine();
                System.out.println("Enter Address:");
                String address = sc.nextLine();
                System.out.println("Enter Task:");
                String task = sc.nextLine();
                System.out.println("Enter PhoneNo :");
                String phoneNo = sc.nextLine();
                System.out.println("Enter Amount:");
                int amount = sc.nextInt();
                Module mod = new Module();
                mod.setName(name);
                mod.setAddress(address);
                mod.setTask(task);
                mod.setPhoneNo(phoneNo);
                mod.setAmount(amount);
                arr.add(mod);
            }
            else if (choice==2){
                opt=false;
            }
        }
        opt = true;
        while(opt==true){
            System.out.println("Enter 1:total number  of people \nEnter 2:total amount \nEnter 3:Name of the members" +
                    "\nEnter 4:back");
           choice=sc.nextInt();

            if(choice==1) {
                System.out.println("total number  of people" + ":" + arr.size());
            }
            else if(choice==2){
                for(int i=0;i<arr.size();i++){
                    sum=sum+arr.get(i).getAmount();
                }
                System.out.println(sum);
            }
            else if(choice==3){
                for(int i=0;i<arr.size();i++){
                System.out.println("Name of the member");
                }
            }
            else if(choice==4){
                opt=false;
            }
        }
    }
}
