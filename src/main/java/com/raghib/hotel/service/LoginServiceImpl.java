package com.raghib.hotel.service;

import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import com.raghib.hotel.constant.ApplicationConstant;
import com.raghib.hotel.dto.LoginRequestDto;
import com.raghib.hotel.dto.LoginResponseDto;
import com.raghib.hotel.entity.Registration;
import com.raghib.hotel.exception.NotFoundException;
import com.raghib.hotel.repository.RegistrationRepository;

public class LoginServiceImpl implements LoginService {

	@Autowired
	RegistrationRepository registrationRepository;

	@Override
	public LoginResponseDto authenticateCustomer(LoginRequestDto loginRequestDto) throws NotFoundException {

		Optional<Registration> registration = registrationRepository
				.findByMobileNumberAndPassword(loginRequestDto.getMobileNumber(), loginRequestDto.getPassword());
		if (registration.isPresent()) {
			LoginResponseDto loginResponseDto = new LoginResponseDto();
			BeanUtils.copyProperties(registration.get(), loginResponseDto);
			loginResponseDto.setName(registration.get().getName());
			loginResponseDto.setMessage(ApplicationConstant.LOGIN_SUCCESS);
			loginResponseDto.setStatusCode(ApplicationConstant.SUCCESS_CODE);
			return loginResponseDto;
		} else {
			throw new NotFoundException(ApplicationConstant.NOT_FOUND);
		}

	}

}
