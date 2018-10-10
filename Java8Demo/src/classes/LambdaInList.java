package classes;

import java.util.ArrayList;
import java.util.List;

public class LambdaInList {
	
	public static void main(String[]args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Ajay");
		list.add("Vijay");
		list.add("Sujay");
		list.add("Nirjay");
		list.add("Jay");
		
		list.forEach(System.out::println);
		
		list.forEach((s)->System.out.println(s.charAt(0)));
	}
}
