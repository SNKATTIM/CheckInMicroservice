package com.capgemini.CheckInMicroservice.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.capgemini.CheckInMicroservice.Entity.Seating;

import com.capgemini.CheckInMicroservice.Service.SeatingServiceImpl;

@RestController
@RequestMapping("/api/seating")

public class SeatingController {

	@Autowired
	public SeatingServiceImpl seatingImpl;
	
	@GetMapping("/getall")
	public List<Seating> findAllSeating(){
		return seatingImpl.getSeating();
	}
	@GetMapping("/getById/{id}")
	public Seating findSeatingById(@PathVariable long id) {
		return seatingImpl.getSeatingById(id);
	}
	
	
}
