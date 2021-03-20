package q1.extract_method.refactored;

import java.util.List;



public class A {
   Node m1(List<Node> nodes, String p) {
	   check(nodes, p);
      return null;
   }

   Edge m2(List<Edge> edgeList, String p) {
      check(edgeList, p);
      return null;
   }

   // TODO: Your answer
   <T extends GraphElement>void check(List<T> list, String p) {
	   for (T element : list) {
			if (element.contains(p))
				System.out.println(element);
		}
   } 
}

   
class GraphElement {
	String name;
	
	public boolean contains(String p) {
		return name.contains(p);
		}
}
class Node extends GraphElement{
}

class Edge extends GraphElement{
}