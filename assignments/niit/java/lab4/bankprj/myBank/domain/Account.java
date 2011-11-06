/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package assignments.niit.java.lab4.bankprj.myBank.domain;

/**
 *
 * @author gautam
 */
public class Account {

    private double balance;

    public Account(double initBalance) {
        this.balance = initBalance;
    }

    public double getBalance() {
        return balance;
    }
    public boolean deposit(double amt){
        balance+=amt;
        return true;
    }
    public boolean withdraw(double amt){
        if(amt<=balance){
            balance-=amt;
            return true;
        }
        return false;
    }



}
