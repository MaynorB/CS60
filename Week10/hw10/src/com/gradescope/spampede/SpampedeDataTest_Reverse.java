package com.gradescope.spampede;

import static org.junit.Assert.*;

import org.junit.Test;

public class SpampedeDataTest_Reverse {
	/**
	 * Pictures of test boards at http://tinyurl.com/spampedeTestBoards
	 */
	
	@Test
	public void test_ReverseNorth() {
		SpampedeData myData = new SpampedeData(TestGame.G14);
		myData.reverseSnake();
		BoardCell nextCell = myData.getNextCellInDir();
		assertEquals("[1, 2,  ]", nextCell.toString());
	}

	@Test
	public void test_ReverseSouth() {
	  SpampedeData myData = new SpampedeData(TestGame.G13);
    myData.reverseSnake();
    BoardCell nextCell = myData.getNextCellInDir();
    assertEquals("[4, 2,  ]", nextCell.toString());
	}

	@Test
	public void test_ReverseEast() {
	  SpampedeData myData = new SpampedeData(TestGame.G12);
    myData.reverseSnake();
    BoardCell nextCell = myData.getNextCellInDir();
    assertEquals("[2, 4,  ]", nextCell.toString());
	}

	@Test
	public void test_ReverseWest() {
	  SpampedeData myData = new SpampedeData(TestGame.G15);
    myData.reverseSnake();
    BoardCell nextCell = myData.getNextCellInDir();
    assertEquals("[3, 1,  ]", nextCell.toString());
	}

}
