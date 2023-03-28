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
	private long ownerId;
	private String fname;
	private String lname;
	private int bikeSpace;
	private int carSpace;
	private String pManager;
	private String pPhNo;
	private String pLotName;
	private String paddress;
	private boolean IsVerified;
	private PhotoDetails details;
	
	
}
