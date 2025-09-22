package W3L12_HW_Asgmt.prob2;
public class CustomerAccount {
    private String cusName;
    private String accNo;
    private double balance;

    public CustomerAccount(String cusName, String accNo, double balance) {
        this.cusName = cusName;
        this.accNo = accNo;
        this.balance = balance;
    }

    public boolean deposit(double amount) throws AccountException{
        if (amount <= 0) {
            throw new IllegalArgumentException("The deposit amount must be positive");
        }

        balance += amount;
        return true;
    }

    public boolean withdraw(double amount) throws AccountException{
        if (amount > balance) {
            throw new AccountException("Insufficient funds! Withdrawal amount exceeds balance.");
        }

        if (balance - amount < 100)
            throw new AccountException("Low balance warning! Balance cannot go below $100.");

        balance -= amount;
        return true;
    }

    public double getBalance() {
        return balance;
    }
}
