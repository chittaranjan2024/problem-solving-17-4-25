import java.util.Arrays;

public class DutchNationalFlagProblem {

	private static void sort(int nums[])
	{
		int low=0,mid=0,high=nums.length-1;
		 
		while(mid<=high)
		{
			switch(nums[mid])
			{
			case 0: 
				//swap nums[low] and nums[mid], move both pointers
				int temp0=nums[low];
				nums[low++]=nums[mid];
				nums[mid++]=temp0;
				break;
				
			case 1:	
				//move the mid pointer
				mid++;
				break;
			case 2:	
				//swap nums[mid] and nums[high], move high pointer
				int temp2=nums[mid];
				nums[mid]=nums[high];
				nums[high--]=temp2;
				break;
			}
			
		}
	}
	
	public static void main(String[] args) {
		
		int arr[]={2,0,2,1,1,0};
		
		System.out.println(Arrays.toString(arr));
		sort(arr);
		System.out.println(Arrays.toString(arr));
		
	}

}
