/*4) Create a class named Car with attributes make, model, year, and color. Include a method start() that prints "Car started" and a method stop() that prints "Car stopped".*/

import java.util.Scanner;
class Car
{
	// variables
	String make,model,color;
	int year;
	Car() // no-arg constructor
	{
		// take user through input
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Make car Name:");
	make=sc.next();
	System.out.println("Enter the Model Name:");
	model=sc.next();
	System.out.println("Enter the Color Name:");
	color=sc.next();
	System.out.println("Enter the Year:");
	year=sc.nextInt();
	}
	void start() //method
	{
		System.out.println(" The Car Started.");
	}
	void show() // method
	{
	System.out.println("The car Make "+make+" Model Name is "+model+" and color is "+color+" and year of car is "+year);
	}
	void stop() // method
	{
		System.out.println("Car stopped.");
	}
	
}
class CarDemo // main method
{
	public static void main(String args[])
	{
		Car c=new Car();
		c.start();
		c.show();
		c.stop();
	}
}
		
/* OUTPUT




C:\Users\Monika\Desktop\Java For Anudip>javac CarDemo.java

C:\Users\Monika\Desktop\Java For Anudip>java CarDemo
Enter the Make car Name:
Tata
Enter the Model Name:
Hero
Enter the Color Name:
Blue
Enter the Year:
2019
 The Car Started.
The car Make Tata Model Name is Hero and color is Blue and year of car is 2019
Car stopped.
*/