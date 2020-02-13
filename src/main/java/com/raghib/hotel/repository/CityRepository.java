package com.raghib.hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.raghib.hotel.entity.City;

@Repository
public interface CityRepository extends JpaRepository<City, Integer> {

}
