package Inventory;

public class Main {
	static Toy doll=new Toy("doll", 17.95, 5);
	static  Toy robot =new Toy("robot", 22.05, 3);
	static  Toy gun =new Toy("gun", 15.0, 4);
	
	static  InVentory empty =new MTinventory();
	static  InVentory i1 =new ConsInventory(gun, empty);
	static  InVentory i2 =new ConsInventory(robot,i1);
	static  InVentory i3 =new ConsInventory(doll, i2);

	public static void main(String [] args) {
		System.out.println(i1.raiseRate(0.05));
		System.out.println(i2.raiseRate(0.8));
		System.out.println(i3.raiseRate(0.09));
		
		System.out.println(i1.averagePrice());
		System.out.println(i2.averagePrice());
		System.out.println(i3.averagePrice());
		System.out.println(empty.averagePrice());
		
		System.out.println(empty.replaceName());
		System.out.println(i1.replaceName());
		System.out.println(i2.replaceName());
		System.out.println(i3.replaceName());
		System.out.println(i3);
		System.out.println(i3.eliminale("doll"));
		System.out.println(i2.eliminale("gun"));
	}
}
