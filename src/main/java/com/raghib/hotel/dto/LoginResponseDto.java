package com.raghib.hotel.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginResponseDto {
	
	private Integer statusCode;
	private String name;
	private String message;

}
