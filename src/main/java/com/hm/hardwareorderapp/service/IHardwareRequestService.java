package com.hm.hardwareorderapp.service;

import java.util.List;

import javax.validation.Valid;

import com.hm.hardwareorderapp.dto.HardwareRequestDTO;
import com.hm.hardwareorderapp.model.HardwareRequest;

public interface IHardwareRequestService {
	
	List<HardwareRequest> getAllRequests();

	HardwareRequest getUserDataByUserId(Integer userId);

	HardwareRequest updateStatusById(Integer id, HardwareRequestDTO hardwareRequestDTO);

}
