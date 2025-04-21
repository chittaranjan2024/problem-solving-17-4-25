package com.test;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

	public static Character findFirstNonrepeatingCharacter(String input)
	{
		Map<Character, Integer> map=new LinkedHashMap<Character, Integer>();
		
		for(char ch:input.toCharArray())
		{
			map.put(ch, map.getOrDefault(ch,0)+1);
		}
		
		
		for(Map.Entry<Character, Integer> entry:map.entrySet())
		{
			if(entry.getValue()==1)
			{
			 return entry.getKey();	
		    }
		}
		
		return null;
	}
	
	
	public static void main(String[] args) {
		
		String input="swiss";
		System.out.println(findFirstNonrepeatingCharacter(input));
		

	}

}
