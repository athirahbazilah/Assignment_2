package Assignment_2;

import java.util.Scanner;

// 2.1 Inheritance
public class Marketing extends FutsalCentre {
	
	String day;
	double prize;
	double registrationFee;
	
	Scanner in = new Scanner(System.in);
	
	public Marketing() {		//constructor with no argument
		
		super();
		
		System.out.println("Enter Day of Your Registration: ");
		day = in.nextLine();
		System.out.println("Enter Total Prize: RM");
		prize = in.nextDouble();
		System.out.println("Enter Registration Fee: RM");
		registrationFee = in.nextDouble();
		
	}
	
	public Marketing(String cN, String a, String c, String d, double pz, double rF) {
		
		super(cN, a, c);
		day = d;
		prize = pz;
		registrationFee = rF;
		
		double disc;
		
		if (d == "Friday" || d == "Saturday") {
			Discount dc = new WeekendDiscount();
			disc = dc.discRate();
			System.out.println("Original Price: RM" + rF);
			System.out.println("Discount Rate: " + dc.discRate() * 100 + " %");
			System.out.println("Total Price: RM " + (rF - (rF * disc)));
		}
		else {
			System.out.println("No discount for today");
		}
	}
	
	// 2.3 Encapsulation
	public double getPrize() {
		return this.prize;
	}
	
	public String getDay() {
		return this.day;
	}
	
	public double totalPrice() {	//constructor with no argument
		return this.registrationFee;
	}
	
	public double totalPrice(double disc) {		//constructor with one argument
		return this.totalPrice() * (1 - disc);
	}
	public double totalPrice(String d, double disc) {	//constructor with 2 arguments
		
		if (d == "Friday" || d == "Saturday") {
			System.out.println("There's a discount for today!");
			return this.totalPrice(0.20);
			
		}
		else {
			System.out.println("There is no discount for today!");
			return this.totalPrice();
		}
	}
	
	public void printAdvertisement() {
		
		System.out.println("%%%%%%%%%% ADVERTISEMENT %%%%%%%%%%");
		System.out.println();
		
		System.out.println("We provide comfortable place for you to enjoy your futsal activities." + 
						   "\nFeel free to register at our futsal centre. You will never disappoints.");
		System.out.println("We provide a really appreciable prize for the winner at RM" + this.prize);
		System.out.println("We also privode 10% discount on the weekend. so you can enjoy you futsal activities to the fullest!");
		System.out.println("If you are interested, you can contact us +609-8594882 for more info");
	}
	
	public String printInfo() {
		return ("Thank you for Trusting Us");
	}
	
	public String toString() {
		return ("Prize           : RM" + this.prize + 
				"\nDay             : " + this.day + 
				"\nRegistration Fee: RM" + this.registrationFee + 
				"\nLowest Price    : RM" + this.totalPrice("Saturday", 0.10) + " especially on Friday and Saturday" + 
				"\n" + this.printInfo());
	}

}
