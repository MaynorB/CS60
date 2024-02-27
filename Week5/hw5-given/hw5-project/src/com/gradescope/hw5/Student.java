package com.gradescope.hw5;

public class Student {

    /**
     * The Student class represents a student. The
     * class tracks the name and ID of the student.
     * @author CS60 Student
     */

    /********************************
     * Instance variables
     ********************************/

    // A string representing the Student's name
    private String name;

    // A long representing the Studet's ID
    private final long id;

    /********************************
     * Constructors
     ********************************/

    /**
     * Initializes a new Student of the specified name and ID.
     * @param name - The name of the student
     * @param id   - The id of the student
     */
    public Student(String name, long id) {
        this.name = name;
        this.id = id;
    }

    /**
     * Non-Static Methods
     */

    /**
     * Returns a String representation of Student object
     * @return - a string representation in the form of 'name [id]'
     */
    public String toString() {
        return this.name + " [" + id + "]";
    }

    /**
     * Returns a boolean if student's ID matches
     * @param - Another Student object
     * @return - boolean based if both Student's IDs are equal
     */
    public boolean equals(Student other) {
        return this.id == other.getId();
    }

    /**
     * Returns the Name variable
     * @return - The private variable: Name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Returns the ID variable
     * @return - The private final variable: ID
     */
    public long getId() {
        return this.id;
    }

    /**
     * Sets newName to the Name variable
     * @param newName - The new Name for the Student
     */
    public void setName(String newName) {
        this.name = newName;
    }
}
