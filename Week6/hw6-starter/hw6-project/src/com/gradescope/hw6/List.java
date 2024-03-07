package com.gradescope.hw6;

import java.util.NoSuchElementException;

import javax.xml.soap.Node;

/**
 * A singly-linked list in which each element references the next element.
 */
public class List<DataType extends Comparable<DataType>> {

	private ListNode myHead;
	private int mySize;

	/**
	 * Constructs an empty list
	 */
	public List() {
		this.myHead = null;
		this.mySize = 0;
	}

	/**
	 * A node in a list that contains data and references the next node.
	 */
	private class ListNode {

		private DataType myData;
		private ListNode myNext;

		private ListNode(DataType element, ListNode next) {
			this.myData = element;
			this.myNext = next;
		}

		private ListNode(DataType element) {
			this(element, null);
		}
	}

	/**
	 * Returns the number of elements in this list.
	 * 
	 * @return the number of elements in this list
	 */
	public int length() {
		return this.mySize;
	}

	/**
	 * Returns true if this list contains no elements.
	 * 
	 * @return true if this collection contains no elements
	 */
	public boolean isEmpty() {
		return this.length() == 0;
	}

	/**
	 * Returns a string representation of this list.
	 * 
	 * The string representation consists of the list's elements in order, separated
	 * by a space. Elements are converted to strings by object.toString().
	 * 
	 * @return a string representation of this list
	 */
	public String toString() {
		String result = "( ";
		ListNode node = this.myHead;
		while (node != null) {
			result = result + node.myData.toString() + " ";
			node = node.myNext;
		}
		return result + ")";
	}

