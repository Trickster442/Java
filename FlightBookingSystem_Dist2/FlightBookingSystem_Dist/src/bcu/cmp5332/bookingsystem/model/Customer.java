package bcu.cmp5332.bookingsystem.model;

import bcu.cmp5332.bookingsystem.main.FlightBookingSystemException;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Customer {
    
    private int id;
    private String name;
    private String phone;
    private final List<Booking> bookings = new ArrayList<>();
    
    // TODO: implement constructor here
    public Customer(int id, String name, String phone, List<Booking> bookings) {
    	this.id = id ;
    	this.name = name;
    	this.phone = phone;
    	 
    }
    // TODO: implementation of Getter and Setter methods
    public int getId() {
    	return id;
    }
    
    public void setId(int newId) {
    	this.id = newId;
    }
    
    public String getName() {
    	return name;
    }
    
    public void setName(String newName) {
    	this.name = newName;
    }
    
    public String getPhone() {
    	return phone;
    }
    
    public void setPhone(String newPhone) {
    	this.phone = newPhone;
    }
    
    public List<Booking> getBookings(){
    	return new ArrayList<>(bookings);
    }
    public void addBooking(Booking booking) {
        // TODO: implementation here
    	bookings.add(booking);
    }
    public String getDetailsShort() {
        
        return "Customer #" + id + " - " + name+ " - " + phone;
    }
}
