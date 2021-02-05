package com.hm.hardwareorderapp.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hm.hardwareorderapp.model.HardwareRequest;

public interface HardwareRequestRepository extends JpaRepository<HardwareRequest, Integer>{
	
	@Query(value = "SELECT * FROM hw_request_order where user_id=:userId", nativeQuery = true)
	Optional<HardwareRequest> findByUserId(Integer userId);

}
