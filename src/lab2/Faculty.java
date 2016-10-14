package lab2;

public class Faculty extends Person{
	private double salary;

	public Faculty(String name, String phone, int age, double salary) {
		super(name, phone, age);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

		
//	public int getTotalUnits() {
//		
//	}

}
