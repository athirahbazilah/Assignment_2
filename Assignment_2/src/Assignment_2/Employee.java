package Assignment_2;

import java.util.Scanner;

// 2.1 Inheritance
public class Employee extends FutsalCentre {
	
	String department;
	String name;
	int employeeID;
	double salary;
	
	Scanner in = new Scanner(System.in);
	
	public Employee() {
		
		super(); 	//inherit from super class
		
		System.out.println("Enter Your Department: ");
		this.department = in.nextLine();
		System.out.println("Enter Your Name: ");
		this.name = in.nextLine();
		System.out.println("Enter Your ID: ");
		this.employeeID = in.nextInt();
		System.out.println("Enter Your Salary: RM");
		this.salary = in.nextDouble();
	}
	
	// 2.2 Polymorphism
	public String printInfo() {
		return ("Your Employee Info has been display!");
	}
	
	public String toString() {
		return (super.toString() + "\n" +  
				"\nDepartment: " + department + 
				"\nName      : " + name + 
				"\nID        : " + employeeID + 
				"\nSalary    : RM" + salary + 
				"\n" + this.printInfo());
	}

}
