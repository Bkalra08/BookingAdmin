package com.AdminBooking.BookingAdmin.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AdminBooking.BookingAdmin.DAOlayer.DAOLayer;
import com.AdminBooking.BookingAdmin.Entity.AdminDetails;
import com.AdminBooking.BookingAdmin.Entity.Owner;

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
		AdminDetails adminDetails = repo.findById(ownerId)
				.orElseThrow(() -> new RuntimeException("AdminDetails not found"));
		AdminDetails updatedAdminDetails = new AdminDetails();
		updatedAdminDetails.setOwnerId(adminDetails.getOwnerId());
		updatedAdminDetails.setOwnerdetails(adminDetails.getOwnerdetails());

		return updatedAdminDetails;
	}

	@Override
	public List<AdminDetails> getAllAdminDetailsNoImage() {
		List<AdminDetails> allAdminDetails = repo.findAll();

		for (AdminDetails adminDetails : allAdminDetails) {
			Owner ownerDetails = adminDetails.getOwnerdetails();
			adminDetails.setDetails(null); // Set PhotoDetails to null
		}

		return allAdminDetails;
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
		Optional<AdminDetails> adminById = repo.findById(ownerId);
		if (adminById.isPresent()) {
			AdminDetails adminUpdate = adminById.get();
			Owner ownerDetails = adminUpdate.getOwnerdetails();
			ownerDetails.setBikeSpace(Adetails.getOwnerdetails().getBikeSpace());
			repo.save(adminUpdate);
		} else {
			throw new RuntimeException("AdminDetails not found");
		}
	}

	@Override
	public void updateCar(String ownerId, AdminDetails Addetails) {
		Optional<AdminDetails> adminById = repo.findById(ownerId);
		if (adminById.isPresent()) {
			AdminDetails adminUpdated = adminById.get();
			Owner ownerDetails = adminUpdated.getOwnerdetails();
			ownerDetails.setCarSpace(Addetails.getOwnerdetails().getCarSpace());
			repo.save(adminUpdated);
		} else {
			throw new RuntimeException("AdminDetails not found");
		}
	}

	public void updatephoto(String ownerId, AdminDetails incdetails) {
		Optional<AdminDetails> AdminById = Optional.of(repo.findById(ownerId))
				.orElseThrow(() -> new RuntimeException("AdminDetails not found"));
		AdminDetails AdminUpdated = AdminById.get();
		AdminUpdated.setDetails(incdetails.getDetails());
		repo.save(AdminUpdated);
	}
}