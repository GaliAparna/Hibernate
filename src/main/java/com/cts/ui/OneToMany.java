package com.cts.ui;

import java.util.TreeSet;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.cts.demo.util.JPAUtil;
import com.cts.model2.Course;
import com.cts.model2.Trainee;

public class OneToMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course mca=new Course(101,"MCA",new TreeSet<Trainee>());
		Course mba=new Course(102,"MBA",new TreeSet<Trainee>());
		
		mca.getTrainees().add(new Trainee(201,"Aparna",mca));
		mca.getTrainees().add(new Trainee(202,"Anusha",mca));
		mca.getTrainees().add(new Trainee(203,"Aravind",mca));
		
		mba.getTrainees().add(new Trainee(204,"Srinu",mba));
		mba.getTrainees().add(new Trainee(205,"Seetha",mba));
		mba.getTrainees().add(new Trainee(206,"harsha",mba));
		EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction t=em.getTransaction();
		t.begin();
		em.persist(mca);
		em.persist(mba);
		t.commit();
		
		
		

	}

}
