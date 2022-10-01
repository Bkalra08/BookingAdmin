package com.AdminBooking.BookingAdmin.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AdminBooking.BookingAdmin.DAOlayer.DAOLayer;
import com.AdminBooking.BookingAdmin.Entity.AdminDetails;



@Service
public class ServiceClass implements ClassInterface {
	
	@Autowired
	private DAOLayer repo;

	@Override
	public AdminDetails AddAdminData(AdminDetails details) {
		repo.save(details);
		return details;
	}

	@Override
	public AdminDetails getAdminDetails(int PlaceId) {
		return repo.findById(PlaceId);
	}

	@Override
	public AdminDetails findById(int PlaceId) {
		return repo.findById(PlaceId);
	}

	@Override
	public void DeleteAdminDetails(int PlaceId) {
		repo.deleteById(PlaceId);
		
	}


	

}
