package com.graph;

import java.util.ArrayList;
import java.util.List;

public class CycleDetectionUndirectedGraph {

	static class  Graph
	{
		int vertices;
		List<List<Integer>> adj;
		
		
		public Graph(int v) {
			vertices=v;
			adj=new ArrayList<>();
			for(int i=0;i<v;i++)
			{
				adj.add(new ArrayList<>());
			}
		}
		void addEdge(int u,int v)
		{
			adj.get(u).add(v);
			adj.get(v).add(u);//because the graph is undirected 
		}
		
		
		boolean dfs(int current,boolean visited[],int parent)
		{
			visited[current]=true;
			
			for(int neighbor:adj.get(current))
			{
				if(!visited[neighbor])
				{
					if(dfs(neighbor,visited,current))
					{
						return true;
					}
					
				}
				else if(neighbor!=parent)
				{
					return true;	
				}
			}
			
			return false;
		}
		
		
		boolean hasCycle()
		{
			boolean visited[]=new boolean[vertices];
			
			
			for(int i=0;i<vertices;i++)
			{
				if(!visited[i])
				{
						if(dfs(i, visited, -1))
						{
							return true;
						}
				}
			}
			
			return false;
		}
	}
	
	
	
	
	public static void main(String[] args) {
		
		Graph graph=new Graph(5);
		
		 	graph.addEdge(0, 1);
	        graph.addEdge(1, 2);
	        graph.addEdge(2, 3);
	        graph.addEdge(3, 0); // This edge creates a cycle
	        
	        
	        if(graph.hasCycle())
	        {
	        	System.out.println("Cycle detected!!");
	        }
	        else
	        {
	        	System.out.println("No cycle found!!");
	        }

	}

}
