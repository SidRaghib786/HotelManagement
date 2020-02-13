package com.raghib.hotel.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raghib.hotel.dto.LoginRequestDto;
import com.raghib.hotel.dto.LoginResponseDto;
import com.raghib.hotel.exception.NotFoundException;
import com.raghib.hotel.service.LoginService;

import lombok.extern.slf4j.Slf4j;

@CrossOrigin(allowedHeaders = { "*", "*/" }, origins = { "*", "*/" })
@RestController
@RequestMapping("/login")
@Slf4j
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@PostMapping
	public ResponseEntity<LoginResponseDto> authenticateCustomer(@Valid @RequestBody LoginRequestDto loginRequestDto)
			throws NotFoundException {
		
		return ResponseEntity.ok().body(loginService.authenticateCustomer(loginRequestDto));
	}

}
