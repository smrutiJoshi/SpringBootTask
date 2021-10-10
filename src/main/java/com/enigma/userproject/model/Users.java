package com.enigma.userproject.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "users")
public class Users {

	@JsonProperty("userID")
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Id
	@Column(name = "userID", updatable = false, nullable = false)
	private UUID userID;

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Users(UUID userID, String username, String occupation, int age, float ratings) {
		super();
		this.userID = userID;
		this.username = username;
		this.occupation = occupation;
		this.age = age;
		this.ratings = ratings;
	}

	@Column(name = "username", nullable = false)
	@JsonProperty("username")
	private String username;

	@Column(name = "occupation", nullable = false)
	@JsonProperty("occupation")
	private String occupation;

	@Column(name = "age")
	@JsonProperty("age")
	private int age;

	@Column(name = "ratings", nullable = false)
	@JsonProperty("ratings")
	private float ratings;

	// Getters and Setters
	@JsonProperty("userID")

	public void setUserID(UUID userID) {
		this.userID = userID;
	}

	@JsonProperty("userID")
	public UUID getUserID() {
		return userID;
	}

	@JsonProperty("username")
	public String getUsername() {
		return username;
	}

	@JsonProperty("username")
	public void setUsername(String username) {
		this.username = username;
	}

	@JsonProperty("occupation")
	public String getOccupation() {
		return occupation;
	}

	@JsonProperty("occupation")
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	@JsonProperty("age")
	public int getAge() {
		return age;
	}

	@JsonProperty("age")
	public void setAge(int age) {
		this.age = age;
	}

	@JsonProperty("ratings")
	public float getRatings() {
		return ratings;
	}

	@JsonProperty("ratings")
	public void setRatings(float ratings) {
		this.ratings = ratings;
	}

}
