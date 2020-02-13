package com.raghib.hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.raghib.hotel.dto.RegistrationRequestDto;
import com.raghib.hotel.dto.RegistrationResponseDto;
import com.raghib.hotel.service.RegistrationService;

import lombok.extern.slf4j.Slf4j;

@CrossOrigin(allowedHeaders = { "*", "*/" }, origins = { "*", "*/" })
@RestController
@RequestMapping("/registration")
@Slf4j
public class RegistrationController {
	
	@Autowired
	RegistrationService registrationService;
	
	@PostMapping
	public ResponseEntity<RegistrationResponseDto> register(@RequestBody RegistrationRequestDto registrationRequestDto)
	{
		
		return ResponseEntity.ok().body(registrationService.register(registrationRequestDto));
		
	}

}
