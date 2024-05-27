/*3) A program that calculates Body Mass Index (BMI) based on user input of weight and height, and then categorizes the BMI into underweight, normal, overweight, or obese categories using if-else statements.*/
import java.util.Scanner;
class CalculateBMI
{
	public static void main(String args[])
	{
		double weight,height,BMI; //variables
		Scanner sc=new Scanner(System.in); // take input to user
		System.out.println("Enter the Weight:");
		weight=sc.nextDouble();
		System.out.println("Enter the Height:");
		height=sc.nextDouble();
		BMI = weight / (height * height); //calculation  the part
		System.out.println("The BMI :"+BMI);
		if(BMI<18.5) // condition
		{
			System.out.println("The BMI is the underweight");//print
		}
		else if(BMI<25) // condition
		{
			System.out.println("The BMI is the Normal"); //print
		}
		else if(BMI<30) // condition
		{
			System.out.println("The BMI is the Overweight"); //print
		}
		else 
		{
			System.out.println("The BMI is the obese");
		}
	}
}



/* OUTPUT

C:\Users\Monika\Desktop\Java For Anudip>javac CalculateBMI.java

C:\Users\Monika\Desktop\Java For Anudip>java CalculateBMI
Enter the Weight:
35
Enter the Height:
1.25
The BMI :22.4
The BMI is the Normal

C:\Users\Monika\Desktop\Java For Anudip>java CalculateBMI
Enter the Weight:
40
Enter the Height:
1.56
The BMI :16.43655489809336
The BMI is the underweight

C:\Users\Monika\Desktop\Java For Anudip>java CalculateBMI
Enter the Weight:
50
Enter the Height:
1.86
The BMI :14.452537865649207
The BMI is the underweight

C:\Users\Monika\Desktop\Java For Anudip>java CalculateBMI
Enter the Weight:
55
Enter the Height:
1.46
The BMI :25.802214299118038
The BMI is the Overweight

C:\Users\Monika\Desktop\Java For Anudip>java CalculateBMI
Enter the Weight:
65
Enter the Height:
1.35
The BMI :35.66529492455418
The BMI is the obese

*/






