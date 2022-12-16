package com.accesssspecifier;

public class Child1 
{
	public static void main(String[] args) 
	{
	System.out.println("same package, different class calling without inheritance");
	System.out.println("parent1 static methods calling");
	Parent1.method2();
	Parent1.method3();
	Parent1.method4();
	System.out.println("");
	System.out.println("parent1 non static calling");
	Parent1 obj = new Parent1();
	obj.method6();
	obj.method7();
	obj.method8();
	}
}
