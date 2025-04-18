package com.test;

import java.util.Arrays;

public class ArrayRotation {

	private static void reverse(int arr[],int start,int end)
	{
		while(start<end)
		{
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
	
	
	public static void rightRotation(int arr[],int k)
	{
		int n=arr.length;
		reverse(arr, 0, n-1);//reverse the entire array
		reverse(arr, 0, k-1);//reverse the first k elements
		reverse(arr, k, n-1);//reverse the rest of the array	
	}
	
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6,7};
		int k=3;
		
		System.out.println(Arrays.toString(arr));
		rightRotation(arr, k);
		System.out.println("After Right rotation by k position:");
		System.out.println(Arrays.toString(arr));
		
		

	}

}



/**
 * [1,2,3,4,5,6,7]
 * first    - [7,6,5,4,3,2,1]
 * second   - [5,6,7,4,3,2,1]
 * third    - [5,6,7,1,2,3,4]
 */

