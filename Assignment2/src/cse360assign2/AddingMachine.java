package cse360assign2;

import java.util.ArrayList;

/**
 * The AddingMachine class allows AddingMachine objects to add, subtract, 
 * retrieve, print, and clear the total.
 * 
 * @author Tim Styrlund <p>
 * ASUID: 1210810897 <p>
 * Assignment: 2
 *
 */
public class AddingMachine {

	private int total;
	private ArrayList<Character> operationList;
	private ArrayList<Integer> operandList;
	
	 /**
	  * Initializes a new AddingMachine object which is represented by an
	  * integer equal to 0
	  */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		operationList = new ArrayList<Character>();
		operandList = new ArrayList<Integer>();
		operandList.add(total);
	}
	
	/**
	 * Returns the current total of the AddingMachine object
	 * @return
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * Adds the parameter to the total of the AddingMachine object
	 * @param value Value to be added to the total
	 */
	public void add (int value) {
		total += value;
		operationList.add('+');
		operandList.add(value);
	}
	
	/**
	 * Subtracts the parameter to the total of the AddingMachine object
	 * @param value Value to be subtracted to the total
	 */
	public void subtract (int value) {
		total -= value;
		operationList.add('-');
		operandList.add(value);
	}
		
	/**
	 * Returns the history of operations of the AddingMachine object
	 */
	public String toString () {
		String history = "";
		int operandIndex = 0;
		
		while(operandIndex < operandList.size()) {
			history += Integer.toString(operandList.get(operandIndex));
			
			if(operandIndex < operandList.size() - 1) {
				history += " " + operationList.get(operandIndex) + " ";
			}
			
			operandIndex++;
		}
			
		return history;
	}

	/**
	 * Sets the current total to zero 
	 */
	public void clear() {
		total = 0;
	}
}
