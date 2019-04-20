package application;

import entity.*;
import dao.*;
import dao.*;
import dao.*;
public class FinanceApp {    

    public static void main(String[] args) {
    	
    	Dao dao = new Dao();
        Transactions l1 = new Transactions(1, 1000, "testi", 1, 1, 1, 0);
        dao.saveTransactions(l1);
        System.out.println("Transactions saved.");
        
        //l1 = null; // forget last values
        Account l2 = new Account(1, "Wille", 1000);
        dao.saveAccount(l2);
        System.out.println("Account saved.");  
        
        Category l3 = new Category();
        dao.saveCategory(l3);
        System.out.println("Category saved.");
        
      // Modify the annotations in the Device class to force auto-generation of the primary key
      // values. Verify the correct functioning at the database level.
        
        
    }
}

