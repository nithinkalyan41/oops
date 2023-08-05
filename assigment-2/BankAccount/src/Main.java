import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /* BankAccount bankAccount = new BankAccount("nithin",1025,"savings",102.5f);
        bankAccount.deposit();
        bankAccount.withdraw();
        bankAccount.display();*/
        BankAccount bankAccount1 = new BankAccount();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println(
                    "1.Create Account\n2.Deposit\n3.Withdraw\n4.Display details\n5.exit"
            );
            System.out.println("Enter your choice : ");
            int a = sc.nextInt();
            switch(a){
                case 1:
                    bankAccount1.createAccount();
                    break;
                case 2:
                    bankAccount1.deposit();
                    break;
                case 3:
                    bankAccount1.withdraw();
                    break;
                case 4:
                    bankAccount1.display();
                    break;
                case 5:
                    return;
            }
        }
    }
}