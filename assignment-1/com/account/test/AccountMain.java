package com.account.test;

import com.account.Account;

import java.util.Scanner;

public class AccountMain {
    public static void main(String[] args) {

        Account account = new Account();
        boolean truth = true;
        Scanner sc = new Scanner(System.in);
        while(truth){
            System.out.println("The Menu:");
            System.out.println("1.Deposit");
            System.out.println("2.Withdraw");
            System.out.println("3.Display Balance");
            System.out.println("4.Exit");
            int resp = sc.nextInt();
            switch (resp){
                case 1:
                    account.deposit();
                    break;
                case 2:
                    account.withdraw();
                    break;
                case 3:
                    account.getBalance();
                    break;
                case 4:
                    truth=false;
                    System.out.println("Exited successfully");
                    break;
            }
        }
        account.display();
    }


}
