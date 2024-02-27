package com.gradescope.hw5;

import java.util.Arrays;

public class Course {

    /**
     * The Course class represents a course. The
     * class tracks the code, student cap, and enrolled students of the course.
     * @author CS60 Student
     */

    /********************************
     * Instance variables
     ********************************/

    // A final string representing the course's code
    private final String code;

    // A final int representing the course's student cap
    private final int cap;

    // A student array representing the current student's enrolled
    private Student[] enrolled;

    /********************************
     * Constructors
     ********************************/

    /**
     * Initializes a new Course object of specified code and cap
     * @param code - A string representing the Course's code
     * @param cap  - An int representing the Course's student cap
     */
    public Course(String code, int cap) {
        this.code = code;
        this.cap = cap;
        this.enrolled = new Student[0];
    }

    /********************************
     * Non-static Methods
     ********************************/

    /**
     * Returns the course's code 
     * @return - The private final variable: code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Returns total number of students enrolled
     * @return -Lenght of Student Arrray: enrolled
     */
    public int getNumEnrolled() {
        return this.enrolled.length;
    }

    /**
     * Returns the student cap of the course
     * @return -The private final variable: cap
     */
    public int getCap() {
        return this.cap;
    }

    /**
     * Returns a boolean based if the student is already enrolled in the class
     * @param student -Student object being checked
     * @return - boolean based if student is enrolled or not, true if they are
     */
    public boolean studentEnrolled(Student student) {
        for (int i = 0; i < this.enrolled.length; i++) {
            if (this.enrolled[i].equals(student)) {
                return true;
            }
        }
        return false;

    }

    /**
     * Enrolls the student to the course
     * @param student -Student being enrolled
     * @return -Total students enrolled in the course
     */
    public int enrollStudent(Student student) {
        if (this.enrolled.length >= this.cap || this.studentEnrolled(student)) {
            return -1;
        }
        this.enrolled = Arrays.copyOf(this.enrolled, this.enrolled.length + 1);
        this.enrolled[getNumEnrolled() - 1] = student;
        return this.getNumEnrolled();

    }

    /**
     * Returns a string of all sudent objects in the class
     * @return - A string representing all student objects in their tring form
     */
    public String getStudents() {
        return Arrays.toString(this.enrolled);
    }

}
