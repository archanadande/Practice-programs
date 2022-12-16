package com.logicalprograms;

import java.util.Scanner;

//print the numbers which are divisible by 7 or 13 .uesr range from 5 to 40
public class Divisiblerange 
{
	public static void divisible(int a, int b)
	{
		for(int i=a;i<=b;i++)
		{
			if(i%7==0) 
			{
	
				System.out.println(i+" number is divisible by 7 ");
			}
			else
				{
				if(i%13==0)
				{
					System.out.println(i+" number is divisible by 13 ");
				}
					
				}
				}
			
		}
	public static void main(String[] args)
	{
		int c;
		int d;
		System.out.println("enter two numbers to give range");
		Scanner num1=new Scanner(System.in);
		c=num1.nextInt();
		d=num1.nextInt();
	    divisible(c,d);	
	}
}
