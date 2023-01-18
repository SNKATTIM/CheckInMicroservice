package com.capgemini.CheckInMicroservice.Service;

import java.util.List;
import com.capgemini.CheckInMicroservice.Entity.CheckIn;

public interface ICheckInService {

	public List<CheckIn> getCheckInlist();
}


