package com.test;

import java.util.Scanner;

public class PrimeNumberCheck {
	
	private static boolean isPrime(int num)
	{
		if(num<=1) return false;	
		if(num==2) return true;
		if(num%2==0) return false;
		
		for(int i=2;i<=Math.sqrt(num);i=i+2)  // n=13 3.60 - 3   - 2 - sqroot(n)  2-3
		{
			if(num%i==0)
			{
				return false;
			}
		}
		
		
		return true;
		
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		
		System.out.println(isPrime(num));
		
		

	}

}
