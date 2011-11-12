/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package assignments.niit.java.lab1.bankprj;

/*
 * Account.java
 *
 * Created on November 9, 2005, 12:46 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
public class Account {
    private double balance;

    /** Creates a new instance of Account
     * @param initBalance
     */
    public Account(double initBalance) {
        balance = initBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amt) {
        balance += amt;
    }

    public void withdraw(double amt) {
        if (balance >= amt) {
            balance -= amt;
        }
    }
}
