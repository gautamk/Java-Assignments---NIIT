/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package assignments.niit.java.lab2;

/**
 *
 * @author gautam
 */
public class Account {
    private double balance;

    public Account(double initbalance) {
        this.balance = initbalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amt){
        balance +=amt;
    }
    public void withdraw(double amt){
        if(amt > balance){
            System.out.println("Cannot Withdraw an amount greater than balance");
        }else {
            balance -=amt;
        }
    }
    @Override
    public String toString(){
        return "Account Balance is "+balance;
    }
}
