package com.uj.user.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userId;

	private String firstName;

	private String lastName;

	private String profession;

	public User() {

	}

	public User(Integer userId, String firstName, String lastName, String profession) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.profession = profession;
	}

	public Integer getUserId() {
		return userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getProfession() {
		return profession;
	}

}
