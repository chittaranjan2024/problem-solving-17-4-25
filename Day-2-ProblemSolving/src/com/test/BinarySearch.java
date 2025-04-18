package com.test;

public class BinarySearch {
	
	private static int search(int arr[],int n,int target)
	{
		int low=0, high=n-1;
		while(low<=high)
		{
			int mid=low+(high-low)/2;//to avoid int overflow
			
			if(arr[mid]==target)
			{
				return mid;
			}
			
			else if(arr[mid]>target)
			{
				high=mid-1;
			}
			else
			{
				low=mid+1;
			}
			
		}
		
		return -1;
		
	}

	public static void main(String[] args) {
		
		int arr[]= {12,34,56,78,89,90,345};
		int size=arr.length;
		int target=90;
		int result=search(arr,size,target);
		if(result==-1)
		{
			System.out.println("Element not found!");
		}
		else
		{
			System.out.println(result);
		}
	}

}
