package Inventory;

public class Toy {
	private  String name;
	private double price;
	public int available;
	public Toy(String name, double price, int available) {
		this.name = name;
		this.price = price;
		this.available = available;
	}
	@Override
	public String toString() {
		return "name: " + this.name
				+ ", price: " + this.price
				+ ", available: " + this.available;	}
	
	public boolean containToy(String name) {
		if(this.name.equals(name))
			return true;
		return false;
	}
	public boolean checkBelow(int threshold) {
		if (this.price<threshold)
			return true;
		else return false;
	}
	public  double raiseRateToy( double rate ) {
		return this.price+(this.price*rate);
		
		
	}
	public String getName() {
		return this.name;
	}
	public double getPrice() {
		return this.price;
	}
	public int getAvailable() {
		return this.available;
	}
	public boolean checkName(String  thatname) {
		if(this.name==thatname) return true;
		return false;
	}
	public Toy replaceNameToy() {
		return new Toy(this.name.replace("robot", "r2d2"), this.price, this.available);
	}
	public boolean ToyOfName(String nameEliminate) {
		if(this.name==nameEliminate) return true;
		return false;
			
	}
	}
	

