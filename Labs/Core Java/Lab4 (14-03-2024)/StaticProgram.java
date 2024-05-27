/*2) Write a program to demonstrate static block take two static variables name and id and print them.*/

class StaticProgram 
{
	static int id=101;  // static variables
	static String name="Monika";
	static  // static block
	{
	System.out.println(" we can use static block");
	}
	public static void main(String args[]) // main method 
	{
		System.out.println("we can use static method and static variables in the program");
		System.out.println("Static Id "+id); // print the static variables
		System.out.println("Static Name "+name);
	}
}


/* 
OUTPUT


C:\Users\Monika\Desktop\Java For Anudip>javac StaticProgram.java

C:\Users\Monika\Desktop\Java For Anudip>java StaticProgram
 we can use static block
we can use static method and static variables in the program
Static Id 101
Static Name Monika

*/