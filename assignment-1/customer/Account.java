package customer;

import java.util.Scanner;

public class Account {
    private int accId;
    private String accType;
    private String customer;
    private float acctBalance;
    Scanner sc = new Scanner(System.in);

    public Account(){
        System.out.println("Enter Details of the Account");
        accId = validId();
        accType = validaccType();
        customer = validName();
        acctBalance = validBalance();
    }
    private int validId() {
        System.out.println("Enter AccountId:");
        boolean truth = true;
        int id =0;
        while(truth){
            try{
                id = sc.nextInt();
                truth=false;
            }catch(Exception e){
                System.out.println("Enter numerical values only");
                sc.next();
            }
        }
        return id;
    }
    public float validBalance(){
        System.out.println("Enter Account Balance");
        boolean truth = true;
        float balance = 0;
        while(truth){
            try {
                balance = sc.nextFloat();
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
    public String validName(){
        System.out.println("Enter customer Name");
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
    public String validaccType(){
        System.out.println("Enter type of account belongs 'SAVINGS' or 'CURRENT'");
        boolean truth = true;
        String s = null;
        while(truth){
            s = sc.next();
            s = s.toLowerCase();
            if(s.equals("savings") || s.equals("current")){
                truth=false;
            }
            else{
                System.out.println("Enter type of account belongs 'SAVINGS' or 'CURRENT'");
                truth=true;
            }
        }
        return s;
    }
    public void display(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Account{" +
                "accId=" + accId +
                ", accType='" + accType + '\'' +
                ", customer='" + customer + '\'' +
                ", acctBalance=" + acctBalance +
                '}';
    }
}
