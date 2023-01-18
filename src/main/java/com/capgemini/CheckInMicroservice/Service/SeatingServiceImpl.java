package com.capgemini.CheckInMicroservice.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.CheckInMicroservice.Entity.Seating;
import com.capgemini.CheckInMicroservice.Repository.SeatingRepository;

@Service
public class SeatingServiceImpl {

	@Autowired
	private SeatingRepository seatingrepo;
	
	public List<Seating> getSeating(){
		return seatingrepo.findAll();
	}
	public Seating getSeatingById(long id) {
		return seatingrepo.findById(id).orElse(null);
	}
}
