package com.test;

public class LongestCommonSubstring {
	
	static String lcs(String s1,String s2)
	{
		int n=s1.length();
		int m=s2.length();
		
		//Step 1: Create a 2D array to store common substring lengths
		int dp[][]=new int[n+1][m+1];
		int maxLength=0;//Initialize a variable to store Longest common substrings length
		int endIndex=0;	
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=m;j++)
			{
				//If the characters at the current indices are the same, extend the substring 
				if(s1.charAt(i-1)==s2.charAt(j-1))
				{
					int val=1+dp[i-1][j-1];
					dp[i][j]=val;
					maxLength=Math.max(maxLength,val);//update the max LCS length
					endIndex=i;
				}
				else
				{
					dp[i][j]=0;//Reset the LCS length if characters don't match
				}
			}
		}
		
		return s1.substring(endIndex-maxLength,endIndex	);//return the length of the longest common substring
		
		
	}

	public static void main(String[] args) {
		String s1="abcdef";
		String s2="zcdemf";
		String result=lcs(s1,s2);
		System.out.println(result);
		System.out.println(result.length());
	}

}
