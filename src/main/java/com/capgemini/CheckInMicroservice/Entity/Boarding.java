package com.capgemini.CheckInMicroservice.Entity;

import java.sql.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Boarding {
 
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	long boarding_id;
	
    String FirstName;
    String FlightName;
    String Origin;
    String Destination;
    Date date;
    int FlightNumber;
    

	public Boarding() {
		
	}


	public Boarding(long id, String firstName, String flightName, String origin, String destination, Date date,
			int flightNumber) {
		super();
		this.boarding_id = id;
		FirstName = firstName;
		FlightName = flightName;
		Origin = origin;
		Destination = destination;
		this.date = date;
		FlightNumber = flightNumber;
	}


	public long getId() {
		return boarding_id;
	}


	public void setId(long id) {
		this.boarding_id = id;
	}


	public String getFirstName() {
		return FirstName;
	}


	public void setFirstName(String firstName) {
		FirstName = firstName;
	}


	public String getFlightName() {
		return FlightName;
	}


	public void setFlightName(String flightName) {
		FlightName = flightName;
	}


	public String getOrigin() {
		return Origin;
	}


	public void setOrigin(String origin) {
		Origin = origin;
	}


	public String getDestination() {
		return Destination;
	}


	public void setDestination(String destination) {
		Destination = destination;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public int getFlightNumber() {
		return FlightNumber;
	}


	public void setFlightNumber(int flightNumber) {
		FlightNumber = flightNumber;
	}


	@Override
	public String toString() {
		return "Boarding [id=" + boarding_id + ", FirstName=" + FirstName + ", FlightName=" + FlightName + ", Origin=" + Origin
				+ ", Destination=" + Destination + ", date=" + date + ", FlightNumber=" + FlightNumber + "]";
	}

	
	
}
