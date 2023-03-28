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
	public AdminDetails getAdminDetails(String ownerId) {
		return repo.findById(ownerId).orElseThrow(() -> new RuntimeException("AdminDetails not found"));
	}

	@Override
	public AdminDetails findById(String ownerId) {
		return repo.findById(ownerId).orElseThrow(() -> new RuntimeException("AdminDetails not found"));
	}

	@Override
	public void DeleteAdminDetails(String ownerId) {
		repo.deleteById(ownerId);
		
	}

	@Override
	public List<AdminDetails> getAllAdminDetails() {
		return repo.findAll();
	}

	@Override
	public void updateBike(String ownerId, AdminDetails Adetails) {
		Optional<AdminDetails>AdminById  = Optional.of(repo.findById(ownerId)).orElseThrow(() -> new RuntimeException("AdminDetails not found"));
		AdminDetails AdminUpdate = AdminById.get();
		AdminUpdate.setBikeSpace(Adetails.getBikeSpace());
		repo.save(AdminUpdate);
	
		
	}

	@Override
	public void updateCar(String ownerId, AdminDetails Addetails) {
		Optional<AdminDetails>AdminById  = Optional.of(repo.findById(ownerId)).orElseThrow(() -> new RuntimeException("AdminDetails not found"));
		AdminDetails AdminUpdated = AdminById.get();
		AdminUpdated.setCarSpace(Addetails.getCarSpace());
		repo.save(AdminUpdated);
	
		
	}

	public void updatephoto(String ownerId, AdminDetails incdetails) {
		Optional<AdminDetails>AdminById  = Optional.of(repo.findById(ownerId)).orElseThrow(() -> new RuntimeException("AdminDetails not found"));
		AdminDetails AdminUpdated = AdminById.get();
		AdminUpdated.setDetails(incdetails.getDetails());
		repo.save(AdminUpdated);
	
		
	}


//	@Override
//	public void updateBike(long PlaceId, AdminDetails Adetails) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void updateCar(long PlaceId, AdminDetails Addetails) {
//		// TODO Auto-generated method stub
//		
//	}


	

}
