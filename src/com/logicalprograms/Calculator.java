package com.logicalprograms;

import java.util.Scanner;

public class Calculator 
{
	public static int addition(int a,int b)
	{
		int c;
		c=a+b;
		return c;
	}
	public static int substraction(int a,int b)
	{
		int c;
		c=a-b;
		return c;
	}
	public static int multiplication(int a, int b)
	{
		int c;
		c=a*b;
		return c;
	}
	public static int division(int a,int b)
	{
		int c;
		c=a/b;
		return c;
	}
	public static void main(String[] args)
	{
		int d;
		int e;
		int f;
	System.out.println("enter two numbers");
	Scanner num1 = new Scanner(System.in);
	d=num1.nextInt();
	e=num1.nextInt();
	System.out.println("which operation you want to perfrom");
	System.out.println("for addition press 1");
	System.out.println("for substraction press 2");
	System.out.println("for multiplication press 3");
	System.out.println("for division press 4");
    f=num1.nextInt();
    switch(f)
    {
    case 1:
    	//addition(d,e);
    	System.out.println("addition is "+addition(d,e));
    	break;
    case 2:
    	//substraction(d,e);
    	System.out.println("substraction is "+substraction(d,e));
    	break;
    case 3:
    	//multiplication(d,e);
    	System.out.println("multiplication is "+multiplication(d,e));
    	break;
    case 4:
    	//division(d,e);
    	System.out.println("division is "+division(d,e));
    	break;
    default:
    	System.out.println("Invalid operation");
    	break;
    }
	}
}