	/**
	 * Returns true if this list contains the specified element.
	 * 
	 * More formally, if o==null, this list returns true if and only if this list
	 * contains at least one null element. Otherwise, this list returns true if and
	 * only if this list contains at least one element e such that o.equals(e).
	 * 
	 * @param o - element whose presence in this list is to be tested
	 * @return true if this list contains the specified element
	 */
	public boolean contains(DataType o) {
		if (o == null) {
			for (ListNode node = this.myHead; node != null; node = node.myNext) {
				if (node.myData == null) {
					return true;
				}
			}
		} else {
			for (ListNode node = this.myHead; node != null; node = node.myNext) {
				if (o.equals(node.myData)) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * Returns the element at the specified position in this list.
	 * 
	 * @param index - index of the element to return
	 * @return the element at the specified position in this list
	 * @throws IndexOutOfBoundsException if the index is out of range (index < 0 ||
	 *                                   index >= size())
	 */
	public DataType get(int index) {
		// check that index is within the bounds of the list
		if (index < 0) {
			throw new IndexOutOfBoundsException("Index to get must be at least 0.");
		}
		if (index >= this.length()) {
			throw new IndexOutOfBoundsException("Index to get is too large.");
		}

		// iterate through the list and find the right node
		int currentIndex = 0;
		ListNode currentNode = this.myHead;
		while (currentIndex != index) {
			currentIndex++;
			currentNode = currentNode.myNext;
		}

		return currentNode.myData;
	}

	/**
	 * Compares the specified object with this list for equality.
	 * 
	 * Returns true if and only if the specified object is also a list, both lists
	 * have the same size, and all corresponding pairs of elements in the two lists
	 * are equal. In other words, two lists are defined to be equal if they contain
	 * the same elements in the same order.
	 * 
	 * @param obj - the object to be compared for equality with this list
	 * @return true if the specified object is equal to this list
	 */
	public boolean equals(Object obj) {
		// @CS60: You do not need to understand the code in this method,
		// but feel free to take a look and ask questions about it,
		// if you are interested!

		// if obj is not of type List, they are not equal
		if (!(obj instanceof List)) {
			return false;
		}

		// cast the object to a List and use the overloaded version of equals
		@SuppressWarnings("unchecked")
		List<DataType> other = (List<DataType>) obj;
		// if the two lists are different sizes, they are not equal
		if (this.mySize != other.mySize) {
			return false;
		}

		// compare element by element
		ListNode node1 = this.myHead;
		ListNode node2 = other.myHead;
		for (int i = 0; i < this.mySize; i++) {
			// get the two strings, so we can compare them
			DataType s1 = node1.myData;
			DataType s2 = node2.myData;
			if (!s1.equals(s2)) {
				return false;
			}
			node1 = node1.myNext; // walk down this list
			node2 = node2.myNext; // walk down other list
		}
		return true;
	}

	/**
	 * Inserts the specified element at the beginning of this list.
	 * 
	 * Note that the list is modified. Nothing is returned. It is different than the
	 * constructor, which does create a new list.
	 * 
	 * @param e - the element to add
	 */
	public void addFirst(DataType e) {
		ListNode temp = new ListNode(e);
		temp.myNext = this.myHead;
		this.myHead = temp;
		this.mySize++;
	}

	/**
	 * Removes and returns the first element from this list.
	 * 
	 * @return the first element from this list
	 * @throws NoSuchElementException if this list is empty
	 */
	public DataType removeFirst() {
		if (this.mySize == 0){
			throw new NoSuchElementException();
		}
		DataType oldFirst = this.myHead.myData;
		this.myHead = this.myHead.myNext;
		this.mySize--;
		return oldFirst;
	}

	/**
	 * Removes the first element from this list and adds it at the beginning of the
	 * other list.
	 * 
	 * @param other - the list to which to move the element
	 * @throws NoSuchElementException if this list is empty
	 */
	public void moveFirstElementTo(List<DataType> other) {
		// Do this without creating a new ListNode (meaning you cannot use addFirst).
		if (this.mySize == 0){
			throw new NoSuchElementException();
		}
		if(other.mySize == 0){
			ListNode temp = this.myHead.myNext;
			ListNode temp2 = this.myHead;
			other.myHead = temp2;
			this.myHead = temp;
			other.myHead.myNext = null;
			other.mySize++;
			this.mySize--;
		
		}
		else{
			ListNode temp = this.myHead.myNext;
			ListNode temp2 = this.myHead;
			ListNode temp3 = other.myHead;
			other.myHead = temp2;
			this.myHead = temp;
			other.myHead.myNext = temp3;
			other.mySize++;
			this.mySize--;

		}

	}

	/**
	 * Appends the specified element to the end of this list.
	 * 
	 * Note that the list is modified. Nothing is returned. It is different than the
	 * constructor, which does create a new list.
	 * 
	 * @param e - element to be appended to this list
	 */
	public void add(DataType e) {
		/**
		 * If this list is empty, this method adds e to this list. If this list is not
		 * empty, this method searches to find the last ListNode in this list, then adds
		 * a new ListNode, containing e, beyond it as the final element.
		 */

		ListNode newE = new ListNode(e);
		if(this.mySize == 0){
			this.myHead = newE;
			this.mySize++;
		}
		else{
			ListNode temp = this.myHead;
			while (temp.myNext != null) {
				temp = temp.myNext;
			}
			temp.myNext = newE;
			this.mySize++;
		}
	}

	/**
	 * Constructs a list containing containing the elements of the string array, in
	 * the same order.
	 * 
	 * This static method can be thought of as another constructor.
	 * 
	 * @param stringArray - the array whose elements are to be placed into this list
	 */
	public static List<String> makeFromStringArray(String[] stringArray) {
		/**
		 * Use addFirst, **not** add. addFirst takes constant time whereas add takes
		 * time proportional to the size of the list. This implementation will allow you
		 * to add all elements to your list in time proportional to stringArray.length.
		 */
		List<String> tempList = new List<>();
		for (int i = stringArray.length - 1; i >= 0; i--){
			tempList.addFirst(stringArray[i]);
		}
		return tempList;
	}

	/**
	 * Returns an array containing all of the elements in this list in proper
	 * sequence (from first to last element). Elements are converted to strings by
	 * object.toString().
	 * 
	 * @return an array containing all of the elements in this list in proper
	 *         sequence
	 */
	public String[] toStringArray() {
		String[] lStrings = new String[this.mySize];
		int index = 0;
		ListNode temp = this.myHead;
		while(temp != null){
			lStrings[index] = temp.myData.toString();
			temp = temp.myNext;
			index++;
		}
		return lStrings;
	}

	/**
	 * Appends all of the elements in the other list to the end of this list, in the
	 * order that they are stored by the other list.
	 * 
	 * This operation is in-place. Note that the other list should not be modified
	 * while the operation is in progress. (This will occur if the specified
	 * collection is this list, and it is nonempty.)
	 * 
	 * @param other - list containing elements to be added to this list
	 */
	public void append(List<DataType> other) {
		if(this.mySize == 0){
			this.myHead = other.myHead;
			this.mySize++;
		}
		else{
			ListNode toAppend = other.myHead;
			ListNode temp = this.myHead;
			while (temp.myNext != null){
			temp = temp.myNext;
		}
			temp.myNext = toAppend;
			this.mySize += other.mySize;
		}
		
	}

	/**
	 * Reverses the elements of this list.
	 * 
	 * This operation is in-place.
	 */
	public void reverse() {
		/**
		 * We recommend creating ListNode references to refer to the previous, current,
		 * and next ListNode as you "walk" the list...
		 */
		if(this.mySize != 0){
		ListNode current = this.myHead;
		ListNode previous = null;
		ListNode next = this.myHead.myNext;
		while (next != null){
			current.myNext = previous;
			previous = current;
			current = next;
			next = next.myNext;
		}
		current.myNext = previous;
		previous = current;
		current = next;
		this.myHead = previous;
	}	
		
	}

	/**
	 * Splits this list in two.
	 * 
	 * Afterwards, this list contains only elements from the first half, and the
	 * returned list contains only elements from the second half.
	 * 
	 * If this list has an odd number of elements, afterwards, it should contain one
	 * more element than the list that is returned. If this list has one element, it
	 * is unmodified, and an empty list is returned.
	 * 
	 * @return a new list that contains the second half of the elements in the
	 *         original list
	 */
	public List<DataType> split() {

		if (this.mySize == 1) {
			return new List<DataType>();
		}
		else if(this.mySize % 2 == 1){
			int count = 0;
			ListNode temp = this.myHead;
			while(count != this.mySize/2){
				temp = temp.myNext;
				count++;
			}
			List<DataType> cleanList = new List<DataType>();
			cleanList.myHead = temp.myNext;
			temp.myNext = null;
			cleanList.mySize = count;
			this.mySize -= cleanList.mySize;
			return cleanList;
		}
		else{
			int count = 0;
			ListNode temp = this.myHead;
			while(count != this.mySize/2 - 1){
				temp = temp.myNext;
				count++;
			}
			List<DataType> cleanList = new List<DataType>();
			cleanList.myHead = temp.myNext;
			temp.myNext = null;
			cleanList.mySize = count + 1;
			this.mySize -= cleanList.mySize;
			return cleanList;
		}
	}

	/**
	 * Merges this list with the other list.
	 * 
	 * Both this list and other list should already be in sorted order.
	 * 
	 * This method will modify this list and the other list. When completed, other
	 * should be empty and this list should contain all elements in sorted order.
	 * 
	 * @param other - the list to be merged with this list
	 */
	public void merge(List<DataType> other) {
		/**
		 * You will find Java's compareTo method helpful.
		 * 
		 * You can make an extra List object (such as the mergedList that will become
		 * the result), but you should not create any new ListNode Objects.
		 */
		List<DataType> tempList = new List<DataType>();
		ListNode current = this.myHead;
		ListNode otherCurrent = other.myHead;
		if (current.myData.compareTo(otherCurrent.myData) > 0) {
			tempList.myHead = otherCurrent;
			otherCurrent = otherCurrent.myNext;
			tempList.myHead.myNext = null;
		}
		else{
			tempList.myHead = current;
			current = current.myNext;
			tempList.myHead.myNext = null;
			
		}
		ListNode mergedCurrent = tempList.myHead;
		while ((current != null)) {
				if (otherCurrent != null && current.myData.compareTo(otherCurrent.myData) > 0){
					mergedCurrent.myNext = otherCurrent;
					otherCurrent = otherCurrent.myNext;
					mergedCurrent = mergedCurrent.myNext;
					mergedCurrent.myNext = null;
					
				}
				else{
					mergedCurrent.myNext = current;
					current = current.myNext;
					mergedCurrent = mergedCurrent.myNext;
					mergedCurrent.myNext = null;
					
				}			
		}
		if(current == null){
			mergedCurrent.myNext = otherCurrent;
		}
		this.mySize += other.mySize;
		this.myHead = tempList.myHead;
		other.myHead = otherCurrent;
		other.mySize = 0;

	}

	/**
	 * Sorts this list using merge sort.
	 */
	public void mergeSort() {
		if (this.mySize > 1){
			List<DataType> rightHalf = this.split();
			this.mergeSort();
			this.mergeSort();
			this.merge(rightHalf);
			
		}
			
		}
	

	public static void main(String[] args) {
		System.out.println("You can add code here to test your List implementation!");
		System.out.println("Also, look at the assignment for debugging tips.");

		// For example, you might start like this:
		// List<Dog> myList = new List<Dog>();
		// System.out.println(myList.myHead.myData);
	}
}
