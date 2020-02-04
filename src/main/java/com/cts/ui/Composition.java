package com.cts.ui;

import javax.persistence.EntityManager;

import com.cts.demo.util.JPAUtil;
import com.cts.model2.Address;
import com.cts.model2.Faculty;

public class Composition {

	public static void main(String[] args) {
	Faculty f=new Faculty("Bindhu",new Address("G123","Meghana Apartments","Banglore,Karnataka"));
	
	EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
	em.getTransaction().begin();
	em.persist(f);
	em.getTransaction().commit();
//	em.flush();
	
	System.out.println("Faculty saved");
	JPAUtil.shutdown();
	}

}
