package com.gradescope.hw7;

/**
 * A guinea pig.
 */
public class GuineaPig implements Comparable<GuineaPig>, Squeakable {
	private int age;
	private String name;

	/**
	 * Initializes a new guinea pig object.
	 * 
	 * @param name - the name
	 * @param age  - the age
	 */
	public GuineaPig(String name, int age) {
		this.name = name;
		this.age = age;
	}

	/**
	 * Initializes a new guinea pig object with default name "arya" and age 1 (Prof
	 * Wu's pet).
	 */
	public GuineaPig() {
		this("arya", 1);
	}

	/**
	 * Returns the name of this guinea pig.
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * Method that returns a string "squeak"
	 * 
	 * @return -string representation of what Squeak means for the class
	 */
	public String squeak() {
		return "Squeak! (Feed me!)";
	}

	@Override
	/**
	 * Returns the name of this guinea pig.
	 */
	public int compareTo(GuineaPig o) {
		if (this.age < o.age || this.name.compareTo(o.name) < 0) {
			return -1;
		} else if (this.age > o.age || this.name.compareTo(o.name) > 0) {
			return 1;
		} else {
			return 0;
		}
	}
}
