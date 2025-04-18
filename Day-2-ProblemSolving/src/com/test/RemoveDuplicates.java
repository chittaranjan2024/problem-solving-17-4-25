package com.test;

import java.util.Arrays;

public class RemoveDuplicates {

	public static int removeDuplicates(int arr[])
	{
		if(arr.length==0) return 0;
		
		int i=0;//points to the last unique element
		
		for(int j=1;j<arr.length;j++)
		{
			if(arr[i]!=arr[j])
			{
				i++;//Move forward to place the next unique element
				arr[i]=arr[j];
			}
		}
		
		return i+1;//length of array without duplicates
	}
	public static void main(String[] args) {
		
		
		int []nums= {1,1,2,2,3,4,4,5};
		System.out.println(Arrays.toString(nums));
		int length=removeDuplicates(nums);
		
		System.out.println();
		for(int i=0;i<length;i++)
		{
			System.out.print(nums[i]+" ");
		}
		
		
		

	}

}
