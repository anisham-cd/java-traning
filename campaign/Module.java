package com.company.campaign;
import java.util.Scanner;

class Module {
        private String name;
        private String address;
        private String task;
        private String phoneNo;
        private int amount;
        public void setName(String name){
                this.name=name;
        }
        public void getName(){
               System.out.println("Enter name"+":"+name);
        }
        public void setAddress(String address){
                this.address=address;
        }
        public void getAddress(){
                System.out.println("Enter address"+":"+address);
        }
        public void setTask(String task){
                this.task=task;
        }
        public void getTask(){
                System.out.println("Enter the Task"+":"+task);
        }
        public void setPhoneNo(String phoneNo){
                this.phoneNo=phoneNo;
        }
        public void getPhoneNo(){
                System.out.println("Enter phone no"+":"+phoneNo);
        }
        public void setAmount(int amount){
                this.amount=amount;
        }
        public int getAmount(){
               return amount;
        }



}
