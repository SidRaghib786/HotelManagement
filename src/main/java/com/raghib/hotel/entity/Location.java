package com.raghib.hotel.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Location {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer locationId;
	private String locationName;
	private Integer hotelId;

}
