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
	private String ownerId;
	private Owner ownerdetails;
	private PhotoDetails details;
	private ticketsCollection tickets;
	
}
