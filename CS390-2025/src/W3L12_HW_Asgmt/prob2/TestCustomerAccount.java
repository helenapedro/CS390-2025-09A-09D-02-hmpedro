package W3L12_HW_Asgmt.prob2;

public class TestCustomerAccount {
    public static void main(String[] args) {
        CustomerAccount ca = new CustomerAccount("Helen", "1234", 200);
        // 1. Deposit with negative input
        try {
            ca.deposit(-50);
        } catch (IllegalArgumentException e) {
            System.out.println("Test 1 -> " + e.getMessage());
        }
        // 2. Withdraw more than balance
        try {
            ca.withdraw(500);
        } catch (AccountException e) {
            System.out.println("Test 2 -> " + e.getMessage());
        }
        // 3. Withdraw valid amount that drops below $100
        try {
            ca.withdraw(150);
        } catch (AccountException e) {
            System.out.println("Test 3 -> " + e.getMessage());
        }
        // 4. Successful deposit and withdraw
        try {
            ca.deposit(300);
            ca.withdraw(50);
            System.out.println("Test 4 -> Success. Balance = " + ca.getBalance());
        } catch (Exception e) {
            System.out.println("Test 4 failed: " + e.getMessage());
        }
    }
}
