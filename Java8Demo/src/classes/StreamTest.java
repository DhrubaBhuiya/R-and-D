package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {
	public static void main(String[]args) {
		
		List<Integer> list = new ArrayList<Integer>();
		for(int i=1;i<=10;i++){
			list.add(i);
		}
		list.stream().map(x->x*x).filter(x->x>20).forEach(System.out::println);
		Stream.iterate(0,x->x+2).limit(200).collect(Collectors.toList()).forEach(System.out::println);
	}
}
