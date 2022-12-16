package com.polymorphisam;

public class Methodoverloading extends Polymorphism
{
	public void add()
	{
		System.out.println("method without parameter");
	}
	public void add(int a)
	{
		System.out.println(a);
	}
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
	public void add(int a,String b)
	{
		System.out.println(a+b);
	}
	public static void main(String[] args)
	{
	Methodoverloading obj = new Methodoverloading();
	obj.add();
	obj.add(10);
	obj.add(20,10);
	obj.add(30, "archana");
	obj.add(20, 30, 5);
	}
}
