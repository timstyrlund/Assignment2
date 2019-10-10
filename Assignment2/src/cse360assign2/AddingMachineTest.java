package cse360assign2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddingMachineTest {

	@Test
	void testAddingMachineConstructor() {
		AddingMachine adder = new AddingMachine();
		
		assertNotNull (adder);
	}

	@Test
	void testGetTotalMethod() {
		AddingMachine adder = new AddingMachine();
		
		assertEquals (adder.getTotal(), 0);
	}
	
	@Test
	void testAddMethod() {
		AddingMachine adder = new AddingMachine();
		adder.add(5);
		
		assertEquals (adder.getTotal(), 5);
	}
	
	@Test
	void testSubtractMethod() {
		AddingMachine adder = new AddingMachine();
		adder.subtract(7);
		
		assertEquals (adder.getTotal(), -7);
	}
	
	@Test
	void testToStringMethod() {
		AddingMachine adder = new AddingMachine();
		adder.add(3);
		adder.subtract(2);
		
		assertEquals (adder.toString(), "0 + 3 - 2");
	}
	
	@Test
	void testClearMethod() {
		AddingMachine adder = new AddingMachine();
		adder.add(6);
		adder.clear();
		
		assertEquals (adder.getTotal(), 0);
	}
}
