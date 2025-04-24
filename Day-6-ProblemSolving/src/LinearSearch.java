
public class LinearSearch {
	
	public static int search(int ar[],int target)
	{
		
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==target)
			{
				return i;
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		int arr[]= {5,2,6,23,45,3,89};
		
		int result=search(arr, 45);
		
		if(result==-1)
		{
			System.out.println("Element not found ");
		}
		else
		{
			System.out.println("Element found at "+result+" position");
		}

	}

}
