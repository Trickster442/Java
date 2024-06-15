package bcu.cmp5332.bookingsystem.commands;




import bcu.cmp5332.bookingsystem.main.FlightBookingSystemException;
import bcu.cmp5332.bookingsystem.model.Flight;
import bcu.cmp5332.bookingsystem.model.FlightBookingSystem;

public class ShowFlights implements Command{
	private final int id;
	public ShowFlights(int id) throws FlightBookingSystemException{
		this.id = id;
	}
	
	@Override
    public void execute(FlightBookingSystem flightBookingSystem) throws FlightBookingSystemException{
		Flight flight = flightBookingSystem.getFlightByID(id);
		System.out.println(flight.getDetailsShort());
	}
}
