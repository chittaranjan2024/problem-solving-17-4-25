package com.graph;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
	
	private int vertices;
	private LinkedList<Integer>[] adjList;
	
	
	public BFS(int v)
	{
		this.vertices=v;
		adjList=new LinkedList[v];
		for(int i=0;i<v;i++)
		{
			adjList[i]=new LinkedList<>();
		}
	}
	
	void addEdge(int v,int w)
	{
		adjList[v].add(w);  //add w to v's list
	}

	
	void breadthFirstSearch(int start)
	{
		boolean visited[]=new boolean[vertices];
		Queue<Integer> queue=new LinkedList<Integer>();
		
		
		visited[start]=true;
		queue.add(start);
		
		
		while(!queue.isEmpty())
		{
			int current=queue.poll();
			System.out.print(current+" ");
			
			
			for(int neighbor:adjList[current])
			{
				if(!visited[neighbor])
				{
					visited[neighbor]=true;
					queue.add(neighbor);
				}
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BFS grph=new BFS(5);
		grph.addEdge(0, 1);
		grph.addEdge(0, 2);
		grph.addEdge(1, 2);
		grph.addEdge(3, 4);
		grph.addEdge(2, 3);
		
		grph.breadthFirstSearch(0);
	}

}
