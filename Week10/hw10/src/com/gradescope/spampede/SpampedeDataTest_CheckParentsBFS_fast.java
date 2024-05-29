package com.gradescope.spampede;

import static org.junit.Assert.*;

import org.junit.Test;

public class SpampedeDataTest_CheckParentsBFS_fast {
	/**
	 * Pictures of test boards at http://tinyurl.com/spampedeTestBoards
	 * 
	 * IMPORTANT: The tests in this file assume the BFS stops as soon as spam is
	 * enqueued, rather than waiting for it to leave the queue. If you write the
	 * algorithm as suggested in class, most or all of these tests will fail...and
	 * that is OK! You should try running SpampedeBrainTest_CheckParentsBFS instead.
	 */

	@Test
	public void testG1_BFS() {
	  SpampedeData myData = new SpampedeData(TestGame.G1);
    myData.getNextCellFromBFS();    
    // not checking nextCell only checking parent content
		String parentString = myData.toStringParents();
		String correctParentString = "[null]\t[null]\t[null]\t[null]\t[null]\t[null]\t\n"
				+ "[null]\t[null]\t[null]\t[1, 2]\t[null]\t[null]\t\n"
				+ "[null]\t[null]\t[1, 2]\t[null]\t[null]\t[null]\t\n"
				+ "[null]\t[null]\t[null]\t[null]\t[null]\t[null]\t\n"
				+ "[null]\t[null]\t[null]\t[null]\t[null]\t[null]\t\n"
				+ "[null]\t[null]\t[null]\t[null]\t[null]\t[null]\t\n";
		// Sample debugging output:
		// System.out.println("G1");
		// System.out.println("Expected:");
		// System.out.println(correctParentString);
		// System.out.println("Actual:");
		// System.out.println(myData.toStringParents());
		assertEquals(correctParentString, parentString);
	}

	@Test
	public void testG2_BFS() {
    SpampedeData myData = new SpampedeData(TestGame.G2);
    myData.getNextCellFromBFS();    
    // not checking nextCell only checking parent content
    String parentString = myData.toStringParents();
		String correctParentString = "[null]\t[null]\t[null]\t[null]\t[null]\t[null]\t\n"
				+ "[null]\t[null]\t[null]\t[null]\t[null]\t[null]\t\n"
				+ "[null]\t[null]\t[1, 2]\t[null]\t[null]\t[null]\t\n"
				+ "[null]\t[null]\t[null]\t[null]\t[null]\t[null]\t\n"
				+ "[null]\t[null]\t[null]\t[null]\t[null]\t[null]\t\n"
				+ "[null]\t[null]\t[null]\t[null]\t[null]\t[null]\t\n";
		// Sample debugging output:
		// System.out.println("G2");
		// System.out.println("Expected:");
		// System.out.println(correctParentString);
		// System.out.println("Actual:");
		// System.out.println(myData.toStringParents());
		assertEquals(correctParentString, parentString);
	}

	@Test
	public void testG3_BFS() {
    SpampedeData myData = new SpampedeData(TestGame.G3);
    myData.getNextCellFromBFS();    
    // not checking nextCell only checking parent content
    String parentString = myData.toStringParents();
		String correctParentString = "[null]\t[null]\t[null]\t[null]\t[null]\t[null]\t\n"
				+ "[null]\t[null]\t[null]\t[1, 2]\t[1, 3]\t[null]\t\n"
				+ "[null]\t[2, 2]\t[1, 2]\t[2, 2]\t[null]\t[null]\t\n"
				+ "[null]\t[null]\t[2, 2]\t[null]\t[null]\t[null]\t\n"
				+ "[null]\t[null]\t[null]\t[null]\t[null]\t[null]\t\n"
				+ "[null]\t[null]\t[null]\t[null]\t[null]\t[null]\t\n";
		// Sample debugging output:
		// System.out.println("G3");
		// System.out.println("Expected:");
		// System.out.println(correctParentString);
		// System.out.println("Actual:");
		// System.out.println(myData.toStringParents());
		assertEquals(correctParentString, parentString);
	}

