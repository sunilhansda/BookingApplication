package com.hansda.bookingapplication.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {

	@Id
	private String name;
	private long mobileNumber;
	private String source;
	private String destination;
	private String date;
	private String time;

	public Customer() {
	}

	public Customer(String name, long mobileNumber, String source, String destination, String date, String time) {
		super();
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.source = source;
		this.destination = destination;
		this.date = date;
		this.time = time;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

}
