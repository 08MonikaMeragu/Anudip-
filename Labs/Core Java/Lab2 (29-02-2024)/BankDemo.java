/*2)Implement a bank account class showing method overloading with methods for deposit, withdrawal and balance inquiry.Use method overloading to handle different types of withdrawals (e.g., with or without fees).*/

class Bank 
{
	// variables
	int b_acc_no,pin_no;
	String b_name,cards_type,customer_name;
	double balance,total_balance,deposit_amount,withdrawal_amount;
	Bank(double balance) //parameter constructor
	{
		System.out.println("The Bank Balance of Account");
		this.balance=balance;
		System.out.println("Bank Balance Display "+balance);
	}
	// overloading constructor
	void transaction(String customer_name,int b_acc_no, String b_name,double deposit_amount) //parameter constructor
	{
		System.out.println("The Deposit Amount of Bank ");
		this.customer_name=customer_name;
		this.b_acc_no=b_acc_no;
		this.b_name=b_name;
		this.deposit_amount=deposit_amount;
		System.out.println("Customer Name "+customer_name);
		System.out.println("Bank Account Number "+b_acc_no);
		System.out.println("Bank Name "+b_name);
		System.out.println("Deposit Amount "+deposit_amount);
		this.total_balance=balance+deposit_amount;
		System.out.println("Total Amount "+total_balance);
	}
	void transaction(int pin_no,String cards_type ,double withdrawal_amount) // parameterize constructor
	{
		System.out.println("The Withdrawal the Bank Balance through the  Account");	
		this.pin_no=pin_no;
		this.cards_type=cards_type;
		this.withdrawal_amount=withdrawal_amount;
	
		System.out.println("Card PIN Number "+pin_no);
		System.out.println("Card Use Type "+cards_type);
		System.out.println("How many Amount Withdrawal "+withdrawal_amount);
		this.total_balance=balance-withdrawal_amount;
		System.out.println("Total Amount "+total_balance);
	}
	//void transaction()
	void transaction(int b_acc_no,double total_balance) // parameterize constructor
	{
		System.out.println("The Bank Balance Inquiry of Account");
		//this.customer_name=customer_name;
		this.b_acc_no=b_acc_no;
		//this.b_name=b_name;
		this.total_balance=total_balance;
		//System.out.println("Customer Name "+customer_name);
		System.out.println("Bank Account Number "+b_acc_no);
		//System.out.println("Bank Name "+b_name);
		System.out.println("Total Amount "+total_balance);
	}
}
class BankDemo //main method 
{
	public static void main(String args[])
	{
	Bank b=new Bank(35000);
	b.transaction("Amol chodari",254163987,"State of india",350);
	b.transaction(5254,"debit card",1500);
	//b.transaction(2145789632,"Bank of india",33850);
	b.transaction(2145789632,33850);
	}
}
	
	/*OUTPUT
	
	
	C:\Users\Monika\Desktop\Java For Anudip>javac BankDemo.java

C:\Users\Monika\Desktop\Java For Anudip>java BankDemo
The Bank Balance of Account
Bank Balance Display 35000.0
The Deposit Amount of Bank
Customer Name Amol chodari
Bank Account Number 254163987
Bank Name State of india
Deposit Amount 350.0
Total Amount 35350.0
The Withdrawal the Bank Balance through the  Account
Card PIN Number 5254
Card Use Type debit card
How many Amount Withdrawal 1500.0
Total Amount 33500.0
The Bank Balance Inquiry of Account
Bank Account Number 2145789632
Total Amount 33850.0

*/