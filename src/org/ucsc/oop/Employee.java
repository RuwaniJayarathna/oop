package org.ucsc.oop;

public class Employee {
	
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public int calSalary(){
		int numberOfDays=20;
		int costPerDay=100;
		int salary=numberOfDays*costPerDay;
		return salary;
		
	}
	public int calSalary(int numberOfDays){
		
		int costPerDay=100;
		int salary=numberOfDays*costPerDay;
		return salary;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp= new Employee();
		emp.setAge(24);
		emp.setName("ru");
		System.out.println("My age is "+ emp.getAge()+" My name is "+emp.getName());
		
		System.out.println(emp.getName());
		System.out.println("Hellow world");
		
		
		System.out.println(emp.calSalary());
		System.out.println(emp.calSalary(5));
		
		//compare two strings donot need to use this to compre integers
		emp.getName().equals("ru");

	
		if(emp.getAge()>=20 && emp.getName().equals("aki")){
		
			System.out.println("employee name is "+emp.getName());
		}
		else{
			
			System.out.println("employee is under 20");
		}
		
		if(emp.getName().equals("ru")){
			
			System.out.println("Employee is here");
		}
		else{
			
			System.out.println("Employee is not ru.but someone else");
		}
		
	}

}
 