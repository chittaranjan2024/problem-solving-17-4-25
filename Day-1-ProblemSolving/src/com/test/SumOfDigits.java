package com.test;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=scanner.nextInt();
		int rem=0,sum=0;
		while(num>0)
		{
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		
		System.out.println(sum);

	}

}
