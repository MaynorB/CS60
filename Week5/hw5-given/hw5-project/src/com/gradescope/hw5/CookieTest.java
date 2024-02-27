package com.gradescope.hw5;

import static org.junit.Assert.*;

import org.junit.Test;

public class CookieTest {

    // Part A Constructors Tests

    @Test 
	public void testBlankCookie() {
		new Cookie();
	}

    @Test 
	public void testSugarCookie() {
		new Cookie("sugar");
	}

    @Test 
	public void testChocolateChipCookie() {
		new Cookie("chocolate chip");
	}

    @Test 
	public void testGlutenFreeCookie() {
		new Cookie("gluten free");
	}

    @Test 
	public void testRandomCookie() {
		new Cookie("random");
	}

    // Part B Non-static Methods Tests

    @Test 
	public void testGetSugarTypeCookie() {
		Cookie c = new Cookie("sugar");
        assertEquals("sugar", c.getType());
	}

    @Test 
	public void testGetRandomTypeCookie() {
		Cookie c = new Cookie("random");
        assertEquals("random", c.getType());
	}


    @Test 
	public void testGetSugarCalories() {
		Cookie c = new Cookie("sugar");
        assertEquals(400 , c.getCalories());
	}

    @Test 
	public void testGetRandomCalories() {
		Cookie c = new Cookie("random");
        assertEquals(500, c.getCalories());
	}


    @Test 
	public void testGetSugarList() {
		Cookie c = new Cookie("sugar");
        assertEquals("[butter, sugar, eggs, flour]", c.listIngredients());
	}


    @Test 
	public void testGetRandomList() {
		Cookie c = new Cookie("random");
        assertEquals("[randoms, butter, sugar, eggs, flour]", c.listIngredients());
	}


    @Test
    public void testSugarAddIngredient(){
        Cookie c = new Cookie("sugar");
        c.addIngredient("apples");
        assertEquals("[butter, sugar, eggs, flour, apples]", c.listIngredients());
    }

    @Test
    public void testRandomAddIngredient(){
        Cookie c = new Cookie("random");
        c.addIngredient("apples");
        assertEquals("[randoms, butter, sugar, eggs, flour, apples]", c.listIngredients());
    }

    // Part C Static method Tests

    @Test
	public void testCookieCount_0() {
        Cookie.resetCookieCount();
		assertEquals(0, Cookie.getCookieCount());
    }


    @Test
	public void testCookieCount_1() {
        Cookie.resetCookieCount();
        Cookie c = new Cookie();
		assertEquals(1, Cookie.getCookieCount());
    }

    @Test
	public void testCookieCount_4() {
        Cookie.resetCookieCount();
        Cookie c1 = new Cookie();
        Cookie c2 = new Cookie();
        Cookie c3 = new Cookie();
        Cookie c4 = new Cookie();
		assertEquals(4, Cookie.getCookieCount());
    }


    @Test
	public void testRightNumOfCookies() {
		assertEquals(6, Cookie.rightNumberOfCookies());
    }

    @Test
	public void testIsDeliciousCookieTypeFalse() {
		assertFalse(Cookie.isDeliciousCookieType("cookie"));
    }

    @Test
	public void testIsDeliciousCookieTypeTrue() {
		assertTrue(Cookie.isDeliciousCookieType("chocolate cookie with apple bits and pineapples and why is there so much ingredients"));
    }


    // Cookie Box Test
    
    @Test
	public void testTotalCalBox0() {
        CookieBox c = new CookieBox();
		assertEquals(0, c.totalCaloriesInBox());
    }

    @Test
	public void testTotalCalBoxOneCookie() {
        CookieBox box = new CookieBox();
		assertEquals(0, box.totalCaloriesInBox());
        Cookie c = new Cookie();
        box.addCookie(c);
        assertEquals(400, box.totalCaloriesInBox());
    }

    @Test
	public void testTotalCalBoxThreeCookie() {
        CookieBox box = new CookieBox();
		assertEquals(0, box.totalCaloriesInBox());
        Cookie c = new Cookie();
        Cookie c2 = new Cookie("sugar");
        Cookie c3 = new Cookie("random");

        box.addCookie(c);
        box.addCookie(c2);
        box.addCookie(c3);

        assertEquals(1300, box.totalCaloriesInBox());
    }

}



