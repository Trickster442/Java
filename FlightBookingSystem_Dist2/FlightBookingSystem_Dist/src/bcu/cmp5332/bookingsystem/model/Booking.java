package bcu.cmp5332.bookingsystem.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Booking {
    
    private Customer customer;
    private Flight flight;
    private LocalDate bookingDate;
    

    public Booking(Customer customer, Flight flight, LocalDate bookingDate) {
        // TODO: implementation here
        this.customer = customer;
        this.flight = flight;
        this.bookingDate = bookingDate;
    }
    
    // TODO: implementation of Getter and Setter methods
    public Customer getCustomer() {
    	return customer;
    }
    
    public void setCustomer(Customer newCustomer) {
    	this.customer = newCustomer ;
    }
    
    public Flight getFlight() {
    	return flight;
    }
    
    public void setFlight(Flight newFlight) {
    	this.flight = newFlight ;
    }
    public LocalDate getBookingDate() {
    	return bookingDate;
    }
    
    public void setBookingDate(LocalDate newBookingDate) {
    	this.bookingDate = newBookingDate;
    }
   
}
