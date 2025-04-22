
public class SumOfTheDigitsUsingRecursion {
	
	public static int sumOfDigits(int num)
	{
		if(num==0) return 0;
		
		return (num%10)+sumOfDigits(num/10);
	}

	public static void main(String[] args) {
		
		int number=1234;
		int result=sumOfDigits(number);
		System.out.println(result);
		

	}

}
