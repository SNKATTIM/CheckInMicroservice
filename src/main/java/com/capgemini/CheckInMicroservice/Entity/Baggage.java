package com.capgemini.CheckInMicroservice.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Baggage {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	long baggage_id;
	
	String PassangerName;
	int No_bags;


   public Baggage() {
		
	}

    public Baggage(long id, String passangerName, int no_bags) {
	super();
	this.baggage_id = id;
	PassangerName = passangerName;
	No_bags = no_bags;
    }

    public long getId() {
	return baggage_id;
    }

    public void setId(long id) {
	this.baggage_id = id;
    }

    public String getPassangerName() {
	return PassangerName;
    }

    public void setPassangerName(String passangerName) {
	PassangerName = passangerName;
    }

    public int getNo_bags() {
	return No_bags;
    }

    public void setNo_bags(int no_bags) {
	No_bags = no_bags;
    }

    @Override
    public String toString() {
	return "Baggage [id=" + baggage_id + ", PassangerName=" + PassangerName + ", No_bags=" + No_bags + "]";
    }
	
	

}
