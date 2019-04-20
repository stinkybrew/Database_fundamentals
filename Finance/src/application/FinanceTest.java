package application;

import dao.Dao;
import entity.Category;

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
        
        // Generate a savings account with a € 400.00 balance.
        
        Account acc1 = new Account(1, "");
	}
}


