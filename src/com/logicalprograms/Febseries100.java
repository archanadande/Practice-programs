package com.logicalprograms;

public class Febseries100 
{
	public void feb()
	{
		int a=0;
		int b=1;
		int sum;
		System.out.println(a);
		System.out.println(b);
		do
		{
			sum=a+b;
			if(sum<100)
			{
		System.out.println(sum);
			}  
			a=b;
			b=sum;
		}while(sum<100);
	}
	public static void main(String[] args)
	{
		Febseries100 n=new Febseries100();
		n.feb();
	}
}
