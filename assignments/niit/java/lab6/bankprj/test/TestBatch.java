package assignments.niit.java.lab6.bankprj.test;

import assignments.niit.java.lab6.bankprj.batch.AccumulateSavingsBatch;
import assignments.niit.java.lab6.bankprj.domain.Bank;
import assignments.niit.java.lab6.bankprj.domain.CheckingAccount;
import assignments.niit.java.lab6.bankprj.domain.Customer;
import assignments.niit.java.lab6.bankprj.domain.SavingsAccount;
import assignments.niit.java.lab6.bankprj.report.CustomerReport;



public class TestBatch {
    
    public static void main(String[] args) {
        Bank     bank = new Bank();
        initializeCustomers(bank);
        
        // run the customer report
        CustomerReport report = new CustomerReport();
        report.setBank(bank);
        report.generateReport();
        
        // run savings accumulation batch job
        AccumulateSavingsBatch job = new AccumulateSavingsBatch();
        job.setBank(bank);
        job.doBatch();
        System.out.println();
        System.out.println("ACCUMULATE SAVINGS BATCH EXECUTED");
        System.out.println();
        
        // run the customer report again
        report.generateReport();
    }
    
    private static void initializeCustomers(Bank bank) {
        Customer customer;
        
        // Create several customers and their accounts
        bank.addCustomer("Jane", "Simms");
        customer = bank.getCustomer(0);
        customer.addAccount(new SavingsAccount(500.00, 0.03));
        customer.addAccount(new CheckingAccount(200.00, 400.00));
        
        bank.addCustomer("Owen", "Bryant");
        customer = bank.getCustomer(1);
        customer.addAccount(new CheckingAccount(200.00));
        
        bank.addCustomer("Tim", "Soley");
        customer = bank.getCustomer(2);
        customer.addAccount(new SavingsAccount(1500.00, 0.075));
        customer.addAccount(new CheckingAccount(200.00));
        
        bank.addCustomer("Maria", "Soley");
        customer = bank.getCustomer(3);
        // Maria and Tim have a shared checking account
        customer.addAccount(bank.getCustomer(2).getAccount(1));
        customer.addAccount(new SavingsAccount(150.00, 0.05));
    }
}
