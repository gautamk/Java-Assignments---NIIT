/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package assignments.niit.java.lab1.bankprj;

/**
 *
 * @author gautam
 */
public class TestAccount {

    public TestAccount() {
     Account ac = new Account(100);
     ac.deposit(50);
     ac.withdraw(147);
     System.out.println("Final account balance is "+ac.getBalance());
    }


}
