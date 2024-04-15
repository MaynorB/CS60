package com.gradescope.hw7;

import static org.junit.Assert.*;
import org.junit.Test;

public class GuineaPigTest {
    // Tests Constructors
    @Test
    public void testGuineaPig() {
        new GuineaPig();
        new GuineaPig("Apple", 3);
        new GuineaPig("Snake", 2);
    }

    // Tests Public Methods
    @Test
    public void testString() {
        GuineaPig arya = new GuineaPig();
        GuineaPig apple = new GuineaPig("Apple", 3);
        GuineaPig snake = new GuineaPig("Snake", 2);

        assertEquals("arya", arya.getName());
        assertEquals("Apple", apple.getName());
        assertEquals("Snake", snake.getName());
    }

    // Testing compareTo for class GuineaPig

    @Test
    public void testCompare() {
        GuineaPig arya = new GuineaPig(); // Age 1
        GuineaPig eel = new GuineaPig("Eel", 3);
        GuineaPig cat = new GuineaPig("Cat", 2);
        GuineaPig dog = new GuineaPig("Dog", 2);

        assertTrue(arya.compareTo(eel) < 0);
        assertTrue(eel.compareTo(dog) > 0);
        assertTrue(cat.compareTo(cat) == 0);
        assertTrue(cat.compareTo(dog) < 0);
        assertTrue(dog.compareTo(arya) < 0);

    }

    // Testing Comparable<GuineaPig> that it can reference a Guniepig object and use
    // CompareTo with a GuineaPig object
    @Test
    public void testStaticGuineaPig() {
        Comparable<GuineaPig> arya = new GuineaPig();
        // Setting up GuineaPigs to use CompareTo for the Compareable<> object
        GuineaPig arya2 = new GuineaPig();
        GuineaPig orange = new GuineaPig("Orange", 5);
        GuineaPig lemon = new GuineaPig("Lemon", 0);

        assertTrue(arya.compareTo(orange) < 0);
        assertTrue(arya.compareTo(lemon) > 0);
        assertTrue(arya.compareTo(arya2) == 0);

    }

    // Testing interface Squeak
    @Test
    public void testSqueak() {
        GuineaPig g1 = new GuineaPig();
        Squeakable g2 = new GuineaPig();
        assertEquals("Squeak! (Feed me!)", g1.squeak());
        assertEquals("Squeak! (Feed me!)", g2.squeak());

    }

}
