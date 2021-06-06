package Assignment_2;

class PriceRate  implements Payment {
	
	public double totalPrice() {
		return 45.0;
	}
	
	public double totalPrice(double disc) {
		return 45.0 * (1 - disc);
	}
	
	public double totalPrice(String d, double disc) {
		
		if (d == "Friday" || d == "Saturday") {
			System.out.println("There's a discount for today!");
			return this.totalPrice(0.20);
			
		}
		else {
			System.out.println("There is no discount for today!");
			return this.totalPrice();
		}
	}

}
