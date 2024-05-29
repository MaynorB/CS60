package com.gradescope.spampede;

import static org.junit.Assert.*;

import org.junit.Test;

public class SpampedeDataTest_GetNextCellFromBFS {
	/**
	 * Pictures of test boards at http://tinyurl.com/spampedeTestBoards
	 */

	@Test
	public void testG1_BFS() {
		SpampedeData myData = new SpampedeData(TestGame.G1);
    BoardCell nextCell = myData.getNextCellFromBFS();    
		assertEquals("[1, 3, X]", nextCell.toString());
	}

	@Test
	public void testG2_BFS() {
	  SpampedeData myData = new SpampedeData(TestGame.G2);
    BoardCell nextCell = myData.getNextCellFromBFS();    
    assertEquals("[2, 2, X]", nextCell.toString());
	}

	@Test
	public void testG3_BFS() {
	  SpampedeData myData = new SpampedeData(TestGame.G3);
    BoardCell nextCell = myData.getNextCellFromBFS();    
    assertEquals("[1, 3,  ]", nextCell.toString());
	}

	@Test
	public void testG4_BFS() {
	  SpampedeData myData = new SpampedeData(TestGame.G4);
    BoardCell nextCell = myData.getNextCellFromBFS();    
    assertEquals("[2, 2,  ]", nextCell.toString());
	}

	@Test
	public void testG5_BFS() {
	  SpampedeData myData = new SpampedeData(TestGame.G5);
    BoardCell nextCell = myData.getNextCellFromBFS();    
    assertEquals("[2, 2,  ]", nextCell.toString());
	}

	@Test
	public void testG6_BFS() {
	  SpampedeData myData = new SpampedeData(TestGame.G6);
    BoardCell nextCell = myData.getNextCellFromBFS();    
    assertEquals("[1, 3, X]", nextCell.toString());
	}

	@Test
	public void testG7_BFS() {
	  SpampedeData myData = new SpampedeData(TestGame.G7);
    BoardCell nextCell = myData.getNextCellFromBFS();    
    assertEquals("[2, 2, X]", nextCell.toString());
	}

	@Test
	public void testG8_BFS() {
	  SpampedeData myData = new SpampedeData(TestGame.G8);
    BoardCell nextCell = myData.getNextCellFromBFS();    
    assertEquals("[1, 3,  ]", nextCell.toString());
	}

	@Test
	public void testG9_BFS() {
	  SpampedeData myData = new SpampedeData(TestGame.G9);
    BoardCell nextCell = myData.getNextCellFromBFS();    
		assertEquals("[2, 2,  ]", nextCell.toString());
	}

	@Test
	public void testG10_BFS() {
	  SpampedeData myData = new SpampedeData(TestGame.G10);
    BoardCell nextCell = myData.getNextCellFromBFS();    
    assertEquals("[2, 2,  ]", nextCell.toString());
	}

	@Test
	public void testG11_BFS() {
	  SpampedeData myData = new SpampedeData(TestGame.G11);
    BoardCell nextCell = myData.getNextCellFromBFS();    
		// NEED AN OR!
		String possibleResult1 = "[1, 3,  ]";
		String possibleResult2 = "[2, 2,  ]";
		String nextCellString = nextCell.toString();
		assertTrue(possibleResult1.equals(nextCellString) || possibleResult2.equals(nextCellString));
	}

}
