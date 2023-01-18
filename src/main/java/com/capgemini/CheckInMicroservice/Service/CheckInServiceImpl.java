package com.capgemini.CheckInMicroservice.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.CheckInMicroservice.Entity.CheckIn;
import com.capgemini.CheckInMicroservice.Repository.CheckInRepository;

@Service
public class CheckInServiceImpl{

	@Autowired
	private CheckInRepository checkinRepository;
	
	
	public CheckIn saveCheckIn(CheckIn checkin) {
	return checkinRepository.save(checkin);
	}
	
	public List<CheckIn> saveCheckIn(List<CheckIn> checkin) {
		return checkinRepository.saveAll(checkin);
		}
	
	
	public List<CheckIn> getCheckIn(){
		return checkinRepository.findAll();
	}
	
	public CheckIn getCheckInById(long id){
		return checkinRepository.findById(id).orElse(null);
	}
	
	public CheckIn getCheckInByName(String name){
		return checkinRepository.findByName(name);
	}
	
	public CheckIn update(CheckIn checkin) throws NoSuchElementException {
        Optional< CheckIn> chkin=checkinRepository.findById(checkin.getId());
        if(chkin.isPresent())
        {
        	CheckIn existingCheckIn=checkinRepository.findById(checkin.getId()).orElse(null);
    		existingCheckIn.setName(checkin.getName());
    		existingCheckIn.setEmail(checkin.getEmail());
    		existingCheckIn.setBookingcode(checkin.getBookingcode());
    		return checkinRepository.save(existingCheckIn);
        }
        else
        {
            CheckIn check=checkinRepository.save(checkin);
            return check;
        }
        
	}
	
}
