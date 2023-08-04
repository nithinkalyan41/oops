package constructors;

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.displayStudent();
        Account account = new Account();
        account.withdraw(500);
        account.deposit(1000);
        account.dispAccountDetails();
    }
}
