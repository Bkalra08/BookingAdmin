package com.AdminBooking.BookingAdmin.DAOlayer;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.AdminBooking.BookingAdmin.Entity.AdminDetails;
import com.AdminBooking.BookingAdmin.Entity.Owner;




@Repository
public interface DAOLayer extends MongoRepository<AdminDetails, String> {
    AdminDetails save(AdminDetails adminDetails);
    
    Optional<AdminDetails> findById(String ownerId);
    
    void deleteById(String ownerId);
    
    List<AdminDetails> findAll();
}