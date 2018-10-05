package com.capgemini.Parking;

import org.junit.Assert;
import org.junit.Test;

public class ParkingManagerTest {
	
	@Test
	public void addCarTest1(){	
		ParkingManager parkingManager = new ParkingManager();
		CarOwnerDetails car = new CarOwnerDetails("Ron", "5.00pm", "99");
		Assert.assertEquals("1/1/99", parkingManager.addCar(car));		
	}
	
	@Test
	public void addCarTest2(){		
		ParkingManager parkingManager = new ParkingManager();
		CarOwnerDetails car;
		for(int i=1;i<=160;i++){
			car = new CarOwnerDetails("Demo", "Demo", ""+i);
			parkingManager.addCar(car);
		}		
	}
	
	@Test(expected=RuntimeException.class)
	public void addCarTest3(){		
		ParkingManager parkingManager = new ParkingManager();
		CarOwnerDetails car;
		for(int i=1;i<=160;i++){
			car = new CarOwnerDetails("Demo", "Demo", ""+i);
			parkingManager.addCar(car);
		}		
		car = new CarOwnerDetails("Demo", "Demo", "Demo");
		parkingManager.addCar(car);
	}
	
	@Test
	public void getCarTest1(){		
		ParkingManager parkingManager = new ParkingManager();
		CarOwnerDetails car;
		for(int i=1;i<=160;i++){
			car = new CarOwnerDetails("Demo", "Demo", ""+i);
			parkingManager.addCar(car);
		}		
		Assert.assertEquals(new CarOwnerDetails("Demo", "Demo", "99").getOwnerName(), parkingManager.getCar("3/2/99").getOwnerName());
	}
	
	@Test
	public void getCarTest2(){		
		ParkingManager parkingManager = new ParkingManager();
		CarOwnerDetails car;
		for(int i=1;i<=160;i++){
			car = new CarOwnerDetails("Demo", "Demo", ""+i);
			parkingManager.addCar(car);
		}		
		Assert.assertNull(parkingManager.getCar("5/2/99"));
	}
	
	@Test
	public void removeCarTest1(){		
		ParkingManager parkingManager = new ParkingManager();
		CarOwnerDetails car;
		for(int i=1;i<=100;i++){
			car = new CarOwnerDetails("Demo", "Demo", ""+i);
			parkingManager.addCar(car);
		}	
		parkingManager.removeCar("1/1/5");
		parkingManager.removeCar("3/1/89");
		car = new CarOwnerDetails("Demo", "Demo", "Demo1");
		Assert.assertEquals("1/1/Demo1",parkingManager.addCar(car));
		car = new CarOwnerDetails("Demo", "Demo", "Demo2");
		Assert.assertEquals("3/1/Demo2",parkingManager.addCar(car));
		car = new CarOwnerDetails("Demo", "Demo", "Demo3");
		Assert.assertEquals("3/3/Demo3",parkingManager.addCar(car));
	}
	
}
