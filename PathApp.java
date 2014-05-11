class PathApp {
	public static void main(String[] args) {
		Graph theGraph = new Graph();
		theGraph.addVertex('A');
		theGraph.addVertex('B');
		theGraph.addVertex('C');
		theGraph.addVertex('D');
		theGraph.addVertex('E');
		theGraph.addVertex('F');
		
		theGraph.addEdge(0, 1, 50);	//AB 50
		theGraph.addEdge(1, 2, 20);	//BD 20
		theGraph.addEdge(2, 3, 60);	//DE 60
		theGraph.addEdge(3, 4, 30);	//EF 30
		theGraph.addEdge(4, 2, 20);	//FC 20
		theGraph.addEdge(2, 0, 40);	//CA 40
		
		
		System.out.println("Shortest paths");
		theGraph.path();
		System.out.println();
	}
}
