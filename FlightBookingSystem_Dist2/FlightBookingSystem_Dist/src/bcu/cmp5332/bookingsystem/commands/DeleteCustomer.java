package bcu.cmp5332.bookingsystem.commands;


import bcu.cmp5332.bookingsystem.main.FlightBookingSystemException;

import bcu.cmp5332.bookingsystem.model.FlightBookingSystem;

public class DeleteCustomer implements Command {
	private final int id;
	public DeleteCustomer(int id) {
		this.id = id ;
	}
	 public void execute(FlightBookingSystem flightBookingSystem) throws FlightBookingSystemException {
		 flightBookingSystem.deleteCustomer(id);
		System.out.println("Customer detail Deleted successfully");
	 }
	
}
