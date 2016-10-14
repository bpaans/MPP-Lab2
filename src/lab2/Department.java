package lab2;

import java.util.ArrayList;

public class Department {
	private String name;
	ArrayList<Person> personList = new ArrayList<Person>();	
	
	Department(String name){
		this.name = name;
	}
	
	public void addFaculty(Person person){
		if(person!=null)
			personList.add(person);
		else
			System.out.println("Error.. Faculty can't be null!");
	}
	
	public void addStudent(Person person){
		if(person!=null)
			personList.add(person);
		else
			System.out.println("Error.. Student can't be null!");
	}
	
	public void addStaff(Person person){
		if(person!=null)
			personList.add(person);
		else
			System.out.println("Error.. Staff can't be null!");
	}

	
	public String getName(){
		return this.name;
	}
	
	public double getTotalSalary(){
		double sum = 0;
		for(Person p:personList){
			sum+=p.getSalary();
		}
		return sum;
	}
	
	
	public void showAllMembers(){
		for(Person p:personList){
			System.out.println(p.getName()+" - "+p.getClass().getSimpleName());
		}
		
	}
	
	public void unitsPerFaculty(){
		
	}
		
}
