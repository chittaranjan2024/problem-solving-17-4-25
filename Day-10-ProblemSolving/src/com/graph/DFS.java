package com.graph;

import java.util.LinkedList;

public class DFS {
	private int vertices;
	private LinkedList<Integer>[] adjList;
	
	public DFS(int v)
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

	void DFSUtil(int v, boolean []visited)
	{
		visited[v]=true;
		System.out.print(v+" ");
		
		
		for(int neighbor:adjList[v])
		{
			if(!visited[neighbor])
			{
				DFSUtil(neighbor, visited);
			}
		}
		
	}
	
	
	void DFS(int strat)
	{
		boolean visited[]=new boolean[vertices];
		DFSUtil(strat,visited);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DFS graph=new DFS(5);
		
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(1, 3);
		graph.addEdge(2, 4);
		
		
		graph.DFS(0);
		
	}

}
