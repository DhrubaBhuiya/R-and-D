package com.capgemini.Parking;

public class CarOwnerDetails {

	private String ownerName;
	private String parkingTime;
	private String phoneNo;

	public CarOwnerDetails(String ownerName, String parkingTime, String phoneNo) {
		super();
		this.ownerName = ownerName;
		this.parkingTime = parkingTime;
		this.phoneNo = phoneNo;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public String getParkingTime() {
		return parkingTime;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	@Override
	public String toString() {
		return "CarOwnerDetails [ownerName=" + ownerName + ", parkingTime="
				+ parkingTime + ", phoneNo=" + phoneNo + "]";
	}

}
