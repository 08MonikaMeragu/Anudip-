/* Lab Q3) Write a class with the name Perimeter using function overload that computes the perimeter of a square,a rectangle and a circle.
Formula:
perimeter of a square=4*s
perimeter of rectangle=2*(l+b)
perimeter of circle= 2*(22/7)*r */

import java.util.Scanner;
class Perimeter
{
	int side,l,b;  // variable initialize
	double r;
	Scanner sc=new Scanner(System.in); 
	void perimeter() // method
	{
		System.out.println("Enter the value of sides:"); //given input value through the user
		side=sc.nextInt();
		int square=4*side; // calculation of square
		System.out.println("The Perimeter of Square "+square); // print the output
	}
	void perimeter(int length ,int breadth) // method given parameterize
	{
		//System.out.println("Enter the value of length:");
		this.l=length;
		//length=sc.nextInt();
		//System.out.println("Enter the value of breadth:");
		this.b=breadth;
		//breadth=sc.nextInt();
		double rectangle=2*(l+b); // calculation part
		System.out.println("The Perimeter of Rectangle "+rectangle); // print the result
	}
	void perimeter(double radius) // method given parameterize
	{
		//System.out.println("Enter the value of Radius:");
		this.r=radius;
		//radius=sc.nextDouble();
		double circle=2*(22/7)*r; // calculation part
		System.out.println(" The Perimeter of Circle "+circle); //print the result
	}
}
class PerimeterDemo // main class 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		// select options through the user
		System.out.println("Enter the option 1)square\n 2)rectangle\n 3)circle\n");
		//String option=sc.next();
		int option=sc.nextInt();
		// object creating the class
		Perimeter p=new Perimeter();
		// which option user can select that method should be run
		switch (option)
			{
				//case "square":
				case 1:
					System.out.println("Call the Square method");
					p.perimeter();
					break;
				
				//case "rectangle":
				case 2:
					System.out.println("Call the Rectangle method");
					p.perimeter(10,20);
					break;
			
				//case "circle":
				case 3:
					System.out.println("Call the Circle method");
					p.perimeter(15.6);
					break;
			}
	}
}

/*

OUTPUT

C:\Users\Monika\Desktop\Java For Anudip>javac PerimeterDemo.java

C:\Users\Monika\Desktop\Java For Anudip>java PerimeterDemo
Enter the option 1)square
 2)rectangle
 3)circle

1
Call the Square method
Enter the value of sides:
25
The Perimeter of Square 100

C:\Users\Monika\Desktop\Java For Anudip>java PerimeterDemo
Enter the option 1)square
 2)rectangle
 3)circle

2
Call the Rectangle method
The Perimeter of Rectangle 60.0

C:\Users\Monika\Desktop\Java For Anudip>java PerimeterDemo
Enter the option 1)square
 2)rectangle
 3)circle

3
Call the Circle method
 The Perimeter of Circle 93.6


*/