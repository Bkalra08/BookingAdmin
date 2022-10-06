package com.AdminBooking.BookingAdmin.Services;

import java.util.List;
import java.util.Optional;

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

	@Override
	public List<AdminDetails> getAllAdminDetails() {
		return repo.findAll();
	}

	@Override
	public void updateBike(int PlaceId, AdminDetails Adetails) {
		Optional<AdminDetails>AdminById  = Optional.of(repo.findById(PlaceId));
//		int AdminById = repo.findById(PlaceId);
		AdminDetails AdminUpdate = AdminById.get();
		AdminUpdate.setBikeSpace(Adetails.getBikeSpace());
		repo.save(AdminUpdate);
	
		
	}

	@Override
	public void updateCar(int PlaceId, AdminDetails Addetails) {
		Optional<AdminDetails>AdminById  = Optional.of(repo.findById(PlaceId));
//		int AdminById = repo.findById(PlaceId);
		AdminDetails AdminUpdated = AdminById.get();
		AdminUpdated.setCarSpace(Addetails.getCarSpace());
		repo.save(AdminUpdated);
	
		
	}


	

}
