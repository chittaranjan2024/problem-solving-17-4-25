package com.test;

import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a String:");
		String st=scanner.nextLine();
		
		st=st.toLowerCase();
		int vowels=0;
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			
			if(ch=='a' || ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' )
			{
				vowels++;
			}
		}
		
		System.out.println(vowels);

	}

}
