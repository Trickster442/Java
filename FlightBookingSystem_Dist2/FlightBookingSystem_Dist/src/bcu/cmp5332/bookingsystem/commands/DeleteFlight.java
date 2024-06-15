package bcu.cmp5332.bookingsystem.commands;


import bcu.cmp5332.bookingsystem.main.FlightBookingSystemException;

import bcu.cmp5332.bookingsystem.model.FlightBookingSystem;

public class DeleteFlight implements Command {
	private final int id;
	public DeleteFlight(int id) {
		this.id = id ;
	}
	 public void execute(FlightBookingSystem flightBookingSystem) throws FlightBookingSystemException {
		 flightBookingSystem.deleteFlight(id);
		System.out.println("Flight details Deleted successfully");
	 }
	
}
