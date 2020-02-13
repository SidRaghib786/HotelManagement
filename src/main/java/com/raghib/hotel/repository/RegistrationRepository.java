package com.raghib.hotel.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.raghib.hotel.entity.Registration;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration, Integer>{
	
	
	Optional<Registration> findByMobileNumberAndPassword(String mobileNumber, String password);

}
