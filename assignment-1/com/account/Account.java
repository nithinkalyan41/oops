package com.account;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Account {
    private int accId;
    private String accType;
    private float accBalance;
    Scanner sc = new Scanner(System.in);
    public Account(){

        accId = validId();
        accType = validType();
        accBalance = validBalance();
    }
    private int validId() {
        boolean truth = true;
        int num = 0;
        System.out.println("Enter Id of the account:n");
        while(truth){
            try {
                num = sc.nextInt();
                if(num<0){
                    System.out.println("Enter valid Details");
                    truth=true;
                }
                else{
                    truth=false;
                }
            }catch (Exception e){
                System.out.println("Enter numerical values only");
                sc.next();
            }

        }
        return num;
    }
    private String validType() {
        System.out.println("Enter any ONE of the following 'SAVINGS' or 'CURRENT'");
        boolean truth = true;
        String s = null;
        while(truth){
            s = sc.next();
            s = s.toLowerCase();
            if(s.equals("savings") || s.equals("current")){
                truth=false;
            }
            else{
                truth=true;
                System.out.println("Enter any ONE of the following 'SAVINGS' or 'CURRENT'");
            }
        }
        return s;
    }
    public float validBalance(){
        boolean truth = true;
        System.out.println("Enter balance of the account");
        float n = 0;
        while(truth){
            try {
                n = sc.nextFloat();
                truth = false;
            }catch (Exception e){
                System.out.println("Enter numerical values only");
                sc.next();
            }
        }
        return n;
    }
    public void deposit(){
        System.out.println("Enter the amount for deposit");
        boolean truth = true;
        float amount = 0;
        while(truth){
            try{
                amount=sc.nextFloat();
                truth = false;
            }catch(Exception e){
                System.out.println("Enter numerical values only");
                sc.next();
            }
        }
        accBalance=accBalance+amount;
        System.out.println("the amount deposited into the account");
    }
    public void withdraw(){
        System.out.println("Enter the amount to withdraw");
        boolean truth = true;
        float amount = 0;
        while(truth){
            try{
                amount=sc.nextFloat();
                truth = false;
            }catch(Exception e){
                System.out.println("Enter numerical values only");
                sc.next();
            }
        }
        accBalance=accBalance-amount;
        System.out.println("the amount Withdrawn from the account");
    }
    public void getBalance(){
        System.out.println("The balance in account is: "+accBalance);
    }
    public void display(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Account{" +
                "accId=" + accId +
                ", accType='" + accType + '\'' +
                ", accBalance=" + accBalance +
                '}';
    }
}
