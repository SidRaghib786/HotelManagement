package com.raghib.hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raghib.hotel.dto.CityResponseDto;
import com.raghib.hotel.service.CityService;

import lombok.extern.slf4j.Slf4j;

@CrossOrigin(allowedHeaders = { "*", "*/" }, origins = { "*", "*/" })
@RestController
@RequestMapping("/registration")
@Slf4j
public class CityController {
	
	@Autowired
	CityService cityService;
	
	
	
	public ResponseEntity<CityResponseDto> getAllCities()
	{
		return ResponseEntity.ok().body(cityService.getAllCities());
	}

}
