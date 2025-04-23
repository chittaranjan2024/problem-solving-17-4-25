import java.util.ArrayList;
import java.util.List;

public class RatInAMaze {

	static List<String> result=new ArrayList<>();
	
	static boolean isSafe(int [][]maze,int x,int y,boolean [][]visited,int n)
	{
		if(x>=0 && x<n  && y>=0 && y<n && maze[x][y]==1 && !visited[x][y])
		{
			return true;
		}
		
		return false;
	}
	
	
	static void solveMaze(int [][]maze,int x,int y,String path,boolean [][]visited,int n)
	{
		if(x==n-1 && y==n-1)//base case: reached the destination
		{
			result.add(path);
			return;
		}
		//Mark the current cell as visited
		visited[x][y]=true;
		
		//Direction vectors: D,L,R,U
		
		int [] dx= {1,0,0,-1};//row changes(D,L,R,U)
		int [] dy= {0,-1,1,0};//column changes(D,LR,U)
		char[] dir= {'D','L','R','U'};
		
		for(int i=0;i<4;i++)
		{
			int newX=x+dx[i];
			int newY=y+dy[i];
			
			if(isSafe(maze, newX, newY, visited, n))
			{
				solveMaze(maze, newX, newY, path+dir[i], visited, n);
			}
				
		}
		
		visited[x][y]=false;//backtracking
		
	}
	
	
	public static void main(String[] args) {
		int [][] maze= {
				{1,0,0,0},
				{1,1,0,1},
				{1,1,0,0},
				{1,1,1,1}
		};
	
		int n=maze.length;
		boolean[][] visited=new boolean[n][n];
		
		if(maze[0][0]==1)
		{
			solveMaze(maze, 0, 0, "", visited, n);
		}
		
		System.out.println(result);
			

	}

}
 