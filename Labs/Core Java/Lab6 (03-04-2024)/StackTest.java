/* write a program to declare stack.store 10 elements into it.
 * 
 * remove 4 elements from stack and display it.*/


import java.util.*;
import java.io.*;

public class StackTest {

	public static void main(String[] args) {
		
				// Creating an empty Stack
				Stack<Integer> stack = new Stack<Integer>();

				// Use add() method to add elements
				stack.push(10);
				stack.push(15);
				stack.push(30);
				stack.push(20);
				stack.push(5);
				stack.push(35);
				stack.push(55);
				stack.push(45);
				stack.push(65);
				stack.push(50);
				// Displaying the Stack
				System.out.println("Initial Stack: " + stack);

				// Removing elements using pop() method
				System.out.println("Popped element: "
								+ stack.pop());
				System.out.println("Popped element: "
								+ stack.pop());
				System.out.println("Popped element: "
						+ stack.pop());
				System.out.println("Popped element: "
						+ stack.pop());

				// Displaying the Stack after pop operation
				System.out.println("Stack after pop operation "
								+ stack);
			}
	
	}

/* OUTPUT
Initial Stack: [10, 15, 30, 20, 5, 35, 55, 45, 65, 50]
Popped element: 50
Popped element: 65
Popped element: 45
Popped element: 55
Stack after pop operation [10, 15, 30, 20, 5, 35]
 */