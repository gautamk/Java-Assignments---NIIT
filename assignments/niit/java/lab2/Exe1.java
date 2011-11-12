/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package assignments.niit.java.lab2;

/**
 *
 * @author gautam
 */
public class Exe1 {

    public static void main(String [] args){
        Account acct = new Account(50);
        acct.deposit(100);
        acct.withdraw(3);
        System.out.println("Final "+acct);

    }

}
