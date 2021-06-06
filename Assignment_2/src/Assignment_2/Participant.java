package Assignment_2;

import java.util.Scanner;

// 2.1 Inheritance
public class Participant extends FutsalCentre {
	
	String name;
	String teamName;
	String gender;
	int age;
	int numOfParticipant;
	
	Scanner in = new Scanner(System.in);
	
	public Participant() {		//constructor with no argument
		
		super(); 	// inherit from super class
		
		System.out.println("Enter Name Of Participant: ");
		this.name = in.nextLine();
		System.out.println("Enter Your Team Name: ");
		this.teamName = in.nextLine();
		System.out.println("Enter Your Gender: ");
		this.gender = in.next();
		System.out.println("Enter Your Age: ");
		this.age = in.nextInt();
		System.out.println("Enter Number Of Participants: ");
		this.numOfParticipant = in.nextInt();
	}
	
	// 2.2 Polymorphism
	public String printInfo() {
		return ("Your Registration Succesful!");
	}
	
	public String toString() {
		return (super.toString() + "\n" + 
				"\nName Of Participant   : " + name + 
				"\nTeam Name             : " + teamName + 
				"\nGender                : " + gender + 
				"\nAge                   : " + age + 
				"\nNumber Of Participants: " + numOfParticipant + 
				"\n" + this.printInfo());
	}

}
