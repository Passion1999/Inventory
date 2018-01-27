package Inventory;

public  interface  InVentory {
	public boolean contains(String name);
	public boolean Isbelow(int threshold);
	public int howMany();
	public InVentory  raiseRate(double rate);
	public double averagePrice();
	public double sumPrice();
	public  double sumAvailable();
	public InVentory replaceName();
	public InVentory eliminale(String nameEliminate);
	

}
