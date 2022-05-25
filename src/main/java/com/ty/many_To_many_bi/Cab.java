package com.ty.many_To_many_bi;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Cab {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id;
	private String drivernName;
	private double cost;
	@ManyToMany(mappedBy = "cabs")
	private List<Person> persons;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDrivernName() {
		return drivernName;
	}

	public void setDrivernName(String drivernName) {
		this.drivernName = drivernName;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public List<Person> getPersons() {
		return persons;
	}

	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}

}
