package org.emp;

public class Employee {

	void empId() {

		int a = 1;
		int b = 2;

		System.out.println(a+b);

	}

	void empId(int x, int y) {

		int a = x;
		int b = y;

		System.out.println(a+b);

	}

	void empId(int x, int y, double z) {


		System.out.println(x+y+z);

	}
	
	public static void main(String[] args) {
		
		Employee Emp= new Employee();
				Emp.empId();
		Emp.empId(10, 2);
		Emp.empId(10, 5, 2.5);
		
	}
	
}



