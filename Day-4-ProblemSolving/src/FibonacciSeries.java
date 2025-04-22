
public class FibonacciSeries {
	
	static int fibonacci(int n)
	{
		if(n<=1)
		{
			return n;
		}
		
		return fibonacci(n-1)+fibonacci(n-2);//tail recursion
	}
	
	public static void main(String args[])
	{
		int n=7;
		for(int i=0;i<n;i++)
		{
				System.out.println(fibonacci(i)+" ");
		}
	}

}

//fibo(0)=0 fibo(1)=1
//For every fibo(n) it will call fibo(n-1) and fibo(n-2) - leads to exponential number of calls
//time - O(2n)  space- O(n) 

