/* Write a program using ArrayDeque to add book names and
 *  add,delete the values from both ends of que. */  

import java.util.ArrayDeque;
public class ArrayDequeTest {

	public static void main(String[] args) {
	
		        // Create an ArrayDeque to store book names
		        ArrayDeque<String> bookDeque = new ArrayDeque<>();

		        // Add book names to the deque
		        bookDeque.addLast("C++/OOP");
		        bookDeque.addLast("Java");
		        bookDeque.addLast("Python");
		        bookDeque.addLast("Data Structure");
		        bookDeque.addLast("HTML");

		        // Display the contents of the deque
		        System.out.println("Books in the deque: " + bookDeque);

		        // Add a book to the front of the deque
		        bookDeque.addFirst("C");
		        System.out.println("Added a book to the front: " + bookDeque);

		        // Remove a book from the end of the deque
		        String removedBook = bookDeque.removeLast();
		        System.out.println("Removed book from the end: " + removedBook);
		        System.out.println("Deque after removing from end: " + bookDeque);

		        // Remove a book from the front of the deque
		        String removedFirstBook = bookDeque.removeFirst();
		        System.out.println("Removed book from the front: " + removedFirstBook);
		        System.out.println("Deque after removing from front: " + bookDeque);
		    }
	}

/* OUTPUT
 * Added a book to the front: [C, C++/OOP, Java, Python, Data Structure, HTML]
Removed book from the end: HTML
Deque after removing from end: [C, C++/OOP, Java, Python, Data Structure]
Removed book from the front: C
Deque after removing from front: [C++/OOP, Java, Python, Data Structure]*/
