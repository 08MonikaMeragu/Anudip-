/*2) create a program with a logic that throws the ArrayIndexOutOfBoundsException while accessing elements in an array.
 * [Hint:Use array and loop and try to access the element beyond the last index]*/

package com.threadpackage;

import java.util.Arrays;

class Array extends Thread
{
	public void run() // run method
	{
	
		int arr[]= {1,10,15,20}; //initilizing array
		System.out.println("Elements in array ");// print array
		System.out.println(Arrays.toString(arr)); // print array
		int index = 4; // add array 
		for(int i=0;i<arr.length;i++)
		{
		  try 
		  {
			  int x=arr[index];
			  System.out.println(x);  
		  } 
		  catch(Exception e)
		  {
			  System.out.println("Error: Index is out of bounds.");
		  }
		}
		 
			
		}
	}

public class ArrayIndexOutOfBoundsException1 {

	public static void main(String[] args) {  main method 
		Array a=new Array();
		a.start(); // run the thread method 

	}

}

/*
 * OUTPUT
 * [1, 10, 15, 20]
Error: Index is out of bounds.
Error: Index is out of bounds.
Error: Index is out of bounds.
Error: Index is out of bounds.
 */
 
