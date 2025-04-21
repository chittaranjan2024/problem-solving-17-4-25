package com.test;

public class CompressAString {
	
	private static String compressString(String input)
	{
		if(input==null || input.length()==0)
		{
			return input;
		}
		
		StringBuilder result=new StringBuilder();
		int count=1;
		
		for(int i=1;i<input.length();i++)
		{
			if(input.charAt(i)==input.charAt(i-1))
			{
				count++;
			}
			else
			{
				result.append(input.charAt(i-1)).append(count); 
				count=1;
			}
			
		}
		
		result.append(input.charAt(input.length()-1)).append(count);
		
		return result.toString();
		
	}

	public static void main(String[] args) {
		String st="aaabbbccc";
		
		System.out.println(st);
		System.out.println(compressString(st));

	}

}
