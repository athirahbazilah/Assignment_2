package Assignment_2;

// 2.4 Abstraction
public abstract class FutsalCentre {		//super class
	
	String centreName;
	String adress;
	String contact;
	
	public FutsalCentre() {		//constructor with no argument
		
		centreName = "AB Futsal Centre";
		adress = "AB Futsal Centre, Taman Cukai Utama, 24000 Kemaman, Terengganu";
		contact = "+609-8594882";
		
	}
	
	public FutsalCentre(String cN, String a, String c) {
		this.centreName = cN;
		this.adress = a;
		this.contact = c;
	}
	
	//2.3 encapsulation 
	public void setCentreName(String cN) {	
		this.centreName = cN;
	}
	
	public void setAdress(String a) {
		this.adress = a;
	}
	
	public void setContact(String c) {
		this.contact = c;
	}
	
	public String getCentreName() {
		return this.centreName;
	}
	
	public String getAdress() {
		return this.adress;
	}
	
	public String getContact() {
		return this.contact;
	}
	
	// 2.2 Polymorphism 
	public String printInfo() {
		return ("\nFutsal is a football game played on a hard court, smaller than a football pitch, and mainly indoors. "
				+ "\nIt has similarities to five-a-side football. "
				+ "\nFutsal is played between two teams of five players each, one of whom is the goalkeeper. "
				+ "\nUnlimited substitutions are permitted");
	}
	
	public String toString() {
		return ("\nCentre Name: " + centreName +
				"\nAdress     : " + adress + 
				"\nContact    : " + contact + 
				"\n" + this.printInfo());
	}

}
