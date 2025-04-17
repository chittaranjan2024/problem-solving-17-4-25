package com.test;

import java.util.Scanner;

public class FactorialUsingRecursiveApproach {

	private static long factorial(int n)
	{
		if(n==0)
		{
			return 1;
		}
		else
		{
			return n*factorial(n-1);
		}
	}
	
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		
		if(num<0)
		{
			System.out.println("Factorial is not defined for negative numbers");
		}
		else
		{
			System.out.println(factorial(num));
		}

	}

}
