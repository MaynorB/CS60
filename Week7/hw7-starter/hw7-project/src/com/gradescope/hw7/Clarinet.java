package com.gradescope.hw7;

public class Clarinet extends Instrument implements Squeakable {
    /**
     * A class named Clarinet that extends Instrumentt
     * Adopts all methods of Instrument
     */

    public Clarinet() {
        super("Bb");
    }

    /**
     * 
     * Method that returns a string "squeak"
     * 
     * @return -string representation of what Squeak means for the class
     */
    public String squeak() {
        return "Squeak! (Need more practice...)";
    }
}
