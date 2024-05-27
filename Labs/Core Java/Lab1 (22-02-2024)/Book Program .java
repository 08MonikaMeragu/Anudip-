/*Create a class named Book with attributes title,author,ISBN,and price include method to get and set the attributes.*/

import java.util.Scanner;
class Book
{
	String title,author;
	int ISBN;
	float price;
	public Book()
	{
		this.title=title;
		this.author=author;
		this.ISBN=ISBN;
		this.price=price;
	}
	void set()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Book Title:");
		title=sc.next();
		System.out.println("Enter the Book Author:");
		author=sc.next();
		System.out.println("Enter the Book  ISBN:");
		ISBN=sc.nextInt();
		System.out.println("Enter the Book Price:");
		price=sc.nextFloat();
	}
	void get()
	{
	System.out.println("Book Title:"+title);
	System.out.println("Book Author:"+author);
	System.out.println("Book ISBN:"+ISBN);
	System.out.println("Book Price:"+price);
	}
}
class BookDemo
{
	public static void main(String args[])
	{
	Book b1=new Book();
	b1.set();
	b1.get();
	}
}