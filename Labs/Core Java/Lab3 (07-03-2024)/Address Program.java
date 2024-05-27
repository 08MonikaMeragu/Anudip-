/* Lab Q1)Define a class Address representing an address with attributes such as street,city,state,zip code. provide constructors to initialize these attributes.*/

class Address
 {
	String street,city,state; //variable initialize
	int zip_code;
	public Address()         //no argument constructor
	{
		this.street="Kumbhari Road"; // input is given through the manual
		this.city="Solapur";
		this.state="Maharashtra";
		this.zip_code=413006;
		System.out.println("No argument constructor is called");  //printed
	}
	public Address(String street ,String city,String state,int zip_code)   //parameterize constructor 
	{
	this.street=street;  
	this.city=city;
	this.state=state;
	this.zip_code=zip_code;
	System.out.println("Parameterize constructor is called");
	}
	void printData()      //to print 
	{
		System.out.println("Street :"+this.street+" City:"+this.city+" State: "+state+" Zip Code: "+zip_code);
		
	}
}
class AddressDemo
{	
	public static void main(String args[])
	{
		Address a=new Address();     //created the new object of the class
		a.printData();   //calling the print method
		
		//created object than given parameter value pass
		Address a1=new Address("Hyderabad Road","Solapur","Maharashtra",413005); 
		a1.printData(); // print  method call
	}
}



/* 
 OUTPUT
 
 C:\Users\Monika\Desktop\Java For Anudip>javac AddressDemo.java

C:\Users\Monika\Desktop\Java For Anudip>java AddressDemo
No argument constructor is called
Street :Kumbhari Road City:Solapur State: Maharashtra Zip Code: 413006
Parameterize constructor is called
Street :Hyderabad Road City:Solapur State: Maharashtra Zip Code: 413005

*/
 
 
 