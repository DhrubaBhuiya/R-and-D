package com.capgemini.makemytrip;

public class FlightRunner {
	public static void main(String[]args){
		FlightPojo flight = new FlightPojo(65, "IndiGo", 600, 900, 5000, "Bangalore", "Mumbai");
		FlightCollection.addFlight(flight);
		flight = new FlightPojo(23, "AirAsia", 700, 1000, 3000, "Bangalore", "Mumbai");
		FlightCollection.addFlight(flight);
		flight = new FlightPojo(88, "IndiGo", 1800, 2200, 5000, "Kolkata", "Mumbai");
		FlightCollection.addFlight(flight);
		flight = new FlightPojo(75, "JetAirways", 1500, 1800, 3000, "Kolkata", "Mumbai");
		FlightCollection.addFlight(flight);
		flight = new FlightPojo(35, "AirIndia", 1300, 1500, 3000, "Kolkata", "Bangalore");
		FlightCollection.addFlight(flight);
		flight = new FlightPojo(78, "Emirates", 700, 1100, 30000, "Kolkata", "Bangalore");
		FlightCollection.addFlight(flight);
		flight = new FlightPojo(35, "IndiGo", 900, 1200, 3700, "Kolkata", "Bangalore");
		FlightCollection.addFlight(flight);
		flight = new FlightPojo(68, "IndiGo", 700, 1100, 3000, "Kolkata", "Mumbai");
		FlightCollection.addFlight(flight);
		FlightCollection.sortByCost("Kolkata", "Bangalore").forEach(System.out::println);
		System.out.println("-----------------------------------------------------------");
		FlightCollection.sortByDuration("Kolkata", "Bangalore").forEach(System.out::println);
		System.out.println("-----------------------------------------------------------");
		FlightCollection.morningFlights("Kolkata", "Bangalore").forEach(System.out::println);
	}
}
