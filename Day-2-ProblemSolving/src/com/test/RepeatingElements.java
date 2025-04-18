package com.test;

import java.util.HashMap;
import java.util.Map;

public class RepeatingElements {

	public static void main(String[] args) {
		int arr[]= {4,5,6,7,4,6,8,5};
		
		//HashMap to store elements and their counts
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		
		
		for(int num:arr)
		{
			if(map.containsKey(num))
			{
				map.put(num, map.get(num)+1);
			}
			else
			{
				map.put(num, 1);
			}
		}
		
		
		System.out.println("Repeating elements are:");
		for(Map.Entry<Integer, Integer> entry:map.entrySet())
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey()+" ");
			}
		}

	}

}