	@Test
	public void testG4_BFS() {
    SpampedeData myData = new SpampedeData(TestGame.G4);
    myData.getNextCellFromBFS();    
    // not checking nextCell only checking parent content
    String parentString = myData.toStringParents();
		String correctParentString = "[null]\t[null]\t[null]\t[null]\t[null]\t[null]\t\n"
				+ "[null]\t[null]\t[null]\t[1, 2]\t[null]\t[null]\t\n"
				+ "[null]\t[2, 2]\t[1, 2]\t[2, 2]\t[null]\t[null]\t\n"
				+ "[null]\t[null]\t[2, 2]\t[null]\t[null]\t[null]\t\n"
				+ "[null]\t[null]\t[null]\t[null]\t[null]\t[null]\t\n"
				+ "[null]\t[null]\t[null]\t[null]\t[null]\t[null]\t\n";
		// Sample debugging output:
		// System.out.println("G4");
		// System.out.println("Expected:");
		// System.out.println(correctParentString);
		// System.out.println("Actual:");
		// System.out.println(myData.toStringParents());
		assertEquals(correctParentString, parentString);
	}

	@Test
	public void testG5_BFS() {
    SpampedeData myData = new SpampedeData(TestGame.G5);
    myData.getNextCellFromBFS();    
    // not checking nextCell only checking parent content
    String parentString = myData.toStringParents();
		String correctParentString = "[null]\t[null]\t[null]\t[null]\t[null]\t[null]\t\n"
				+ "[null]\t[null]\t[null]\t[1, 2]\t[1, 3]\t[null]\t\n"
				+ "[null]\t[2, 2]\t[1, 2]\t[2, 2]\t[2, 3]\t[null]\t\n"
				+ "[null]\t[3, 2]\t[2, 2]\t[3, 2]\t[null]\t[null]\t\n"
				+ "[null]\t[4, 2]\t[3, 2]\t[4, 2]\t[null]\t[null]\t\n"
				+ "[null]\t[null]\t[null]\t[null]\t[null]\t[null]\t\n";
		// Sample debugging output:
		// System.out.println("G5");
		// System.out.println("Expected:");
		// System.out.println(correctParentString);
		// System.out.println("Actual:");
		// System.out.println(myData.toStringParents());
		assertEquals(correctParentString, parentString);
	}

	@Test
	public void testG6_BFS() {
    SpampedeData myData = new SpampedeData(TestGame.G6);
    myData.getNextCellFromBFS();    
    // not checking nextCell only checking parent content
    String parentString = myData.toStringParents();
		String correctParentString = "[null]\t[null]\t[null]\t[null]\t[null]\t[null]\t\n"
				+ "[null]\t[null]\t[null]\t[1, 2]\t[null]\t[null]\t\n"
				+ "[null]\t[null]\t[1, 2]\t[null]\t[null]\t[null]\t\n"
				+ "[null]\t[null]\t[null]\t[null]\t[null]\t[null]\t\n"
				+ "[null]\t[null]\t[null]\t[null]\t[null]\t[null]\t\n"
				+ "[null]\t[null]\t[null]\t[null]\t[null]\t[null]\t\n";
		// Sample debugging output:
		// System.out.println("G6");
		// System.out.println("Expected:");
		// System.out.println(correctParentString);
		// System.out.println("Actual:");
		// System.out.println(myData.toStringParents());
		assertEquals(correctParentString, parentString);
	}

	@Test
	public void testG7_BFS() {
    SpampedeData myData = new SpampedeData(TestGame.G7);
    myData.getNextCellFromBFS();    
    // not checking nextCell only checking parent content
    String parentString = myData.toStringParents();
		String correctParentString = "[null]\t[null]\t[null]\t[null]\t[null]\t[null]\t\n"
				+ "[null]\t[null]\t[null]\t[null]\t[null]\t[null]\t\n"
				+ "[null]\t[null]\t[1, 2]\t[null]\t[null]\t[null]\t\n"
				+ "[null]\t[null]\t[null]\t[null]\t[null]\t[null]\t\n"
				+ "[null]\t[null]\t[null]\t[null]\t[null]\t[null]\t\n"
				+ "[null]\t[null]\t[null]\t[null]\t[null]\t[null]\t\n";
		// Sample debugging output:
		// System.out.println("G7");
		// System.out.println("Expected:");
		// System.out.println(correctParentString);
		// System.out.println("Actual:");
		// System.out.println(myData.toStringParents());
		assertEquals(correctParentString, parentString);
	}

