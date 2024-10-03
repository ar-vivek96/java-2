package dataStructrue;

import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class Graph {

	ArrayList<ArrayList<Integer>> adjlist=new ArrayList<>();
	Graph(int v)
	{
		for(int i=0;i<v;i++) {
		adjlist.add(new ArrayList<Integer>());
		}
	}
	
	public void addEdges(int v,int u)
	{
		adjlist.get(v).add(u);
		adjlist.get(u).add(v);
	}
	
	public void printEdges()
	{
		for(int i=0;i<adjlist.size();i++)
		{
			System.out.println("number of edges in vertex "+i);
			for(int j=0;j<adjlist.get(i).size();j++)
			{
				System.out.println(" "+adjlist.get(i).get(j));
			}
		}
	}
	
	public void bfs(int v)
	{
		int V=adjlist.size();
		boolean []visited=new boolean[V];
		visited[v]=true;
		
		Queue<Integer> q=new LinkedList<Integer>();
		q.add(v);
		while(q.size()!=0)
		{
			int vertex=q.remove();
			System.out.print(vertex+" ");
			for(int i=0;i<adjlist.get(vertex).size();i++)
			{
				
				int av=adjlist.get(vertex).get(i);
				if(!visited[av])
				{
					q.add(av);
					visited[av]=true;
				}
			}
		}	
		
	}
	public void dfs(int v)
	{
		int V=adjlist.size();
		boolean visited[]=new boolean[V];
		dfs2(v,visited);
	}
	public void dfs2(int v,boolean visited[])
	{
		visited[v]=true;
		System.out.print(" "+v);
		
		for(int i=0;i<adjlist.get(v).size();i++)
		{
			int av=adjlist.get(v).get(i);
			if(!visited[av])
			{
				dfs2(av,visited);
				visited[av]=true;
			}
		}
		
		
	}
}
