package com.AdminBooking.BookingAdmin.DAOlayer;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.AdminBooking.BookingAdmin.Entity.AdminDetails;




@Repository
public interface DAOLayer extends MongoRepository<AdminDetails, Integer> {
	
	AdminDetails findById(int placeId);

}
