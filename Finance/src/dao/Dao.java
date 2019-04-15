package dao;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.*;

public class Dao {
	
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("DevPU");

}
