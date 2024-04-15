package com.gradescope.hw7;

/**
 * A table at the Hoch with chairs and people. Hoch tables are never full!
 * (There's always room for N+1.) At a super friendly table, whenever a person
 * is or removed added, they say hello or bye to everyone else at the table.
 * When class starts, everyone says bye.
 */
public class SuperFriendlyHochTable extends HochTable {

	/**
	 * Constructs a table with the default number of chairs.
	 */
	public SuperFriendlyHochTable() {
		super();
	}

	/**
	 * Constructs a table with the specified number of chairs.
	 * 
	 * @param capacity - the number of seats
	 * @throws IllegalArgumentException if the capacity is less than 0
	 */
	public SuperFriendlyHochTable(int capacity) {
		super(capacity);
	}

	@Override
	/**
	 * Adds a person to this table if there is space.
	 * 
	 * @param name - the name of the person to add
	 * @return a welcome message
	 */
	public String addPerson(String name) {
		String welcome = super.addPerson(name);

		String thanks = "";
		if (super.numPeople > 1) {
			String oldNames = super.people.subList(0, super.people.size() - 1).toString();
			oldNames = oldNames.substring(1, oldNames.length() - 1); // strip square brackets
			thanks = "Thanks " + oldNames + "!!!!!";
		}

		if (welcome != "" && thanks != "") {
			welcome += " ";
		}

		return welcome + thanks;
	}

	@Override
	/**
	 * Removes a person from this table.
	 * 
	 * @param name - the name of the person to remove
	 * @return a goodbye message
	 */
	public String removePerson(String name) {
		boolean wasRemoved = this.people.remove(name);
		if (!wasRemoved) {
			return "Weird! " + name + " was not here!";
		}

		this.numPeople--;
		if (this.numPeople == 0) {
			return "(Silence - no one is here to say goodbye.)";
		}
		String bye = "Bye " + name + ".";
		String names = super.people.toString();
		names = names.substring(1, names.length() - 1); // strip square brackets
		return bye + " Bye " + names + ".";
	}

	@Override
	/**
	 * Clears the table as everyone goes to class.
	 * 
	 * @return a goodbye message
	 */
	public String classStartingSoon() {
		String message;
		if (super.numPeople > 1) {
			message = "Bye everyone!";
		} else {
			message = "(Silence - no one is here to say goodbye.)";
		}
		super.numPeople = 0;
		super.people.clear();
		return message;
	}
}
