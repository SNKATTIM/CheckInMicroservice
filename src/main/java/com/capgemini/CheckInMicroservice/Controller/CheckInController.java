package com.capgemini.CheckInMicroservice.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.CheckInMicroservice.Entity.CheckIn;
import com.capgemini.CheckInMicroservice.Service.CheckInServiceImpl;

@RestController
@RequestMapping("/api/checkin")

public class CheckInController {
	
	@Autowired
	public CheckInServiceImpl checkinImpl;
	
	@PostMapping("/addCheckIn")
    public CheckIn addCheckIn(@RequestBody CheckIn checkin){
    	return checkinImpl.saveCheckIn(checkin);
    }
	@PostMapping("/addCheckIns")
    public List<CheckIn> addCheckIn(@RequestBody List<CheckIn> checkin){
    	return checkinImpl.saveCheckIn(checkin);
    }	
	@GetMapping("/getall")
	public List<CheckIn> findAllCheckIns(){
		return checkinImpl.getCheckIn();
	}
	@GetMapping("/getById/{id}")
	public CheckIn findCheckInById(@PathVariable long id) {
		return checkinImpl.getCheckInById(id);
	}
	@GetMapping("/getByName/{name}")
	public CheckIn findCheckInByName(@PathVariable String name) {
		return checkinImpl.getCheckInByName(name);
	}
	@PutMapping("/update")
    public CheckIn updateCheckIn(@RequestBody CheckIn checkin){
    	return checkinImpl.saveCheckIn(checkin);
    }
	

}
