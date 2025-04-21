package com.test;

public class SpaceReplacer {
	
	private static String replaceSpaces(String input)
	{
		if(input==null || input.length()==0)
		{
			return input;
		}
		
		StringBuilder result=new StringBuilder();
		
		for(char ch:input.toCharArray())
		{
			if(ch==' ')
			{
				result.append("%20");
			}
			else
			{
				result.append(ch);
			}
		}
		
		return result.toString();
	}

	public static void main(String[] args) {
		
		String original="Java is awesome";
		System.out.println(replaceSpaces(original));
		

	}

}
