import java.util.Arrays;

public class SelectionSort {
	
	private static void sort(int arr[])
	{
		int n=arr.length;
		
		for(int i=0;i<n-1;i++)
		{
			int minIndex=i;
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]<arr[minIndex])
				{
					minIndex=j;
				}
			}	
				int temp=arr[minIndex];
				arr[minIndex]=arr[i];
				arr[i]=temp;
				
			
		}
	}

	public static void main(String[] args) {
		int arr[]= {5,2,6,23,45,3,89};
		
		System.out.println(Arrays.toString(arr));
		sort(arr);
		System.out.println(Arrays.toString(arr));
		

	}

}
