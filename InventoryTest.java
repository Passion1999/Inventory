package Inventory;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InventoryTest {
	
	Toy doll=new Toy("doll", 17.95, 5);
	Toy robot =new Toy("robot", 22.05, 3);
	Toy gun =new Toy("gun", 15.0, 4);
	
	InVentory empty =new MTinventory();
	InVentory i1 =new ConsInventory(gun, empty);
	InVentory i2 =new ConsInventory(robot,i1);
	InVentory i3 =new ConsInventory(doll, i2);

	@Test
	void testContains() {
		assertTrue(i2.contains("robot"));
		assertFalse(empty.contains("gun"));
		assertFalse(i3.contains("Go Kitty"));
		assertFalse(i2.contains("He He"));
	}
	void testIsbelow(){
		
		assertTrue(i3.Isbelow(20));
		assertFalse(i2.Isbelow(15));
		assertTrue(i1.Isbelow(15));
		assertFalse(empty.Isbelow(1));
	}
	void testHowmany() {
		assertEquals((i3.howMany()),3);
		assertEquals(i2.howMany(), 2);
		assertEquals(empty.howMany(), 0);
		assertEquals(i1.howMany(),1);
	}
	void testRaiseRate() {
		assertEquals(i1.raiseRate(0.05), new Toy("gun", 15.75, 4));

	}
	void testAveragePrice() {
		assertEquals(empty.averagePrice(), 0);
		assertEquals(i1.averagePrice(), 3.75,0.01);
		assertEquals(i2.averagePrice(), 5.29,0.01);
		assertEquals(i3.averagePrice(), 4.28,0.01);
	}
	void testReplaceName() {
		System.out.println(i3.replaceName());
		System.out.println(i2.replaceName());
	}
	}