package com.accesssspecifier;
//with inheritance
public class Grandchild1 extends Parent1
{
	public static void main(String[] args) 
	{
		System.out.println("same package ,diff class with inheritance calling ");
		System.out.println("parent1 static methods calling");
	    Parent1.method2();
	    Parent1.method3();
	    Parent1.method4();
	    System.out.println("");
	    System.out.println("paent1 non static methods calling");
	    Parent1 obj = new Parent1();
	    Parent1.method2();
	    Parent1.method3();
	    Parent1.method4();
	}
}
