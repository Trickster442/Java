package bcu.cmp5332.bookingsystem.model;

import bcu.cmp5332.bookingsystem.main.FlightBookingSystemException;
import java.time.LocalDate;
import java.util.*;

public class FlightBookingSystem {
    
    private final LocalDate systemDate = LocalDate.parse("2020-11-11");
    
    private final Map<Integer, Customer> customers = new TreeMap<>();
    private final Map<Integer, Flight> flights = new TreeMap<>();
    private final List<Booking> bookings = new ArrayList<Booking>();
    public LocalDate getSystemDate() {
        return systemDate;
    }

    public List<Flight> getFlights() {
        List<Flight> out = new ArrayList<>(flights.values());
        return Collections.unmodifiableList(out);
    }

    public Flight getFlightByID(int id) throws FlightBookingSystemException {
        if (!flights.containsKey(id)) {
            throw new FlightBookingSystemException("There is no flight with that ID.");
        }
        return flights.get(id);
    }

    public Customer getCustomerByID(int id) throws FlightBookingSystemException {
        // TODO: implementation here
    	if (!customers.containsKey(id)) {
            throw new FlightBookingSystemException("There is no customer with that ID.");
        }
        return customers.get(id);
    }

    public void addFlight(Flight flight) throws FlightBookingSystemException {
        if (flights.containsKey(flight.getId())) {
            throw new IllegalArgumentException("Duplicate flight ID.");
        }
        for (Flight existing : flights.values()) {
            if (existing.getFlightNumber().equals(flight.getFlightNumber()) 
                && existing.getDepartureDate().isEqual(flight.getDepartureDate())) {
                throw new FlightBookingSystemException("There is a flight with same "
                        + "number and departure date in the system");
            }
        }
        flights.put(flight.getId(), flight);
    }

    public void addCustomer(Customer customer) throws FlightBookingSystemException{
        // TODO: implementation here
    	if (customers.containsKey(customer.getId())) {
            throw new IllegalArgumentException("Duplicate ID no.");
        }
        for (Customer existing : customers.values()) {
            if (existing.getName().equals(customer.getName()) 
            	&& existing.getPhone().equals(customer.getPhone())){
                throw new FlightBookingSystemException("There is a customer with same "
                        + "name and phone in the system");
            }
        }
        customers.put(customer.getId(), customer);
    }
    
    //list of all customers
    public List<Customer> getCustomers() {
        List<Customer> out = new ArrayList<>(customers.values());
        return Collections.unmodifiableList(out);
    }
    
    public List<Booking> getBookingByCusIDs(int id) throws FlightBookingSystemException{
    	if (!customers.containsKey(id)) {
            throw new FlightBookingSystemException("There is no customer with that ID.");
        }
    	Customer customer = customers.get(id);
    	return customer.getBookings();
    }
    public void deleteFlight(int id) throws FlightBookingSystemException {
        if (!flights.containsKey(id)) {
            throw new FlightBookingSystemException("There is no flight with that ID.");
        }
        flights.remove(id);
    }
    public void deleteCustomer(int id) throws FlightBookingSystemException {
        if (!customers.containsKey(id)) {
            throw new FlightBookingSystemException("There is no Customer with that ID.");
        }
        customers.remove(id);
    }
    
    public void addBooking(Booking booking) throws FlightBookingSystemException{
        // TODO: implementation here
    	Customer customer = booking.getCustomer();
    	Flight flight = booking.getFlight();
    	if (!customers.containsKey(customer.getId())) {
            throw new IllegalArgumentException("Customer unavailable");
        }
    	if (!flights.containsKey(flight.getId())) {
            throw new IllegalArgumentException("Flight Not available");
        }
    	
        for (Booking existing : bookings) {
            if (existing.getCustomer().equals(booking.getCustomer()) 
            	&& existing.getFlight().equals(booking.getFlight())
            	&& existing.getBookingDate().equals(booking.getBookingDate())
            		){
                throw new FlightBookingSystemException("There is a customer with same "
                        + "name and flight and bookingDate in the system");
            }
        }
        bookings.add(booking);
        customer.addBooking(booking);
    }
    
    public List<Booking> getBookings() {
        
        return Collections.unmodifiableList(bookings);
    }
    
    public void addBookingByIds(int cusId, int flightId, LocalDate bookingDate) throws FlightBookingSystemException{
        // TODO: implementation here
    	if (!customers.containsKey(cusId)){
            throw new IllegalArgumentException("Customer with that customer id not available");
        }
    	if (!flights.containsKey(flightId)){
            throw new IllegalArgumentException("Flight with that flight id not available");
        }
        Customer customer = customers.get(cusId);
        Flight flight = flights.get(flightId);
        Booking booking = new Booking(customer, flight, bookingDate);
        bookings.add(booking);
        customer.addBooking(booking);
    }
}
