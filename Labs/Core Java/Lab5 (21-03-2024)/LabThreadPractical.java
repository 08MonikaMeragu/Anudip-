/*1) Create two thread.one thread is finding the average of the first 10 numbers and another thread is printing the
 *  square of the number stored in array arr={1,20,50,15,30} and make sure both threads can execute simultaneously.*/

package com.threadpackage;
import java.util.Scanner;
class Average extends Thread
{
	public void run() // run method 
	{
		float sum=0,average; // initilizing variables
		for(int i=1;i<=10;i++)
		{
			sum+=i;
		}
		System.out.println("Print the sum of Numberas "+sum); //print the number of sum 
		average=sum/2; 
		System.out.println("Average of Numbers: "+average); // print average of sum values
	}
}

class Square extends Thread
{
	public void run()
	{
		int arr[]={1,20,50,15,30}; // array initilizing
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+"\t"+(int)Math.pow(arr[i], 2)); // print the array square values
		}
		
	}
}
public class LabThreadPractical {

	public static void main(String[] args) { // main method 
		Average a=new Average();
		a.start(); // run the thread method 
		Square s=new Square();
		s.start(); // run the thread method 

	}

}


/* OUTPUT

1	1
Print the sum of NUmbers 55.0
20	400
50	2500
15	225
30	900
Average of Numbers: 27.5
*/