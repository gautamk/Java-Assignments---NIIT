package assignments.niit.java.lab6.bankprj.batch;

import assignments.niit.java.lab6.bankprj.domain.Account;
import assignments.niit.java.lab6.bankprj.domain.Bank;
import assignments.niit.java.lab6.bankprj.domain.Customer;
import assignments.niit.java.lab6.bankprj.domain.SavingsAccount;

public class AccumulateSavingsBatch {
    
    private Bank bank;
    
    public AccumulateSavingsBatch() {
    }
    
    public Bank getBank() {
        return bank;
    }
    
    public void setBank(Bank bank) {
        this.bank = bank;
    }
    
    public void doBatch() {
        
        // For each customer...
        for ( int cust_idx = 0;
        cust_idx < bank.getNumOfCustomers();
        cust_idx++ ) {
            Customer customer = bank.getCustomer(cust_idx);
            
            // For each account for this customer...
            for ( int acct_idx = 0;
            acct_idx < customer.getNumOfAccounts();
            acct_idx++ ) {
                Account account = customer.getAccount(acct_idx);
                String  account_type = "";
                
                // Determine the account type
                if ( account instanceof SavingsAccount ) {
                    SavingsAccount savings = (SavingsAccount) account;
                    savings.accumulateInterest();
                } else {
                    // ignore all other account types
                }
            }
        }
    }
}
