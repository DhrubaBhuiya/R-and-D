package com.capgemini.Parking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingManager {

	private List<List<Map<String, CarOwnerDetails>>> parkingBuilding;
	private int floors=4;
	private int sections=4;
	private int floorIndex=0;
	private int sectionIndex=0;
	
	public ParkingManager() {
		parkingBuilding = new ArrayList<List<Map<String,CarOwnerDetails>>>(4);
		for(int index=0;index<floors;index++){
			parkingBuilding.add(new ArrayList<Map<String,CarOwnerDetails>>(4));
		}		
		for(int index1=0;index1<floors;index1++){
			for(int index2=0;index2<sections;index2++){
				parkingBuilding.get(index1).add(new HashMap<String, CarOwnerDetails>(10));
			}
		}
		
	}
	
	public List<List<Map<String, CarOwnerDetails>>> getParkingBuilding() {
		return parkingBuilding;
	}
	
	public String addCar(CarOwnerDetails car){
		while(parkingBuilding.get(floorIndex).get(sectionIndex).size()==10){
			sectionIndex++;
			if(sectionIndex==sections){
				sectionIndex=0;
				floorIndex++;
				if(floorIndex==floors){
					throw new RuntimeException("No place left");
				}
			}
		}
		
		String parkingID = (floorIndex+1) +"/"+ (sectionIndex+1) +"/"+ car.getPhoneNo();
		parkingBuilding.get(floorIndex).get(sectionIndex).put(parkingID, car);
		return parkingID;
	}
	
	public CarOwnerDetails getCar(String parkingID){
		
		String tempParkingID=parkingID+"/";
		String array[] = tempParkingID.split("/");
		int floor = Integer.parseInt(array[0]) - 1;
		int section = Integer.parseInt(array[1]) - 1;
		if(floor<0||floor>3)
			return null;
		if(section<0||section>3)
			return null;
		CarOwnerDetails car = parkingBuilding.get(floor).get(section).get(parkingID);
		return car;	
	}
	
	public CarOwnerDetails removeCar(String parkingID){
			
		String tempParkingID=parkingID+"/";
		String array[] = tempParkingID.split("/");
		int floor = Integer.parseInt(array[0]) - 1;
		int section = Integer.parseInt(array[1]) - 1;
		if(floor<0||floor>3)
			return null;
		if(section<0||section>3)
			return null;
		floorIndex=0;
		sectionIndex=0;
		CarOwnerDetails car = parkingBuilding.get(floor).get(section).remove(parkingID);
		return car;
	}
}
