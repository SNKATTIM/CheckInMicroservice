package com.capgemini.CheckInMicroservice.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capgemini.CheckInMicroservice.Entity.Boarding;
import com.capgemini.CheckInMicroservice.Repository.BoardingRepository;

@Service
public class BoardingServiceImpl implements IBoardingService{
	
	@Autowired
	private BoardingRepository boardingRepository;
	
	@Override
	public List<Boarding> getBoardinglist() {
		return boardingRepository.findAll();
	}
	
	public Boarding getBoardingById(long id) {
		return boardingRepository.findById(id).orElse(null);
	}
	
}
