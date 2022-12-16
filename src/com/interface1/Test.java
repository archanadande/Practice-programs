package com.interface1;

public class Test
{
public static void main(String[] args) 
{
	Child1 c1 = new Child1();
	System.out.println("child 1 properties");
	c1.bunglow();
	c1.car();
	c1.farm();
	System.out.println("");
	Child2 c2 = new Child2();
	System.out.println("child 2 properties");
	c2.bunglow();
	c2.car();
	c2.farm();
	c2.laptop();
	System.out.println("");
	Child3 c3 = new Child3();
	System.out.println("child 3 properties");
	c3.bunglow();
	c3.car();
	c3.farm();
	c3.bike();
	//we cannot create object of interface.To create object of interface
	//we have to use implementation. 
	
	//Parent1 p1 = new Parent1();
	//p1.farm();
	//Childinterface ci = new Childinterface();
	//ci.car();
}
}
