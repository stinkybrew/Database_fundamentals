package dao;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.*;

public class Dao {
	
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("DevPU");
	
	// CREATE DEVICE
		public void saveTransactions(Transactions transactions) {
			EntityManager em = emf.createEntityManager();
			em.getTransaction().begin();
			
	        em.persist(transactions);
	        
	        em.getTransaction().commit();
	        em.close();
		}
		public void saveAccount(Account account) {
			EntityManager em = emf.createEntityManager();
			em.getTransaction().begin();
			
	        em.persist(account);
	        
	        em.getTransaction().commit();
	        em.close();
		}
		public void saveCategory(Category category) {
			EntityManager em = emf.createEntityManager();
			em.getTransaction().begin();
			
	        em.persist(category);
	        
	        em.getTransaction().commit();
	        em.close();
		}
}
