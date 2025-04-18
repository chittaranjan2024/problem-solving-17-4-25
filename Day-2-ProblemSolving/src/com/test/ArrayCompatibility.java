package com.test;

public class ArrayCompatibility {
	
	public  static boolean areArrayCompatible(int arr1[],int arr2[])
	{
		if(arr1.length!=arr2.length)
			return false;
		
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]%2!=arr2[i]%2)
			{
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
	
		int arr1[]= {2,3,4,5};
		int arr2[]= {6,7,8,9};
		
		if(areArrayCompatible(arr1, arr2))
		{
			System.out.println("The arrays are compitable");
		}
		else
		{
			System.out.println("The arrays are not compitable");
		}
		
		

	}

}
