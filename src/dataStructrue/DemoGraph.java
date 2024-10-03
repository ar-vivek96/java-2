package dataStructrue;

public class DemoGraph {

	public static void main(String[] args) {
		
		Graph g=new Graph(5);
		g.addEdges(0,1);
		g.addEdges(1,2);
		g.addEdges(2,3);
		g.addEdges(3,4);
		g.addEdges(4,0);
		g.addEdges(1, 4);
		g.printEdges();
		g.bfs(0);
		System.out.println();
		g.dfs(0);
	}

}
