package com.accesssspecifier2;

import com.accesssspecifier.Parent1;
public class Child2 extends Parent1
{
	public static void main(String[] args) 
	{
		System.out.println("diff package with inheritance calling");
		System.out.println("parent1 static methods calling");
		Parent1.method3();
		Parent1.method4();
		System.out.println(" ");
		System.out.println("Child Class non static methods calling");
		Child2 obj = new Child2();
		obj.method7();
		obj.method8();
		System.out.println("");
		System.out.println("parent1 diff package calling");
		Parent1 object = new Parent1();
		object.method8();
	
	}
}
