package com.cts.ui;

import javax.persistence.EntityManager;

import com.cts.demo.util.JPAUtil;
import com.cts.model2.ContractEmployee;
import com.cts.model2.Employee;
import com.cts.model2.Manager;

public class Example2 {

	public static void main(String[] args) {
		Employee e=new Employee(11,"Aparna",3000);
		Manager m=new Manager(12,"Aravind",43599,9500);
		ContractEmployee ce=new ContractEmployee(13,"Anusha",45300,11);
		EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.persist(e);
		em.persist(m);
		em.persist(ce);
		em.getTransaction().commit();
		System.out.println("All records Saved");
		JPAUtil.shutdown();
	}

}
