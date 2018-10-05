package com.capgemini.Parking;

public class ParkingDemo {

	public static void main(String[] args) {
		ParkingManager parkingManager = new ParkingManager();
		
		CarOwnerDetails car = new CarOwnerDetails("Ron", "5.00pm", "99");
		System.out.println(parkingManager.addCar(car));
		car = new CarOwnerDetails("Ron", "5.00pm", "98");
		System.out.println(parkingManager.addCar(car));
		car = new CarOwnerDetails("Ron", "5.00pm", "97");
		System.out.println(parkingManager.addCar(car));
		car = new CarOwnerDetails("Ron", "5.00pm", "96");
		System.out.println(parkingManager.addCar(car));
		car = new CarOwnerDetails("Ron", "5.00pm", "95");
		System.out.println(parkingManager.addCar(car));
		car = new CarOwnerDetails("Ron", "5.00pm", "94");
		System.out.println(parkingManager.addCar(car));
		car = new CarOwnerDetails("Ron", "5.00pm", "93");
		System.out.println(parkingManager.addCar(car));
		car = new CarOwnerDetails("Ron", "5.00pm", "92");
		System.out.println(parkingManager.addCar(car));
		car = new CarOwnerDetails("Ron", "5.00pm", "91");
		System.out.println(parkingManager.addCar(car));
		car = new CarOwnerDetails("Ron", "5.00pm", "90");
		System.out.println(parkingManager.addCar(car));
		car = new CarOwnerDetails("Ron", "5.00pm", "89");
		System.out.println(parkingManager.addCar(car));
		car = new CarOwnerDetails("Ron", "5.00pm", "88");
		System.out.println(parkingManager.addCar(car));
		
		System.out.println(parkingManager.getCar("1/1/99"));
		System.out.println(parkingManager.removeCar("1/1/99"));
		System.out.println(parkingManager.getCar("1/1/99"));
		
		car = new CarOwnerDetails("Ron", "5.00pm", "12");
		System.out.println(parkingManager.addCar(car));
		car = new CarOwnerDetails("Ron", "5.00pm", "67");
		System.out.println(parkingManager.addCar(car));
	}

}
