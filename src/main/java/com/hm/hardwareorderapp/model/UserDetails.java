package com.hm.hardwareorderapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "user_details")
@ToString
@RequiredArgsConstructor
public class UserDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int id;
	
	@Column(name = "user_name")
	public String userName;
	
	@Column(name = "first_name")
	public String firstName;
	
	@Column(name = "designation")
	public int designation;
	
	@Column(name = "email_address")
	public String emailAddress;
	
	@Column(name = "address")
	public String address;
	
	@Column(name = "user_password")
	public String userPassword;
	
	@Column(name = "manager")
	public int manager;

}
