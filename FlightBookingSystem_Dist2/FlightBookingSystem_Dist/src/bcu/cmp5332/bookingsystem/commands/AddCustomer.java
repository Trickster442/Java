  package bcu.cmp5332.bookingsystem.commands;

import java.util.ArrayList;
import java.util.List;

import bcu.cmp5332.bookingsystem.main.FlightBookingSystemException;
import bcu.cmp5332.bookingsystem.model.Customer;
import bcu.cmp5332.bookingsystem.model.Booking;
import bcu.cmp5332.bookingsystem.model.FlightBookingSystem;

public class AddCustomer implements Command {

    private final String name;
    private final String phone;
    private final List<Booking> bookings;

    public AddCustomer(String name, String phone, List<Booking> bookings) {

        this.name = name;
        this.phone = phone;
        this.bookings = new ArrayList<>();
    }

    @Override
    public void execute(FlightBookingSystem flightBookingSystem) throws FlightBookingSystemException {
    	int maxId = 0;
        if (flightBookingSystem.getCustomers().size() > 0) {
            int lastIndex = flightBookingSystem.getCustomers().size() - 1;
            maxId = flightBookingSystem.getCustomers().get(lastIndex).getId();
        }
        // TODO: implementation here
    	Customer customer = new Customer(++maxId, name, phone, bookings);
    	flightBookingSystem.addCustomer(customer);
    }
}
