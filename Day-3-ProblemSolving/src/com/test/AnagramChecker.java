package com.test;

import java.util.Arrays;

public class AnagramChecker {
	
	private static boolean areAnagrams(String st1,String st2)
	{
		//step 1: Remove spaces and convert to lower case
		st1=st1.replaceAll("\\s", "").toLowerCase();//silent
		st2=st2.replaceAll("\\s", "").toLowerCase();//listen
		
		//step 2: If they lengths are different, they can not be anagrams 
		if(st1.length()!=st2.length())//
			return false;
		
		//step 3:Convert strings to character arrays
		char[] array1=st1.toCharArray(); //['s','i','l','e','n','t']
		char[] array2=st2.toCharArray(); //['l','i','s','t','e','n']
		
		//step 4:Sort both the character arrays
		Arrays.sort(array1);//['e','i','l','n','s','t']
		Arrays.sort(array2);//['e','i','l','n','s','t']
		
		//step 5:compare sorted arrays
		return Arrays.equals(array1, array2);//true
	}

	public static void main(String[] args) {
		
		String st1="Hello";
		String st2="World";
		
		System.out.println(areAnagrams(st1, st2));

	}

}
