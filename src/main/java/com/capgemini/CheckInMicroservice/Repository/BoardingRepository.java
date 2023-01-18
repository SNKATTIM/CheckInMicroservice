package com.capgemini.CheckInMicroservice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.CheckInMicroservice.Entity.Boarding;

@Repository
public interface BoardingRepository extends JpaRepository<Boarding,Long>{

}
