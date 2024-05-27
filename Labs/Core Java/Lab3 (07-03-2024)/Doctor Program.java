/*Lab Q2) Create a program in java to implement multilevel inheritance and hierarchical inheritance.
Take classes like: Doctor,Surgeon and Nurse
Create method and show method overriding.*/

import java.util.Scanner;
class Doctor
{
	String d_name,d_specialist;
	Scanner sc=new Scanner(System.in);
	public Doctor() // no-args constructor
	{
		System.out.println(" Input given for Class Doctor");
		System.out.println("Enter Doctor Name:");
		d_name=sc.next();
		System.out.println("Enter Specialist:");
		d_specialist=sc.next();
	}
	public void display()
	{
		//System.out.println("Output is Class Doctor");
		System.out.println("Output of Multilevel inheritance");
		System.out.println("Doctor Name is "+d_name);
		System.out.println("Specialist "+d_specialist);
	}
}
class Surgeon extends Doctor
{
	String s_type;
	public Surgeon()
	{
		System.out.println("Input given for Class Surgeon");
		System.out.println("Enter the Surgeon Type:");
		s_type=sc.next();
	}
	public void get()
	{
		//System.out.println(" Output is Class Surgeon");
		System.out.println("The Surgeon Type "+s_type);
	}
}
class Nurse extends Surgeon
{
	String n_name,n_role;
	public Nurse()
	{
		System.out.println(" Input given for Class Nurse");
		System.out.println("Enter Nurse Name:");
		n_name=sc.next();
		System.out.println("Enter Nurse Role:");
		n_role=sc.next();
	}
	public void output()
	{
		//System.out.println("Output is Class Nurse");
		//System.out.println("Output of Multilevel inheritance");
		System.out.println("Nurse Name is "+n_name);
		System.out.println("Nurse Role in Hospital  "+n_role);
	}
	/*public static void main(String args[])
	{
		/*Doctor d=new Doctor();
		d.display();
		Surgeon s=new Surgeon();
		s.display();
		s.get();*/
		/*Nurse n=new Nurse();
		n.display();
		n.get();
		n.output();
	}*/
}
class DoctorDemo
{
	public static void main(String args[])
	{
		/*Doctor d=new Doctor();
		d.display();
		Surgeon s=new Surgeon();
		s.display();
		s.get();*/
		Nurse n=new Nurse();
		n.display();
		n.get();
		n.output();
	}
}


/* 

OUTPUT

C:\Users\Monika\Desktop\Java For Anudip>javac DoctorDemo.java
C:\Users\Monika\Desktop\Java For Anudip>java DoctorDemo
 Input given for Class Doctor
Enter Doctor Name:
salish
Enter Specialist:
Cardiologists
Input given for Class Surgeon
Enter the Surgeon Type:
Ophthalmologist
 Input given for Class Nurse
Enter Nurse Name:
sonali
Enter Nurse Role:
Caregiver
Output of Multilevel inheritance
Doctor Name is salish
Specialist Cardiologists
The Surgeon Type Ophthalmologist
Nurse Name is sonali
Nurse Role in Hospital  Caregiver

*/