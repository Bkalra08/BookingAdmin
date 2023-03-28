package com.AdminBooking.BookingAdmin.Services;

import java.util.List;

import com.AdminBooking.BookingAdmin.Entity.AdminDetails;

public interface ClassInterface {
	public AdminDetails AddAdminData(AdminDetails details);
	public AdminDetails getAdminDetails(String ownerId);
	public AdminDetails findById(String ownerId);
	void DeleteAdminDetails (String ownerId);
	public List<AdminDetails> getAllAdminDetails();
	public void updateBike(String ownerId , AdminDetails Adetails);
	public void updateCar(String ownerId , AdminDetails Addetails);

}
