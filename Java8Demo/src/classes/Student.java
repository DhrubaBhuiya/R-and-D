package classes;

public class Student implements Comparable<Student>
{

	private String name;
	private int age;
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public int compareTo(Student student) {
		// TODO Auto-generated method stub
		return this.getName().compareTo(student.getName());
	}

}
