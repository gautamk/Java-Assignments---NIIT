package assignments.niit.java.lab5.bankPrj.test;
import assignments.niit.java.lab5.bankPrj.domain.Account;

/**
 *
 * @author gautam
 */
public class TestAccount {

    
    public TestAccount() {
    }

    public static void main(String[] args) {
        Account acct = new Account(100);
        acct.deposit(50);
        acct.withdraw(147);
        System.out.println("Final Account Balance is: " + acct.getBalance());
    }

}
