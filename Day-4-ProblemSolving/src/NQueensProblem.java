
public class NQueensProblem {

	private int size;
	
	public NQueensProblem(int n)
	{
		this.size=n;
	}
	
	public void solve()
	{
		char[][] board=new char[size][size];
		
		for(int i=0;i<size;i++)
		{	
			for(int j=0;j<size;j++)
			{
				board[i][j]='.';
			}
		}
		
		
		solveNQueens(board, 0);
			
	}
	
	
	private void solveNQueens(char [][]board,int row)
	{
		if(row==size)
		{
			printBoard(board);
			System.out.println();
			return;
		}
		
		for(int col=0;col<size;col++)
		{
			if(isSafe(board, row, col))
			{
				board[row][col]='Q';  //Placing queen
				solveNQueens(board,row+1);//recursion for next row
				board[row][col]='.';//backtracking
			}
		}
		
	}
	
	
	private boolean isSafe(char[][] board,int row,int col)
	{
		//check column
		for(int i=0;i<row;i++)
		{
			if(board[i][col]=='Q')
			{
				return false;
			}
		}
		
		//check upper-left diagonal
		for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--)
		{
			if(board[i][j]=='Q')
			{
				return false;
			}
		}
		
		
		//check upper-right diagonal
		for(int i=row-1,j=col+1;i>=0&&j<size;i--,j++)
		{
			if(board[i][j]=='Q')
			{
				return false;
			}
		}
		
		return true;
		
	}
	
	
	public void printBoard(char[][] board)
	{
		for(int i=0;i<size;i++)
		{	
			for(int j=0;j<size;j++)
			{
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int n=6;
		NQueensProblem solver=new NQueensProblem(n);
		solver.solve();

	}

}
