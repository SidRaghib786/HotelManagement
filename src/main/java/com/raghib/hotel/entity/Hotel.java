package com.raghib.hotel.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Hotel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer hotelId;
	private String hotelName;
	private Double Price;
	private Integer room_Numbers;
	private Integer sharing_Number;
	private String availabilityStatus;
	private LocalDate date;
	private Integer locationId;
	
	
	
	
	

}
