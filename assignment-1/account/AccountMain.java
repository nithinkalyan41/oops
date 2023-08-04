package account;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();
        account.setAccountDetails();
        account.withdraw(450);
        account.deposit(550);
        account.dispAccountDetails();
    }
}
