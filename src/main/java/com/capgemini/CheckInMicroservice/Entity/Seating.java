package com.capgemini.CheckInMicroservice.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Seating {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	
	long seating_id;
	int seatnumber;
	String status;
	
	
	public Seating() {
		
	}


	public Seating(long id, int seatnumber, String status) {
		super();
		this.seating_id = id;
		this.seatnumber = seatnumber;
		this.status = status;
	}


	public long getId() {
		return seating_id;
	}


	public void setId(long id) {
		this.seating_id = id;
	}


	public int getSeatnumber() {
		return seatnumber;
	}


	public void setSeatnumber(int seatnumber) {
		this.seatnumber = seatnumber;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	@Override
	public String toString() {
		return "Seating [id=" + seating_id + ", seatnumber=" + seatnumber + ", status=" + status + "]";
	}

	
	
}
