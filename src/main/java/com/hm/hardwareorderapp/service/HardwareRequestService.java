package com.hm.hardwareorderapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hm.hardwareorderapp.dto.HardwareRequestDTO;
import com.hm.hardwareorderapp.model.HardwareRequest;
import com.hm.hardwareorderapp.repository.HardwareRequestRepository;

@Service
public class HardwareRequestService implements IHardwareRequestService {
	

	@Autowired
	public HardwareRequestRepository hardwareRequestRepository;
	
	@Override
	public List<HardwareRequest> getAllRequests() {
		List<HardwareRequest> requestList = hardwareRequestRepository.findAll();
		if (requestList.isEmpty()) {
			return null;
		}
		return requestList;
	}

	@Override
	public HardwareRequest getUserDataByUserId(Integer userId) {
		return hardwareRequestRepository.findByUserId(userId).orElse(null);
	}
	
	@Override
	public HardwareRequest updateStatusById(Integer id, HardwareRequestDTO hardwareRequestDTO) {
		HardwareRequest requestData = this.getUserDataByUserId(id);
		requestData.updateStatusById(hardwareRequestDTO);
		return hardwareRequestRepository.save(requestData);
	}

}
