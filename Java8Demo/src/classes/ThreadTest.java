package classes;

public class ThreadTest {
	public static void main(String[]args){
		Runnable r =  threadWithoutLambda();
		Runnable r1 =  ()->System.out.println("Hello1");
		Thread thread = new Thread(r);
		Thread thread1 = new Thread(r1);
		thread.start();
		thread1.start();
	}

	private static Runnable threadWithoutLambda() {
		return new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Hello");
			}
		};
	}
}
