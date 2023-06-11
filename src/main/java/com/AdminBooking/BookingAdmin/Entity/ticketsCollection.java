package com.AdminBooking.BookingAdmin.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class ticketsCollection {

	private String ticketNumber;
	private String ticketStatus;
	private String ticketId;
	private String ownerId;
	private String userId;
	private String vehicleNumber;
}