	@Test
	public void testG8_BFS() {
    SpampedeData myData = new SpampedeData(TestGame.G8);
    myData.getNextCellFromBFS();    
    // not checking nextCell only checking parent content
    String parentString = myData.toStringParents();
		String correctParentString = "[null]\t[null]\t[null]\t[null]\t[null]\t[null]\t\n"
				+ "[null]\t[null]\t[null]\t[1, 2]\t[1, 3]\t[null]\t\n"
				+ "[null]\t[2, 2]\t[1, 2]\t[2, 2]\t[null]\t[null]\t\n"
				+ "[null]\t[null]\t[2, 2]\t[null]\t[null]\t[null]\t\n"
				+ "[null]\t[null]\t[null]\t[null]\t[null]\t[null]\t\n"
				+ "[null]\t[null]\t[null]\t[null]\t[null]\t[null]\t\n";
		// Sample debugging output:
		// System.out.println("G8");
		// System.out.println("Expected:");
		// System.out.println(correctParentString);
		// System.out.println("Actual:");
		// System.out.println(myData.toStringParents());
		assertEquals(correctParentString, parentString);
	}

	@Test
	public void testG9_BFS() {
    SpampedeData myData = new SpampedeData(TestGame.G9);
    myData.getNextCellFromBFS();    
    // not checking nextCell only checking parent content
    String parentString = myData.toStringParents();
		String correctParentString = "[null]\t[null]\t[null]\t[null]\t[null]\t[null]\t\n"
				+ "[null]\t[null]\t[null]\t[1, 2]\t[null]\t[null]\t\n"
				+ "[null]\t[2, 2]\t[1, 2]\t[2, 2]\t[null]\t[null]\t\n"
				+ "[null]\t[null]\t[2, 2]\t[null]\t[null]\t[null]\t\n"
				+ "[null]\t[null]\t[null]\t[null]\t[null]\t[null]\t\n"
				+ "[null]\t[null]\t[null]\t[null]\t[null]\t[null]\t\n";
		// Sample debugging output:
		// System.out.println("G9");
		// System.out.println("Expected:");
		// System.out.println(correctParentString);
		// System.out.println("Actual:");
		// System.out.println(myData.toStringParents());
		assertEquals(correctParentString, parentString);
	}

	@Test
	public void testG10_BFS() {
    SpampedeData myData = new SpampedeData(TestGame.G10);
    myData.getNextCellFromBFS();    
    // not checking nextCell only checking parent content
    String parentString = myData.toStringParents();
		String correctParentString = "[null]\t[null]\t[null]\t[null]\t[null]\t[null]\t\n"
				+ "[null]\t[null]\t[null]\t[1, 2]\t[1, 3]\t[null]\t\n"
				+ "[null]\t[2, 2]\t[1, 2]\t[2, 2]\t[2, 3]\t[null]\t\n"
				+ "[null]\t[3, 2]\t[2, 2]\t[3, 2]\t[null]\t[null]\t\n"
				+ "[null]\t[4, 2]\t[3, 2]\t[4, 2]\t[null]\t[null]\t\n"
				+ "[null]\t[null]\t[null]\t[null]\t[null]\t[null]\t\n";
		// Sample debugging output:
		// System.out.println("G10");
		// System.out.println("Expected:");
		// System.out.print(correctParentString);
		// System.out.println("Actual:");
		// System.out.print(myData.toStringParents());
		assertEquals(correctParentString, parentString);
	}

	@Test
	public void testG11_BFS() {
    SpampedeData myData = new SpampedeData(TestGame.G11);
    myData.getNextCellFromBFS();    
    // not checking nextCell only checking parent content
    String parentString = myData.toStringParents();
		String correctParentString = "[null]\t[null]\t[null]\t[null]\t[null]\t[null]\t\n"
				+ "[null]\t[null]\t[null]\t[1, 2]\t[1, 3]\t[null]\t\n"
				+ "[null]\t[2, 2]\t[1, 2]\t[2, 2]\t[2, 3]\t[null]\t\n"
				+ "[null]\t[3, 2]\t[2, 2]\t[3, 2]\t[3, 3]\t[null]\t\n"
				+ "[null]\t[4, 2]\t[3, 2]\t[4, 2]\t[4, 3]\t[null]\t\n"
				+ "[null]\t[null]\t[null]\t[null]\t[null]\t[null]\t\n";
		// Sample debugging output:
		// System.out.println("G11");
		// System.out.println("Expected:");
		// System.out.println(correctParentString);
		// System.out.println("Actual:");
		// System.out.println(myData.toStringParents());
		assertEquals(correctParentString, parentString);
	}

}
