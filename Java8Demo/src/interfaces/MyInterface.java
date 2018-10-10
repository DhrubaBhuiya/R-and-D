package interfaces;

import java.util.Collections;
import java.util.List;

import classes.Student;

public interface MyInterface {
	default public List<Student> sortStudents(List<Student> studentList)
	{
		Collections.sort(studentList);
		return studentList;
	}
	public static void greet(String name)
	{
		System.out.print("Welcome:"+name);
	}
	public abstract Integer getMaximum(List<Integer>numberList);
}
