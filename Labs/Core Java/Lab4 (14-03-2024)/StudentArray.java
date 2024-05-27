/*3) Create a class Student and implement array and display details of student.*/
import java.util.Scanner;
class Student // class declared
{
	int sid,age;
	String sname ,gender;
	Scanner sc=new Scanner(System.in); // input to the user
	Student() // no-args constructor
	{
		System.out.println("Enter Student ID:");
		this.sid=sc.nextInt();
		System.out.println("Enter Student Name:");
		this.sname=sc.next(); 
		System.out.println("Enter Student Gender:");
		this.gender=sc.next();
		System.out.println("Enter Student Age:");
		this.age=sc.nextInt(); 
	}
}
class StudentArray  // main class of array
{
	public static void main(String args[]) // main method of program
	{
		
		Student  []arr=new Student[3]; //create a array to store student details
	
		for(int i=0;i<3;i++)  //printing the array objects
		{
			Student s =new Student(); // create object of class
			arr[i]=s; // add students in array
			s=arr[i]; //  display students value in array
			System.out.println("Stduent ID "+s.sid+" Student Name "+s.sname+" Genter "+s.gender+" Age "
			+s.age);  //print the output 
		}
	}
}
		
/*
OUTPUT

C:\Users\Monika\Desktop\Java For Anudip>javac StudentArray.java

C:\Users\Monika\Desktop\Java For Anudip>java StudentArray
Enter Student ID:
101
Enter Student Name:
Monika
Enter Student Gender:
female
Enter Student Age:
23
Stduent ID 101 Student Name Monika Genter female Age 23
Enter Student ID:
102
Enter Student Name:
Amit
Enter Student Gender:
male
Enter Student Age:
26
Stduent ID 102 Student Name Amit Genter male Age 26
Enter Student ID:
103
Enter Student Name:
Shrutika
Enter Student Gender:
female
Enter Student Age:
24
Stduent ID 103 Student Name Shrutika Genter female Age 24


*/	


