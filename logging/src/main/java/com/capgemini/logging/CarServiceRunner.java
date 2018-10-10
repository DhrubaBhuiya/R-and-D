package com.capgemini.logging;

public class CarServiceRunner {
	public static void main(String[]args) {
		
		CarService carService =  new CarService();
		carService.process("BMW");
	}
}
