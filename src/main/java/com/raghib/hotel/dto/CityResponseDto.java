package com.raghib.hotel.dto;

import java.util.List;

import com.raghib.hotel.entity.City;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CityResponseDto {

	private String message;
	private Integer statusCOde;
	private List<City> cityList;

}
