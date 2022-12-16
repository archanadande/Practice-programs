package com.logicalprograms;
//find sum of all numbers in user defined range. range from 1 to 5
import java.util.Scanner;

public class Sumrange
{
	public static void sum(int a, int b)
	{
		int c=0;
		for(int i=a;i<=b;i++)
		{
			c=c+i;	
		}
		System.out.println("addition is "+c);
	}
	public static void main(String[] args)
	{
	int d;
	int e;
	System.out.println("enter two numbers to give range");
	Scanner num1=new Scanner(System.in);
			d=num1.nextInt();
	        e=num1.nextInt();
	        sum(d,e);
	}
}
