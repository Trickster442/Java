package bcu.cmp5332.bookingsystem.commands;

import bcu.cmp5332.bookingsystem.main.FlightBookingSystemException;
import bcu.cmp5332.bookingsystem.model.Booking;
import bcu.cmp5332.bookingsystem.model.Customer;
import bcu.cmp5332.bookingsystem.model.Flight;
import bcu.cmp5332.bookingsystem.model.FlightBookingSystem;

import java.util.List;

public class ListBookings implements Command {

    @Override
    public void execute(FlightBookingSystem flightBookingSystem) throws FlightBookingSystemException {
    	List<Booking> bookings = flightBookingSystem.getBookings();

        for (Booking booking : bookings) {
        	Customer customer = booking.getCustomer();
        	Flight flight = booking.getFlight();
            System.out.println("Customer #"+ customer.getId() +" Flight #"+ flight.getId() + " on " + booking.getBookingDate());
        }
        System.out.println(bookings.size() + " booking(s)");
    }
}
