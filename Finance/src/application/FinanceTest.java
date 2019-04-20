package application;
import java.util.*;
import dao.Dao;
import entity.Account;
import entity.Category;
import entity.Transactions;

public class FinanceTest {

	public static void main(String[] args) {
		// Generate a few categories (food, leisure, school, gifts, internal transfer etc.).
		Dao dao = new Dao();
		
        Category cat1 = new Category(1, "food");
        Category cat2 = new Category(2, "leisure");
        Category cat3 = new Category(3, "school");
        Category cat4 = new Category(4, "gifts");
        dao.saveCategory(cat1);
        dao.saveCategory(cat2);
        dao.saveCategory(cat3);
        dao.saveCategory(cat4);
        System.out.println("Categorys saved.");
        
        // Receive a gift of € 100.00 from Aunt Mary to the savings account. (The source
        //account should be null.)
        
        Account acc1 = new Account(1, "savings", 400.00);
        Account acc2 = new Account(2, "wallet", 14.50);
        Account acc3 = new Account(3, "Aunt Mary", 100.00);
        dao.saveAccount(acc1);
        dao.saveAccount(acc2);
        dao.saveAccount(acc3);
        System.out.println("Accounts saved.");
        
        Account a1 = new Account(1, "savings", new ArrayList<Transactions>());
        
        Transactions tran1 = new Transactions();
	}
}


