/*create a class named Employee with attributes name, employeeId,designation and salary include a method calculateBouns() that returns 5% of the salary as bouns.*/
import java.util.Scanner;
class Employee
{
 String name;
 int id;
 String designation;
 double salary;
	void set()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Name:");
		name=sc.next();
		System.out.println("Enter Employee ID:");
		id=sc.nextInt();
		System.out.println("Enter Employee Designation:");
		designation=sc.next();
		System.out.println("Enter Employee Salary:");
		salary=sc.nextDouble();
	}
	void CalculateBouns()
	{
	double bouns,Bouns_Amount_salary;
	//bouns=salary*0.05/100;
	bouns=salary*0.05;
	Bouns_Amount_salary=salary+bouns;
	System.out.println("Employee Name:"+name);
	System.out.println("Employee ID:"+id);
	System.out.println("Employee Designation:"+designation);
	System.out.println("Employee Salary:"+salary);
	System.out.println("Employee Bouns:"+bouns);
	System.out.println("Employee Bouns+Salary:"+Bouns_Amount_salary);
	}
}
class EmployeeDemo
{
	public static void main(String args[])
	{
	Employee e1=new Employee();
	e1.set(); 
	e1.CalculateBouns();
	}
}