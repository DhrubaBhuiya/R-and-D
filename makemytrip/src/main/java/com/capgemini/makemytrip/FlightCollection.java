package com.capgemini.makemytrip;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class FlightCollection {
	
	private static ArrayList<FlightPojo> flightList = new ArrayList<FlightPojo>();
	
	public static void addFlight(FlightPojo account) {
		flightList.add(account);
	}

	public static ArrayList<FlightPojo> removeFlight(int flightNo) {

		for (FlightPojo flight : flightList) {
			if (flight.getFlightNo() == flightNo) {
				flightList.remove(flight);
				return flightList;
			}
		}
		throw new RuntimeException("Flight does not exist");

	}

	public static ArrayList<FlightPojo> updateFlightArrivalTime(int flightNo, int arrivalTime) {
		for (FlightPojo flight : flightList) {
			if (flight.getFlightNo() == flightNo) {
				flight.setArrivalTime(arrivalTime);
				return flightList;
			}
		}
		throw new RuntimeException("Flight does not exist");
	}
	
	public static ArrayList<FlightPojo> updateFlightDestination(int flightNo, String destination) {
		for (FlightPojo flight : flightList) {
			if (flight.getFlightNo() == flightNo) {
				flight.setDestination(destination);
				return flightList;
			}
		}
		throw new RuntimeException("Flight does not exist");
	}

	public static ArrayList<FlightPojo> getAllFlights() {
		return flightList;
	}

	public static FlightPojo getByFlightNo(int flightNo) {
		
		for (FlightPojo flight : flightList) { 
			if (flight.getFlightNo() == flightNo) { 
				return flight; 
				} 
			} 
		throw new RuntimeException("Flight does not exist");		 
	}
	
	public static ArrayList<FlightPojo> updateDestination(int flightNo, String destination){
		for(FlightPojo flight:flightList){
			if(flight.getFlightNo()==flightNo){
				flight.setDestination(destination);
				return flightList;
			}
		}
		throw new RuntimeException("Flight not present");
	}
	
	public static ArrayList<FlightPojo> updateTimings(int flightNo, int departureTime, int arrivalTime){
		for(FlightPojo flight:flightList){
			if(flight.getFlightNo()==flightNo){
				flight.setArrivalTime(arrivalTime);
				flight.setDepartureTime(departureTime);
				return flightList;
			}
		}
		throw new RuntimeException("Flight not present");
	}
	
	public static ArrayList<FlightPojo> sortByCost(String source, String destination){
		flightList.sort(Comparator.comparingDouble(FlightPojo::getCost));
		return (ArrayList<FlightPojo>) flightList.stream().filter(flight->flight.getSource().equals(source)).filter(flight->flight.getDestination().equals(destination)).collect(Collectors.toList());
	}
	
	public static ArrayList<FlightPojo> sortByDuration(String source, String destination){
		flightList.sort((flight1,flight2)->flight1.getRouteTime()-flight2.getRouteTime());
		return (ArrayList<FlightPojo>) flightList.stream().filter(flight->flight.getSource().equals(source)).filter(flight->flight.getDestination().equals(destination)).collect(Collectors.toList());
	}
	
	public static ArrayList<FlightPojo> morningFlights(String source, String destination){
		return (ArrayList<FlightPojo>) flightList.stream().filter(flight->flight.getDepartureTime()<1200).filter(flight->flight.getDepartureTime()<1200).filter(flight->flight.getSource().equals(source)).filter(flight->flight.getDestination().equals(destination)).collect(Collectors.toList());
	}
}
