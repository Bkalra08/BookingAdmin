package com.AdminBooking.BookingAdmin.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Owner {
    private String fname;
    private String lname;
    private int bikeSpace;
    private int carSpace;
    private String paddress;
    private boolean isVerified;
    private String pmanager;
    private String pphNo;
    private String plotName;
}
