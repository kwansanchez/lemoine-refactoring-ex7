package q1.extract_method.refactored;

import java.util.List;

public class A {
   Node m1(List<Node> nodes, String p) {
      printIfContains(nodes, p);
      // other implementation
      return null;
   }

   Edge m2(List<Edge> edgeList, String p) {
      printIfContains(edgeList, p);
      // other implementation
      return null;
   }

   private <T extends ContainsTest> void printIfContains(List<T> list, String p) {
      for (T item : list) {
         if (item.contains(p))
            System.out.println(item);
      }
   }
}

interface ContainsTest {
    boolean contains(String p);
}

class Node implements ContainsTest {
   String name;

   @Override
   public boolean contains(String p) {
      return name.contains(p);
   }
}

class Edge implements ContainsTest {
   String name;

   @Override
   public boolean contains(String p) {
       return name.contains(p);
   }
}
