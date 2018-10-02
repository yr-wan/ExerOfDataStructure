package yrwan13;

public class TestGraph {
	public static void main(String[] args) {
		Graph graph = new Graph(10);
		graph.addVertex('A');
		graph.addVertex('B');
		graph.addVertex('C');
		graph.addVertex('D');
		graph.addVertex('E');
		graph.addEdge(0, 1);
		graph.addEdge(1, 2);
		graph.addEdge(3, 2);
		graph.addEdge(0, 4);
		graph.displayAdjMat();
		graph.dfs();
		System.out.println();
		graph.bfs();
		System.out.println();
		graph.mst();
	}
}
