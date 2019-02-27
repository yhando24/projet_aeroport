package model.EntityManager;


import javax.persistence.EntityManager;

import javax.persistence.Persistence;

public class DatabaseHandle {

	// Create an EntityManagerFactory when you start the application.
	private static EntityManager entityManager;
	
	public static synchronized EntityManager getEntityManagerFactory()
	{
		if (entityManager == null || !entityManager.isOpen())
		{
			entityManager = Persistence.createEntityManagerFactory("tp_aeroport").createEntityManager();
		}
		
		return entityManager;
	}
	
	

}