package com.capgemini.CheckInMicroservice.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CheckIn {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	
	long checkin_id;
	String name;
	String email;
	String bookingcode;
			
	public CheckIn() {
		
	}

	public CheckIn(long id, String name, String email, String bookingcode) {
		super();
		this.checkin_id = id;
		this.name = name;
		this.email = email;
		this.bookingcode = bookingcode;
	}

	public long getId() {
		return checkin_id;
	}

	public void setId(long id) {
		this.checkin_id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getBookingcode() {
		return bookingcode;
	}


	public void setBookingcode(String bookingcode) {
		this.bookingcode = bookingcode;
	}


	@Override
	public String toString() {
		return "CheckIn [id=" + checkin_id + ", name=" + name + ", email=" + email + ", bookingcode=" + bookingcode + "]";
	}

	
}
