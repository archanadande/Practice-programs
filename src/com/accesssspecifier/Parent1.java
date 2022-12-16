package com.accesssspecifier;

import java.nio.file.spi.FileSystemProvider;

public class Parent1
{
	private static void method1()
	{
		System.out.println("method 1 : private");
	}
	static void method2()
	{
		System.out.println("method 2 : default");
	}
	protected static void method3()
	{
		System.out.println("method 3 : protected");
	}
	public static void method4()
	{
		System.out.println("method 4 : public");
	}
	private void method5()
	{
		System.out.println("method 5 : private");
	}
    void method6()
	{
		System.out.println("method 6 : default");
	}
	protected void method7()
	{
	System.out.println("method 7 : protected");	
	}
	public void method8()
	{
		System.out.println("mrthod 8 : public");
	}
	public static void main(String[] args) 
	{
	System.out.println("static methods calling");
	method1();
	method2();
	method3();
	method4();
	System.out.println("");
	System.out.println("non static methods calling");
	Parent1 obj = new Parent1();
	obj.method5();
	obj.method6();
	obj.method7();
	obj.method8();
	}
}
