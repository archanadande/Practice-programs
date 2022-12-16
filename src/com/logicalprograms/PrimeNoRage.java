package com.logicalprograms;

import java.util.Scanner;

public class PrimeNoRage {

	
	public void PrimeRange(int min, int max)
	{
				
		for (int i = min; i <=max; i++) 
		{
			int flag = 0;

			for (int j = 2; j <i; j++)
			{
				if(i%j==0)
				{
					flag++;
					break;
				}
		
							}
			if(flag==0)
				System.out.println(i);

			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min,max;
		Scanner sc=new Scanner(System.in);
		min=sc.nextInt();
		max=sc.nextInt();
		PrimeNoRage p=new PrimeNoRage();
		p.PrimeRange(min, max);

	}

}
