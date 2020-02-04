package com.cts.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.cts.demo.util.JPAUtil;
import com.cts.model2.BankAccount;
import com.cts.model2.Customer;

public class OneToOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount ba=new BankAccount();
		Customer cs=new Customer("9849075668","Suda",ba);
		ba.setAccno("SB00015405");
		ba.setCustomer(cs);
		EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction t=em.getTransaction();
		t.begin();
		em.persist(cs);
		t.commit();
		JPAUtil.shutdown();
		

	}

}
