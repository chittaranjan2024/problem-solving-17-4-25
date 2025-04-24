import java.util.Arrays;

public class CountingSort {
	
	public static void sort(int arr[],int max,int min)
	{
		int range=max-min+1;
		
		int count[]=new int[range];
		
		for(int num:arr)
		{
			count[num-min]++;
		}
		
		int index=0;
		for(int i=0;i<range;i++)
		{
			while(count[i]>0)
			{
				arr[index++]=i+min;
				count[i]--;
			}
		}
		
	}

	public static void main(String[] args) {
		int arr[]= {4,2,-3,0,4,2,-1,-3};
		int max=0,min=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			max=arr[i];
			
			if(arr[i]<min)
			min=arr[i];	
		}
		
		System.out.println(Arrays.toString(arr));
		sort(arr, max, min);
		System.out.println(Arrays.toString(arr));
		

	}

}
