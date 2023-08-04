package account;

import java.util.Scanner;

public class Account {
    private int accountNo;
    private String accountType;
    private int accountBalance;
    Scanner sc = new Scanner(System.in);
    public void setAccountDetails(){
        System.out.println("Enter the details of the Account");
        accountNo  = isAccountNum();
        accountType = isAccountType();
        accountBalance = isAccountBalance();
    }

    private int isAccountBalance() {
        boolean truth = true;
        int balance = 0;
        while(truth){
            try {
                balance = sc.nextInt();
                if(balance<0){
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
        return balance;
    }
    public String isName(){
        boolean truth = true;
        String s = null;
        while(truth) {
            s = sc.next();
            s = s.toLowerCase();
            for (int i = 0; i < s.length(); i++) {
                int temp = s.charAt(i);
                if (temp >= 97 && temp <= 122) {
                    truth = true;
                }
                else{
                    truth=false;
                    break;
                }
            }
            if(!truth){
                System.out.println("Enter alphabets only");
                truth = true;
            }
            else{
                truth=false;
            }
        }

        return s;

    }

    private String isAccountType() {
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

    private int isAccountNum() {
        boolean truth = true;
        int num = 0;
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

    public int withdraw(int draw){
    return accountBalance=accountBalance-draw;
    }
    public int deposit(int deposits){
        return accountBalance=accountBalance+deposits;
    }
    public void dispAccountDetails(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Account[" +
                "accountNo=" + accountNo +
                ", accountType='" + accountType + '\'' +
                ", accountBalance=" + accountBalance +
                ']';
    }
}
