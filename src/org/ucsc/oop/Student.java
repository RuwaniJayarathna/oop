package org.ucsc.oop;

public class Student {
	String firstName;
	String lastName;
	int age;
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age+25;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		s1.setFirstName("Ruwani");
		s1.setLastName("Jayarathna");
		s1.setAge(24);
		
		s2.setFirstName("Akila");
		s2.setLastName("Nilakshi");
		s2.setAge(23);
		
		s3.setFirstName("Kiru");
		s3.setLastName("Thiyagaraja");
		s3.setAge(22);
		
		System.out.println("My name is "+s1.getFirstName()+" "+s1.getLastName()+ " and my age is "+s1.getAge());
		System.out.println("My name is "+s2.getFirstName()+" "+s2.getLastName()+ " and my age is "+s2.getAge());
		System.out.println("My name is "+s3.getFirstName()+" "+s3.getLastName()+ " and my age is "+s3.getAge());
		// TODO Auto-generated method stub

	}

}
