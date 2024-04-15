package com.gradescope.hw7;

/**
 * A table at the Hoch with chairs and people. Hoch tables are never full!
 * (There's always room for N+1.)
 */
public class HochTable extends Table {

	/**
	 * Constructs a table with the default number of chairs.
	 */
	public HochTable() {
		super();
	}

	/**
	 * Constructs a table with the specified number of chairs.
	 * 
	 * @param capacity - the number of seats
	 * @throws IllegalArgumentException if the capacity is less than 0
	 */
	public HochTable(int capacity) {
		super(capacity);
	}

	/**
	 * Returns true because Hoch tables are never full.
	 */
	@Override
	public boolean emptySeat() {
		return true;
	}

	@Override
	/**
	 * Adds a person to this table if there is space.
	 * 
	 * @param name the name of the person to add
	 * @return a welcome message
	 */
	public String addPerson(String name) {
		// add a chair if needed
		if (super.getNumChairs() == super.getNumPeople()) {
			super.numChairs++;
		}
		return super.addPerson(name);
	}

	@Override
	/**
	 * Removes a person from this table.
	 * 
	 * @param name - the name of the person to remove
	 * @return a goodbye message
	 */
	public String removePerson(String name) {
		return super.removePerson(name);
	}

	/**
	 * Clears the table as everyone goes to class.
	 * 
	 * @return a goodbye message
	 */
	public String classStartingSoon() {
		String message;
		if (this.numPeople > 1) {
			message = "(Silence - everyone runs to class.)";
		} else {
			message = "(Silence - no one is here to say goodbye.)";
		}
		this.numPeople = 0;
		this.people.clear();
		return message;
	}
}
