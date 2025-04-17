package com.test;

import java.util.Scanner;

public class FactorialUsingIterativeApproach {

	private static int factorial(int num)
	{
		int fact=1;
		
		
		
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		
		return fact;
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
