/*1)WAP for creating the mini calculator.  you have to perform an operation on the basis of user choice until the user press yes to continue(add, mul, sub ,div)*/
 import java.util.Scanner;
 class Calculator
 {
	public static void main(String args[]) //main method 
	{
		char input; // input variable
		do
		{
			int result;
			Scanner sc=new Scanner(System.in); // given input to the user
			System.out.println("Enter the Frist Number:");
			int num1=sc.nextInt();
			System.out.println("Enter the Second Number:");
			int num2=sc.nextInt();
			System.out.println("Enter the Operation +,-,*,/:");
			String operation=sc.next();
			if(operation.equals("+")) // condition 
			{
				result=num1+num2; // addition of two numbers
				System.out.println("Addition of two numbers:"+result); // print the output
			}
			else if(operation.equals("-"))
			{ 
				result=num1-num2; // addition of two numbers
				System.out.println("Substraction of two numbers:"+result); // print the output
			}
			else if(operation.equals("*"))
			{
				result=num1*num2; // addition of two numbers
				System.out.println("Multiplication of two numbers:"+result); // print the output 
			}
			else if(operation.equals("/"))
			{
				result=num1/num2; // addition of two numbers
				System.out.println("Division of two numbers:"+result); // print the output
			}
			System.out.println("Would you like to continue?(yes/no)"); // continue to the program we choice option 
		    input=sc.next().charAt(0);
		}while(input=='y'||input=='Y'); // yes the loop is continue to the execution 
		System.out.println("Bye!");
		sc.close();
	}
}
 
 /* OUTPUT
 
 C:\Users\Monika\Desktop\Java For Anudip>javac calculator.java

C:\Users\Monika\Desktop\Java For Anudip>java calculator
Enter the Frist Number:
8
Enter the Second Number:
5
Enter the Operation +,-,*,/:
+
Addition of two numbers:13
Would you like to continue?(yes/no)
y
Bye!

*/
 
 
 