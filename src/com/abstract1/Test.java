package com.abstract1;

public class Test 
{
	public static void main(String[] args)
	{
	Grandchild g = new Grandchild();
	g.bunglow();
	g.car();
	g.signin();
	g.payment();
	System.out.println("");
	
	Child2 c2 = new Child2();
	c2.bunglow();
	c2.car();
	c2.signin();
	c2.payment();
	
	//Child1 c1 = new Child1();
	//Parent p = new Parent();
	}
}
