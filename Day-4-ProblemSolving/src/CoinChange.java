//amount=0 0coins  
public class CoinChange {
	
	public static int coinChange(int []coins,int amount)
	{
		int max=amount+1;
		int dp[]=new int[amount+1];//dp array
		
		
		//Initialize the DP array with large numbers
		for(int i=0;i<=amount;i++)
		{
			dp[i]=max;
		}
		
		dp[0]=0;
		
		for(int i=0;i<=amount;i++)
		{
			for(int coin:coins)
			{
				if(coin<=i)
				{
					dp[i]=Math.min(dp[i],dp[i-coin]+1);
				}
			}
		}
		
		
		
		return dp[amount]>amount?-1:dp[amount];
	}

	public static void main(String[] args) {
		
		int[] coin= {1,2,5};
		int amount=27;
		
		int result=coinChange(coin, amount);
		
		System.out.println(result);
		

	}

}

/**
 * 
 * 
 */
