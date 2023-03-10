package com.capgemini.CheckInMicroservice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.capgemini.CheckInMicroservice.Entity.CheckIn;

@Repository
public interface CheckInRepository extends JpaRepository<CheckIn,Long> {

	CheckIn findByName(String name);

	
}
