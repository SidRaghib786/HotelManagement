package com.raghib.hotel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.raghib.hotel.constant.ApplicationConstant;
import com.raghib.hotel.dto.CityResponseDto;
import com.raghib.hotel.entity.City;
import com.raghib.hotel.exception.NotFoundException;
import com.raghib.hotel.repository.CityRepository;

public class CityServiceImpl implements CityService {

	@Autowired
	CityRepository cityRepository;

	@Override
	public CityResponseDto getAllCities() {

		List<City> list = cityRepository.findAll();
		if (list.isEmpty()) {
			throw new NotFoundException(ApplicationConstant.NOT_FOUND);
		} else {
			CityResponseDto cityResponseDto = new CityResponseDto();
			cityResponseDto.setStatusCOde(ApplicationConstant.SUCCESS_CODE);
			cityResponseDto.setMessage(ApplicationConstant.FOUND);
			cityResponseDto.setCityList(list);
			return cityResponseDto;
		}

	}

}
