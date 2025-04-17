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




/**
 * factorial(5)
 * =5 * factorial(5-1)
 * =5 * (4 * factorial(4-1))
 * =5 * (4 * (3 * factorial(3-1))
 * =5 * (4 * (3 * 2 * factorial(2-1)))
 * =5 * (4 * (3 * 2 * 1 * factorial(1-1)))
 * =5 * (4 * (3 * 2 * 1 * 1))
 * =120
 * 
 * 
 */










