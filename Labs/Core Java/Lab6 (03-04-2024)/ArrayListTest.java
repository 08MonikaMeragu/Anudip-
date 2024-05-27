/*Write a Java program that calculates the sum of all even numbers present in an

ArrayList of integers.

Sample Input:

2,5,8,10,15

Expected Output :sum of even number is 20*/

import java.util.ArrayList;
public class ArrayListTest {

	public static void main(String[] args) {
		


		        // Sample input: ArrayList of integers
		        ArrayList<Integer> numbers = new ArrayList<>();
		        numbers.add(2);
		        numbers.add(5);
		        numbers.add(8);
		        numbers.add(10);
		        numbers.add(15);

		        // Calculate the sum of even numbers
		        int sum = calculateSumOfEvenNumbers(numbers);

		        // Display the result
		        System.out.println("Sum of even numbers is: " + sum);
		    }

		    // Method to calculate the sum of even numbers in an ArrayList
		    public static int calculateSumOfEvenNumbers(ArrayList<Integer> numbers) {
		        int sum = 0;
		        for (int num : numbers) {
		            if (num % 2 == 0) {
		                sum += num;
		            }
		        }
		        return sum;
		    }


	}

/* OUTPUT
Sum of even numbers is: 20 */