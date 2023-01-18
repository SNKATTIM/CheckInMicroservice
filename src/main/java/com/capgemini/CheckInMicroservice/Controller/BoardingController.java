package com.capgemini.CheckInMicroservice.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.CheckInMicroservice.Entity.Boarding;
import com.capgemini.CheckInMicroservice.Service.BoardingServiceImpl;

@RestController
@RequestMapping("/api/boarding")

public class BoardingController {

	@Autowired
	public BoardingServiceImpl boardingImpl;
	
	@GetMapping("/getall")
	public List<Boarding> getAll(){
		return boardingImpl.getBoardinglist();		
	}
	@GetMapping("/getById/{id}")
	public Boarding findBoardingById(@PathVariable long id) {
		return boardingImpl.getBoardingById(id);
	}
	
}
