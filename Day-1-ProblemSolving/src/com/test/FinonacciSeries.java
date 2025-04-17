package com.test;

import java.util.Scanner;

public class FinonacciSeries {

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

	}

}
