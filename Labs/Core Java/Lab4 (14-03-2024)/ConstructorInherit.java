/*4) Create a base class with constructor and inherit it in the derived class and call the base class constructor in derived class.*/

class Base
{
	Base()
	{
		System.out.println("This is base class Constructor");
	}
}
class Derived extends Base
{
	Derived()
	{
		super();
		System.out.println("This is derived class constructor");
	}
}
class ConstructorInherit
{
	public static void main(String args[])
	{
		Derived d=new Derived();
	}
}
	
	/* OUTPUT
	
	
	C:\Users\Monika\Desktop\Java For Anudip>javac ConstructorInherit.java

C:\Users\Monika\Desktop\Java For Anudip>java ConstructorInherit
This is base class Constructor
This is derived class constructor


*/	
		
		