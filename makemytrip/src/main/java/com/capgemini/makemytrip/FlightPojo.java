package com.capgemini.makemytrip;

public class FlightPojo {
	private int flightNo;
	private String airline;
	private int departureTime;
	private int arrivalTime;
	private double cost;
	private String source;
	private String destination;
	private int routeTime;

	public FlightPojo(int flightNo, String airline, int departureTime,
			int arrivalTime, double cost, String source, String destination) {
		super();
		this.flightNo = flightNo;
		this.airline = airline;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.cost = cost;
		this.source = source;
		this.destination = destination;
		this.routeTime = this.arrivalTime - this.departureTime;
		if(this.routeTime<0)this.routeTime+=24;
	}

	public int getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(int arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getFlightNo() {
		return flightNo;
	}

	public String getAirline() {
		return airline;
	}

	public int getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(int departureTime) {
		this.departureTime = departureTime;
	}

	public double getCost() {
		return cost;
	}

	public String getSource() {
		return source;
	}

	public int getRouteTime() {
		return routeTime;
	}

	@Override
	public String toString() {
		return "FlightPojo [flightNo=" + flightNo + ", airline=" + airline
				+ ", departureTime=" + departureTime + ", arrivalTime="
				+ arrivalTime + ", cost=" + cost + ", source=" + source
				+ ", destination=" + destination + ", routeTime=" + routeTime
				+ "]";
	}
	
	
	
	
}
