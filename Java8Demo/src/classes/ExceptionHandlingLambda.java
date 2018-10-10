package classes;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class ExceptionHandlingLambda {

	public static void main(String[] args) {
		
		List<Integer> integers = Arrays.asList(3,5,8,0,1,9);
		integers.forEach(throwingLambda(i->System.out.println(50/i),Exception.class));
	}
	
	private static <T, E extends Exception> Consumer<T> throwingLambda(Consumer<T> consumer, Class<E> class1){
		return i->{
			try{
				consumer.accept(i);
			}
			catch(Exception e){
				System.out.println("Exception: "+e.getMessage());
			}
	
		};
	}
	
	/*private static Consumer<Integer> throwingLambda(Consumer<Integer> consumer){
		return i->{
			try{
				consumer.accept(i);
			}
			catch(ArithmeticException e){
				System.out.println("Exception: "+e.getMessage());
			}
	
		};
	}*/
}
