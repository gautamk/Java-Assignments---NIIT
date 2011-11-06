package assignments.niit.java.lab5.bankPrj.domain;

public class Account {

    private double balance;

    public Account(double initBalance) {
        balance = initBalance;
    }

    public double getBalance() {
        return balance;
    }

    public boolean deposit(double amt) {
        balance += amt;
        return true;
    }

    public boolean withdraw(double amt) {

        if ( amt <= balance ) {
            balance -= amt;
            return true;  
        }
        return false;
    }
}
