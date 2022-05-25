package com.ty.many_To_many_bi;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveCabPersons {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Person person=new Person();
		person.setName("Kumara");
		person.setAge(22);
		person.setEmail("blkumara701@gamil.com");
		
		
		Person person1=new Person();
		person1.setName("Pavan");
		person1.setAge(23);
		person1.setEmail("pavan@gamil.com");
		
		
		Person person2=new Person();
		person2.setName("Naveen");
		person2.setAge(20);
		person2.setEmail("naveen@gamil.com");
		
		
		Cab cab=new Cab();
		cab.setDrivernName("Tejas");
		cab.setCost(500);
		

		Cab cab1=new Cab();
		cab1.setDrivernName("Ravi");
		cab1.setCost(150);
		

		Cab cab2=new Cab();
		cab2.setDrivernName("Nithin");
		cab2.setCost(200);
		
		List<Person> persons=new ArrayList<Person>();
		persons.add(person);
		persons.add(person1);
		persons.add(person2);
		
		List<Person> persons1=new ArrayList<Person>();
		persons1.add(person);
		persons1.add(person1);
		
		List<Person> persons2=new ArrayList<Person>();
		persons2.add(person);
		persons2.add(person2);
		
		
		cab.setPersons(persons);
		cab1.setPersons(persons1);
		cab2.setPersons(persons2);
		
		
		List<Cab> cabs=new ArrayList<Cab>();
		cabs.add(cab);
		cabs.add(cab1);
		cabs.add(cab2);
		
		List<Cab> cabs1=new ArrayList<Cab>();
		cabs1.add(cab);
		cabs1.add(cab1);
		
		List<Cab> cabs2=new ArrayList<Cab>();
		cabs2.add(cab);
		cabs2.add(cab2);
		
		person.setCabs(cabs);
		person1.setCabs(cabs1);
		person2.setCabs(cabs2);
		
		
		
		
		entityTransaction.begin();
		entityManager.persist(cab);		
		entityManager.persist(cab1);		
		entityManager.persist(cab2);		
		entityManager.persist(person);		
		entityManager.persist(person1);		
		entityManager.persist(person2);		
		entityTransaction.commit();
		
		System.out.println("**SAVED**");
		

	}

}
