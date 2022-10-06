package com.AdminBooking.BookingAdmin.Services;

import java.util.List;

import com.AdminBooking.BookingAdmin.Entity.AdminDetails;

public interface ClassInterface {
	public AdminDetails AddAdminData(AdminDetails details);
	public AdminDetails getAdminDetails(long PlaceId);
	public AdminDetails findById(long PlaceId);
	void DeleteAdminDetails (long PlaceId);
	public List<AdminDetails> getAllAdminDetails();
	public void updateBike(long PlaceId , AdminDetails Adetails);
	public void updateCar(long PlaceId , AdminDetails Addetails);

}
