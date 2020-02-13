package com.raghib.hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.raghib.hotel.entity.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Integer> {

}
