package com.capgemini.CheckInMicroservice.Service;

import java.util.List;

import com.capgemini.CheckInMicroservice.Entity.Baggage;


public interface IBaggageService {
	
	public List<Baggage> getBaggagelist();
}
