class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) { super(message); }
}
class BankAccount {
    double balance = 5000;
    void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) throw new InsufficientBalanceException("Insufficient balance");
        balance -= amount;
        System.out.println("Withdrawal successful. Balance = " + balance);
    }
}
public class InsufficientBalanceDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        try { account.withdraw(6000); }
        catch (InsufficientBalanceException e) { System.out.println(e.getMessage()); }
    }
}
