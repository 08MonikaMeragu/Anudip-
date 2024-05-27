/*WAP to create a simple calculator program that takes user input for two 
numbers and an operator (+, -, *, /) and performs the corresponding arithmetic
 operation using conditional statements.using if else condition*/
 import java.util.Scanner;
 class ArithmeticOperation
 {
	public static void main(String args[])
	{
		int result;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Frist Number:");
		int num1=sc.nextInt();
		System.out.println("Enter the Second Number:");
		int num2=sc.nextInt();
		System.out.println("Enter the Operation +,-,*,/:");
		String operation=sc.next();
		if(operation.equals("+"))
		{
			result=num1+num2;
			System.out.println("Addition of two numbers:"+result);
		}
		else if(operation.equals("-"))
		{
			result=num1-num2;
			System.out.println("Substraction of two numbers:"+result);
		}
		else if(operation.equals("*"))
		{
			result=num1*num2;
			System.out.println("Multiplication of two numbers:"+result);
		}
		else if(operation.equals("/"))
		{
			result=num1/num2;
			System.out.println("Division of two numbers:"+result);
		}
		else
		{
			System.out.println("Invalid Operation");
		}
	}
}
 
 
 
 