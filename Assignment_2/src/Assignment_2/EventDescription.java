package Assignment_2;

import java.util.Scanner;

// 2.1 Inheritance
public class EventDescription extends Participant {
	
	String eventName;
	int category;
	char location;
	String contact;
	double registrationFee;
	
	Scanner in = new Scanner(System.in);
	
	public EventDescription() {		//constructor with no argument
		
		super();
		
		System.out.println("~~~~~~~~~~ EVENT DETAILS ~~~~~~~~~~");
		System.out.println();
		
		System.out.println("Enter Contact: ");
		contact = in.nextLine();
		System.out.println("Enter Event Name: ");
		eventName = in.nextLine();
		
		System.out.println("\nHere are the categories: ");
		System.out.println("1. Men" + "\n2. Women");
		System.out.println();
		System.out.println("Enter Your choice: ");
		int choice = in.nextInt();
		
		if (choice == 1) {
			System.out.println("Men");
			System.out.println();
			
		}
		else if (choice == 2) {
			System.out.println("Women");
			System.out.println();
		}
		else {
			System.out.println("You Enter Invalid Number, Please Try Again!");
			System.out.println();
		}
		
		System.out.println("Enter Location: ");
		location = in.next().charAt(0);
		System.out.println("Enter Registration Fee: ");
		registrationFee = in.nextDouble();
		
	}
	
	
	public void printFutsalRules() {
		
		System.out.println("Here are some rules when playing futsal: ");
		System.out.println("1. 5 players versus 5 players, one of which will be a Goalkeeper. "
						   + "\nIt is expected that each player will have to take a turn being Goalkeeper.");
		System.out.println("2. Subs on the fly, like hockey");
		System.out.println("3. No offsides");
		System.out.println("4. No goalkeeper punts, ball must stay below head height, "
						   + "\notherwise possession and a free kick will be awarded to the opposing team");
		System.out.println("5. No slide tackles, players must not go to ground to steal possession back");
		System.out.println("6. No Throw-ins from the sidelines. "
						   + "\nInstead ball is placed on ground and passed in to a teammate with the foot");
		System.out.println("7. Free kicks and corners the opposing team has to be minimum of 5 yards away from the ball");
		System.out.println("8. With a penalty kick, all players behind the ball except for the penalty kicker");
		System.out.println();
	}
	
	public void printDressCode() {
		
		System.out.println("Dress Code: ");
		System.out.println("1. All players must wear shirts of the same (or very similar) colour.");
		System.out.println("2. All shirts must be clearly numbered front and/or back.");
		System.out.println("3. We will provide bibs in the event of a uniform clash. The team listed second on the match sheet will be required to wear bibs.");
		System.out.println();
	}
	
	public void printFutsalCentreRules() {
		
		System.out.println("Here are some rules we provided when you are using our futsal centre: ");
		System.out.println("1. Play fair, respect your teammates, opponents and officials.");
		System.out.println("2. Offensive language targeting anyone will not be tolerated.");
		System.out.println("3. Players who appear to be under the influence of alcohol or drugs will not be permitted to play.");
		System.out.println("4. Absolutely no fighting will be tolerated.");
		System.out.println();
	}
	
	// 2.2 Polymorphism
	public String printInfo() {
		return ("Thank you for your registration! We very appreciate it.");
	}
	
	public String toString() {
		return ("Event Name      : " + this.eventName + 
				"\nCategory        : " + this.category + 
				"\nLocation        : Court " + this.location + 
				"\nContact         : " + this.contact + 
				"\nRegistration Fee: RM" + this.registrationFee + 
				"\n" + this.printInfo());
	}


}
