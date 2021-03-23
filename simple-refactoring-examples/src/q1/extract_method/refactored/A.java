package q1.extract_method.refactored;

import java.util.List;

public class A {
	Node m1(List<Node> nodes, String p) {
		for (Node node : nodes) {
			extractedPrint(p, node);
		}
		return null;
	}
	
	Edge m2(List<Edge> edgeList, String p) {
		for (Edge edge : edgeList) {
			extractedPrint(p, edge);
		}
		return null;
	}

	private void extractedPrint(String p, Edge edge) {
		if (edge.contains(p))
			System.out.println(edge);
	}
	
	private void extractedPrint(String p, Node node) {
		if (node.contains(p))
			System.out.println(node);
	}
	
}

class Node {
   String name;

   public boolean contains(String p) {
      return name.contains(p);
   }
}

class Edge {
   String name;

   public boolean contains(String p) {
       return name.contains(p);
   }
}