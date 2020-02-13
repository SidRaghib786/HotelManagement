package com.raghib.hotel.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.raghib.hotel.constant.ApplicationConstant;
import com.raghib.hotel.dto.RegistrationRequestDto;
import com.raghib.hotel.dto.RegistrationResponseDto;
import com.raghib.hotel.entity.Registration;
import com.raghib.hotel.repository.RegistrationRepository;

public class RegistrationServiceImpl implements RegistrationService {

	@Autowired
	RegistrationRepository registrationRepository;

	@Override
	public RegistrationResponseDto register(RegistrationRequestDto registrationRequestDto) {

		
		Registration registration = new Registration();
		BeanUtils.copyProperties(registrationRequestDto, registration);
		/*
		 * registration.setName(registrationRequestDto.getName());
		 * registration.setAge(registrationRequestDto.getAge());
		 * registration.setEmailId(registrationRequestDto.getEmailId());
		 * registration.setMobileNumber(registrationRequestDto.getMobileNumber());
		 * registration.setPassword(registrationRequestDto.getPassword());
		 * registration.setAddress(registrationRequestDto.getAddress());
		 */
		RegistrationResponseDto regResponseDto = new RegistrationResponseDto();
		registrationRepository.save(registration);
		regResponseDto.setMessage(ApplicationConstant.REGISTRATION_SUCCESS);
		regResponseDto.setStatusCode(ApplicationConstant.SUCCESS_CODE);
		return regResponseDto;

	}

}
