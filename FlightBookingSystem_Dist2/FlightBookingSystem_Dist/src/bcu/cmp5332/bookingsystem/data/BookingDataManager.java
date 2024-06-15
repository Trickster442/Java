package bcu.cmp5332.bookingsystem.data;

import bcu.cmp5332.bookingsystem.main.FlightBookingSystemException;
import bcu.cmp5332.bookingsystem.model.Booking;
import bcu.cmp5332.bookingsystem.model.Customer;
import bcu.cmp5332.bookingsystem.model.Flight;
import bcu.cmp5332.bookingsystem.model.FlightBookingSystem;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookingDataManager implements DataManager {
    
    public final String RESOURCE = "../FlightBookingSystem_Dist/FlightBookingSystem_Dist/resources/data/bookings.txt";

    @Override
    public void loadData(FlightBookingSystem fbs) throws IOException, FlightBookingSystemException {
        // TODO: implementation here
    	try (Scanner sc = new Scanner(new File(RESOURCE))) {
            int line_idx = 1;
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] properties = line.split(SEPARATOR, -1);
                try {
                	int id = Integer.parseInt(properties[0]);
                    String name = properties[1];
                    String phone = properties[2];
                    List<Booking> bookings = new ArrayList<>();
                    Customer customer= new Customer(id, name, phone, bookings); 
                    
                    int flightId = Integer.parseInt(properties[3]);
                    String flightNumber = properties[4];
                    String origin = properties[5];
                    String destination = properties[6];
                    LocalDate departureDate = LocalDate.parse(properties[7]);
                    Flight flight = new Flight(flightId, flightNumber, origin, destination, departureDate);
                    
                    LocalDate bookingDate = LocalDate.parse(properties[8]);
                    
                    Booking booking = new Booking(customer, flight, bookingDate);
                    fbs.addBooking(booking);
                    
                } catch (NumberFormatException ex) {
                    throw new FlightBookingSystemException("Unable to parse book id " + properties[0] + " on line " + line_idx
                        + "\nError: " + ex);
                }
                line_idx++;
            }
        }
    	
    }

    @Override
    public void storeData(FlightBookingSystem fbs) throws IOException {
        // TODO: implementation here
    	try (PrintWriter out = new PrintWriter(new FileWriter(RESOURCE))) {
            for (Booking booking : fbs.getBookings()) {
            		Customer customer = booking.getCustomer();
            		out.print(customer.getId() + SEPARATOR);
                    out.print(customer.getName() + SEPARATOR);
                    out.print(customer.getPhone() + SEPARATOR);
                    Flight flight = booking.getFlight();
                    out.print(flight.getId() + SEPARATOR);
                    out.print(flight.getFlightNumber() + SEPARATOR);
                    out.print(flight.getOrigin() + SEPARATOR);
                    out.print(flight.getDestination() + SEPARATOR);
                    out.print(flight.getDepartureDate() + SEPARATOR);
                    
                    out.print(booking.getBookingDate()+ SEPARATOR);
                    out.println();
            	}
            }
        }
    }
    

