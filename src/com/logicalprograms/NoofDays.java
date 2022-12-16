package com.logicalprograms;

import java.sql.Date;
import java.time.Month;
import java.util.Scanner;

import javax.xml.crypto.Data;

public class NoofDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1.January");
		System.out.println("2.February");
		System.out.println("3.March");
		System.out.println("4.April");
		System.out.println("5.May");
		System.out.println("6.June");
		System.out.println("7.July");
		System.out.println("8.Augest");
		System.out.println("9.September");
		System.out.println("10.Octomber");
		System.out.println("11.November");
		System.out.println("12.December");
		System.out.println();
		
		System.out.println("Enter Your Choice(Month) to Find no.s of Days in it :-");
		Scanner sc=new Scanner(System.in);
		int month=sc.nextInt();
		
		switch (month)
		{
		case 1:
			System.out.println("Days 31");
			break;
		case 2:
			System.out.println("Days 28  or  29");
			break;	
		case 3:
			System.out.println("Days 31");
			break;
		case 4:
			System.out.println("Days 30");
			break;	
		case 5:
			System.out.println("Days 31");
			break;
		case 6:
			System.out.println("Days 30");
			break;	
		case 7:
			System.out.println("Days 31");
			break;
		case 8:
			System.out.println("Days 31");
			break;	
		case 9:
			System.out.println("Days 30");
			break;
		case 10:
			System.out.println("Days 31");
			break;	
		case 11:
			System.out.println("Days 30");
			break;
		case 12:
			System.out.println("Days 31");
			break;				

		default:
			System.out.println("Invalid Choice!!!!!!!");
			break;
		}
		

	}

}
