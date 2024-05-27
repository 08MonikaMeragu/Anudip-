/*1) Define interfaces Flyable and Swimmable with methods fly() and swim() respectively. Implement these interfaces in a class 'Bird' to demonstrate multiple interface implementation.*/

interface Flyable  //interface  flyable
{
	public void fly(); //abstract method
}
interface Swimmable //interface swimmable
{
	public void swim(); //abstract method
}
class Bird implements Flyable,Swimmable  // class Bird
{
	public void fly() // body of  fly provided here
	{
		System.out.println("This is Flyable method");
		System.out.println("The Bird is fly");
	}
	public void swim() // body  of swim 
	{
		System.out.println("A swimmer swimming in the see");
	}
}
class MultipleInterface // main method
{
	public static void main(String args[])
	{
		Bird b=new Bird(); // create object of bird
		b.fly(); // call the 
		b.swim();
	}
}
	
	
/*
	OUTPUT 
	
	C:\Users\Monika\Desktop\Java For Anudip>javac MultipleInterface.java

C:\Users\Monika\Desktop\Java For Anudip>java MultipleInterface
This is Flyable method
The Bird is fly
A swimmer swimming in the see
	
	*/