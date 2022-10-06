package com.AdminBooking.BookingAdmin.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "AdminDataBase")
@Data
@NoArgsConstructor
@AllArgsConstructor


public class AdminDetails {
	
	@Id
	private long placeId;
	private String Address;
	private String fnameofowner;
	private String lnameofowner;
	private String Email;
	private String Password;
	private int BikeSpace;
	private int CarSpace;
	private String ParkingManager;
	private String ParkingPhNo;
	private String ParkingLot;

}
