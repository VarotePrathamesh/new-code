package com.constructor;

public class Employee {

	int salary;
	String name;
	
	public Employee(int salary, String name) {
		super();
		this.salary = salary;
		this.name = name;
		
		System.out.println("salary " +this. salary +" " +"name "+ this.name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 =new Employee(1000,"sham");
		Employee e2 =new Employee(1500,"ram");
		Employee e3 =new Employee(2000,"robert");
		Employee e4 =new Employee(2400,"ajay");
		Employee e5 =new Employee(3000,"vijay");
		
		
		
				
	}

}
