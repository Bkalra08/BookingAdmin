package com.AdminBooking.BookingAdmin.Services;

import java.util.List;

import com.AdminBooking.BookingAdmin.Entity.AdminDetails;

public interface ClassInterface {
	public AdminDetails AddAdminData(AdminDetails details);
	public AdminDetails getAdminDetails(int PlaceId);
	public AdminDetails findById(int PlaceId);
	void DeleteAdminDetails (int PlaceId);
	public List<AdminDetails> getAllAdminDetails();
	public void updateBike(int PlaceId , AdminDetails Adetails);
	public void updateCar(int PlaceId , AdminDetails Addetails);

}
