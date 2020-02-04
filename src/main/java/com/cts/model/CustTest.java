package com.cts.model;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cts.demo.util.JPAUtil;


public class CustTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Emp e=new Emp();
		System.out.print("EmpId:");
		e.setEid(sc.nextInt());
		System.out.print("EmpName");
		e.setEname(sc.next());
		
		
		
		EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.persist(e);
		em.getTransaction().commit();
		System.out.println("Emp saved");
		JPAUtil.shutdown();
		sc.close();
	}

}
