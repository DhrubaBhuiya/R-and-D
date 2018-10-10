package classes;

import interfaces.Interface1;
import interfaces.Interface2;

public class Class1 implements Interface1,Interface2{
	
	@Override
	public void display() {
		System.out.println("Hello");		
		Interface1.super.display();
		Interface2.super.display();
	}
	
	public static void main(String[]args) {
		Class1 class1 =  new Class1();
		class1.display();
	}

}
