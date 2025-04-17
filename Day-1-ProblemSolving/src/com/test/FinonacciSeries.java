package com.test;

import java.util.Scanner;

public class FinonacciSeries {
	
	public static 	int fibonacci(int n)
	{
		//base cases
		if(n==0) return 0;
		if(n==1) return 1;
		
		return fibonacci(n-1)+fibonacci(n-2);//it calculates the sum of the two previous terms
	}

	public static void main(String[] args) {
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number of term:");
		int num=scanner.nextInt();
		
		int first=0, second=1;
		
		System.out.print("Fibonacci Series: "+first +" "+second+" ");
		
		for(int i=2;i<=num;i++)
		{
			int next=first+second;
			System.out.print(" "+next);
			
			first=second;
			second=next;
		}
		
		
		for(int i=0;i<=num;i++)
		{
		 System.out.println(fibonacci(i)+" ");
		}

	}

}
