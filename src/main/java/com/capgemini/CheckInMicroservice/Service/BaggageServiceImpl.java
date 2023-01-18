package com.capgemini.CheckInMicroservice.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capgemini.CheckInMicroservice.Entity.Baggage;
import com.capgemini.CheckInMicroservice.Repository.BaggageRepository;


@Service
public class BaggageServiceImpl {

	@Autowired
	private BaggageRepository baggageRepository;
	
	public Baggage saveBaggage(Baggage baggage) {
		return baggageRepository.save(baggage);
		}
	
	public List<Baggage> getBaggagelist() { 
		return baggageRepository.findAll();
	}
	
	public Baggage getBaggageById(long id) {
		return baggageRepository.findById(id).orElse(null);
	}
}
