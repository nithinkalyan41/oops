import java.util.Scanner;

public class BankAccount {
    private String accountHolderName;
    private int accountNo;
    private String accountType;
    private float accountBalance;

    Scanner sc = new Scanner(System.in);
    public BankAccount(){

    }
    public BankAccount(String accountHolderName, int accountNo, String accountType, float accountBalance) {
        this.accountHolderName = accountHolderName;
        this.accountNo = accountNo;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }

    public void createAccount() {
        System.out.println("Enter account holder name : ");
        accountHolderName = scanValidname();
        System.out.println("Enter account number : ");
        accountNo = scanValidNum();
        System.out.println("Enter type of account : ");
        accountType = scanValidType();
        System.out.println("Enter account balance");
        accountBalance = scanValidBalance();
    }
    public void deposit(){
        System.out.println("Enter amount for deposit : ");
        float amount = scanValidBalance();
        accountBalance = accountBalance+amount;
        System.out.println(amount+" Amount deposited int bankaccount.");
    }
    public void withdraw(){
        System.out.println("Enter amount to withdraw :");
        float amount = scanValidBalance();
        if(accountBalance > amount){
            accountBalance = accountBalance-amount;
            System.out.println(amount+" Amount withdrawn from account.");
        }
        else{
            System.out.println("Unable to process due to less fund.");
        }
    }
    public void display(){
        System.out.println(this);
    }

    private String scanValidname() {
        boolean truth = true;
        String s = null;
        while (truth) {
            s = sc.next();
            s = s.toLowerCase();
            for (int i = 0; i < s.length(); i++) {
                int temp = s.charAt(i);
                if (temp >= 97 && temp <= 122) {
                    truth = true;
                } else {
                    truth = false;
                    break;
                }
            }
            if (!truth) {
                System.out.println("Enter alphabets only");
                truth = true;
            } else {
                truth = false;
            }
        }
        return s;
    }

    private int scanValidNum() {
        int num;
        while (true) {
            try {
                num = sc.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Enter numerical values only :");
                sc.next();
            }
        }
        return num;
    }

    private String scanValidType() {
        String s = null;
        while (true) {
            s = sc.next();
            s = s.toLowerCase();
            if (s.equals("savings") || s.equals("current")) {
                break;
            } else {
                System.out.println("Enter Type of account as 'SAVINGS' or 'CURRENT'");
            }
        }
        return s;
    }

    private float scanValidBalance() {
        float num;
        while (true) {
            try {
                num = sc.nextFloat();
                break;
            } catch (Exception e) {
                System.out.println("Enter numerical values only : ");
                sc.next();
            }
        }
        return num;
    }

    @Override
    public String toString() {
        return "BankAccount[" +
                "accountHolderName='" + accountHolderName + '\'' +
                ", accountNo=" + accountNo +
                ", accountType='" + accountType + '\'' +
                ", accountBalance=" + accountBalance +
                ']';
    }
}
