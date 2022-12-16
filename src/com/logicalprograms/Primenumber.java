package com.logicalprograms;

import java.util.Scanner;

//to print first 10 prime number
public class Primenumber 
{
	public void prime1()
	{
		int min;
		int max;
		Scanner num = new Scanner(System.in);
		min = num.nextInt();
		max = num.nextInt();
		
	for(int i=min;i<=max;i++)
	{
		int flag =0;
		for(int j=2;j<i;j++)
		{
			if(i%j==0)
			{
				flag ++;
				//System.out.println("Here");
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("given number is prime"+i);
		}
		
	}
	}
	public static void main(String[] args) 
	{
		
		//int count =10;
		
			
	Primenumber obj = new Primenumber();
	obj.prime1();
	}
}
