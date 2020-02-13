package com.raghib.hotel.service;

import com.raghib.hotel.dto.LoginRequestDto;
import com.raghib.hotel.dto.LoginResponseDto;
import com.raghib.hotel.exception.NotFoundException;

public interface LoginService {
	
	public LoginResponseDto authenticateCustomer(LoginRequestDto loginRequestDto) throws NotFoundException;

}
