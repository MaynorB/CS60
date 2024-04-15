package com.gradescope.hw7;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ClarinetTest {

    // Testing Instrument methods using clarinet object
    @Test
    public void testClarinent() {
        Clarinet c1 = new Clarinet();
        assertEquals("Bb", c1.getKey());
    }

    // Testing static type Instrument refrencing Clarinet object
    @Test
    public void testInstrument() {
        Instrument c1 = new Clarinet();
        assertEquals("Bb", c1.getKey());
    }

    // Testing interface Squeak
    @Test
    public void testSqueak() {
        Clarinet c1 = new Clarinet();
        Squeakable c2 = new Clarinet();
        assertEquals("Squeak! (Need more practice...)", c1.squeak());
        assertEquals("Squeak! (Need more practice...)", c2.squeak());

    }
}
