package com.AdminBooking.BookingAdmin.DAOlayer;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.AdminBooking.BookingAdmin.Entity.AdminDetails;




@Repository
public interface DAOLayer extends MongoRepository<AdminDetails, String> {
	
	Optional<AdminDetails> findById(String ownerId);

}
