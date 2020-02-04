package com.cts.ui;

import java.util.Date;

import javax.persistence.EntityManager;

import com.cts.demo.util.JPAUtil;
import com.cts.model.Student;
import com.cts.model.StudentIdentity;

public class ExampleForCompositePK {

	public static void main(String[] args) {
		Student s=new Student(new StudentIdentity(1,'A',7),"Aparna", "Anusha",new Date(2000,5,5));
		EntityManager em= JPAUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.persist(s);
		em.getTransaction().commit();
		System.out.println("student saved");
		JPAUtil.shutdown();
		
		

	}

}
