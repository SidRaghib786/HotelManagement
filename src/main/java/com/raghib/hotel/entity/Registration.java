package com.raghib.hotel.entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Registration {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer registrationId;
	private String name;
	private Integer Age;
	private String emailId;
	private String password;
	private String mobileNumber;
	
	@Embedded
	private Address address;

}
