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
	private int placeId;
	private String Address;
	private int BikeSpace;
	private int CarSpace;
	private String ParkingManager;
	private String ParkingPhNo;

}
