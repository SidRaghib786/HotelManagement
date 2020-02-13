package com.raghib.hotel.service;

import com.raghib.hotel.dto.RegistrationRequestDto;
import com.raghib.hotel.dto.RegistrationResponseDto;

public interface RegistrationService {
	
	public RegistrationResponseDto register(RegistrationRequestDto registrationRequestDto);

}
