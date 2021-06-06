package Assignment_2;

import java.util.Scanner;

// 2.1 Inheritance
public class Finance extends Employee {
	
	double employeeSalary;
	double utilityFee;
	double advertisementFee;
	double prize;
	int employeeQuantity;
	int participantQuantity;
	double registrationFee;
	
	Scanner in = new Scanner(System.in);
	
	public Finance() {	//constructor with no argument
		
		super();
		
		System.out.println("Enter Utility Fee: RM");
		utilityFee = in.nextDouble();
		System.out.println("Enter Advertisement Fee: RM");
		advertisementFee = in.nextDouble();
		System.out.println("Enter Prize: RM");
		prize = in.nextDouble();
		System.out.println("Enter Employee Quantity: ");
		employeeQuantity = in.nextInt();
		System.out.println("Enter Participant Quantity: ");
		participantQuantity = in.nextInt();
		System.out.println("Enter Registration Fee: RM");
		registrationFee = in.nextDouble();
		
	}
	
	public Finance(double pz, String d, double rF, double uF, double aF, int eQ, int pQ) {
		super();
		this.utilityFee = uF;
		this.advertisementFee = aF;
		this.employeeQuantity = eQ;
		this.participantQuantity = pQ;
	}
	
	public double totalSalary() {
		return super.salary * this.employeeQuantity;
	}
	
	public double totalBudget() {
		return (this.utilityFee + this.prize + this.employeeQuantity) * (this.employeeSalary + this.advertisementFee);
	}
	
	public double totalIncome() {
		return (this.participantQuantity * this.registrationFee);
	}
	
	public double calcNetProfit() {
		return this.totalIncome() - this.totalBudget();
	}
	
	// 2.2 Polymorphism
	public String printInfo() {
		return ("Your Financial Info has been display!");
	}
	
	public String toString() {
		return (super.toString() + "\n" + 
				"\nUtility Fee         : RM" + this.utilityFee + 
				"\nAdvertisement Fee   : RM" + this.advertisementFee +  
				"\nEmployee Quantity   : " + this.employeeQuantity + 
				"\nParticipant Quantity: " + this.participantQuantity + 
				"\nTotal Salary        : RM" + this.totalSalary() + 
				"\nTotal Budget        : RM" + this.totalBudget() + 
				"\nTotal Income        : RM" + this.totalIncome() + 
				"\nTotal Net Profit    : RM" + this.calcNetProfit() + 
				"\n" + this.printInfo());
	}

}
