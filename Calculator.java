package com.vivek;

public class Calculator 
{
	int a=100,b;//instance variable default value if not initialized
	void add()
	{
		System.out.println(a+" "+b);
	}
	void subtract()
	{
//		int y;//local variable
//		System.out.println(y);//compilation error
	}
	void display()
	{
		int a=10;//local scope is upper over instance variable
		System.out.println(a);
		//this will instance the variable and show the instance variable present in the class.
		System.out.println(this.a);//this will help in getting a=100 from above.
	}
	public static void main(String[] args) {
		Calculator c= new Calculator();
		c.display();
		c.add();
	}

}
