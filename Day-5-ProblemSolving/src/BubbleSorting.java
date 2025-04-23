import java.util.Arrays;

public class BubbleSorting {
	
	private static void sort(int arr[])
	{
		int n=arr.length;
		boolean swapped = false;
		
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					 int temp=arr[j];
					 arr[j]=arr[j+1];
					 arr[j+1]=temp;
					 
					 swapped=true;
				}
			}
			
			if(!swapped)
				break;
		}
	}

	public static void main(String[] args) {
		int arr[]= {5,2,6,23,45,3,89};
		
		System.out.println(Arrays.toString(arr));
		sort(arr);
		System.out.println(Arrays.toString(arr));
		
		

	}

}
