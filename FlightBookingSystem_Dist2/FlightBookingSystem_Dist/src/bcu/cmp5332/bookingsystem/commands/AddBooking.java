  package bcu.cmp5332.bookingsystem.commands;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import bcu.cmp5332.bookingsystem.main.FlightBookingSystemException;
import bcu.cmp5332.bookingsystem.model.Customer;
import bcu.cmp5332.bookingsystem.model.Flight;
import bcu.cmp5332.bookingsystem.model.Booking;
import bcu.cmp5332.bookingsystem.model.FlightBookingSystem;

public class AddBooking implements Command {

    private final int cusId;
    private final int flightId;
    private final LocalDate bookingDate;

    public AddBooking(int cusId, int flightId, LocalDate bookingDate) {

        this.cusId = cusId;
        this.flightId = flightId;
        this.bookingDate = bookingDate;
    }

    @Override
    public void execute(FlightBookingSystem flightBookingSystem) throws FlightBookingSystemException {
    	
    	flightBookingSystem.addBookingByIds(cusId, flightId, bookingDate);
    }
}
