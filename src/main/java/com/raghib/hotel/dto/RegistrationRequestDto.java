package com.raghib.hotel.dto;

import com.raghib.hotel.entity.Address;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegistrationRequestDto {
	
	private String name;
	private String mobileNumber;
	private Integer Age;
	private String password;
	private Address address;
	private String emailId;

}
