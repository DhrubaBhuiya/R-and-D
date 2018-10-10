package classes;

import interfaces.MyInterface;

import java.util.ArrayList;
import java.util.List;

public class ClientTest {

	public static void main(String[] args) {
		MyInterface myInterface = new MyClass();
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("Dhruba", 21));
		studentList.add(new Student("Raj", 25));
		studentList.add(new Student("Rohan", 19));

		List<Student> sortedStudent = myInterface.sortStudents(studentList);
		for (Student student : sortedStudent) {
			MyInterface.greet(student.getName());

		}

		List<Integer> numberList = new ArrayList<Integer>();
		numberList.add(3245);
		numberList.add(456);
		numberList.add(22);
		numberList.add(56);
		numberList.add(678);
		numberList.add(123);
		numberList.add(888);
		System.out.println("Maximum number is:"
				+ myInterface.getMaximum(numberList));

	}

}
