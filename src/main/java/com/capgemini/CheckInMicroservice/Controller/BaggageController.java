package com.capgemini.CheckInMicroservice.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.capgemini.CheckInMicroservice.Entity.Baggage;
import com.capgemini.CheckInMicroservice.Service.BaggageServiceImpl;


@RestController
@RequestMapping("/api/baggage")

public class BaggageController {

	@Autowired
	public BaggageServiceImpl baggageImpl;
	
	@PostMapping("/addbaggage")
    public Baggage addBaggage(@RequestBody Baggage baggage){
    	return baggageImpl.saveBaggage(baggage);
    }
	
	@GetMapping("/getall")
	public List<Baggage> getAll(){
	return baggageImpl.getBaggagelist();
	}
	@GetMapping("/get/{id}")
	public Baggage findBaggageById(@PathVariable long id) {
		return baggageImpl.getBaggageById(id);
	}
}
