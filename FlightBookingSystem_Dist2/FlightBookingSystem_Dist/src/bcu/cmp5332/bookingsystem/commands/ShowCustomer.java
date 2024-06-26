package bcu.cmp5332.bookingsystem.commands;




import bcu.cmp5332.bookingsystem.main.FlightBookingSystemException;
import bcu.cmp5332.bookingsystem.model.Customer;

import bcu.cmp5332.bookingsystem.model.FlightBookingSystem;

public class ShowCustomer implements Command{
	private final int id;
	public ShowCustomer(int id) throws FlightBookingSystemException{
		this.id = id;
	}
	
	@Override
    public void execute(FlightBookingSystem flightBookingSystem) throws FlightBookingSystemException{
		Customer customer = flightBookingSystem.getCustomerByID(id);
		System.out.println(customer.getDetailsShort());
	}
}
