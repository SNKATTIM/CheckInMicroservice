package com.capgemini.CheckInMicroservice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.capgemini.CheckInMicroservice.Entity.Baggage;

@Repository
public interface BaggageRepository extends JpaRepository<Baggage,Long> {



}
