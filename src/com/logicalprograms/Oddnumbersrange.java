package com.logicalprograms;

import java.util.Scanner;

//print odd numbers in reverse order from 10 to 20 range
public class Oddnumbersrange
{
	public static void odd(int a, int b)
	{
		int min=10;
		int max=20;
		for(int i=max;i>=min;i--)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args)
	{
		int c;
		int d;
	    Scanner num1=new Scanner(System.in);
		System.out.println("enter number");
		c=num1.nextInt();
		Scanner num2=new Scanner(System.in);
		d=num2.nextInt();
		odd(c ,d);
		
	}
}
