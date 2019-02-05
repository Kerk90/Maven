
package CollectionMassiv;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


class linkedList {
      public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> LinkedList = new LinkedList<>();

        measureTime(arrayList, " arrayList");
        measureTime(LinkedList, " LinkedList");        
}
              

      public static void measureTime(List<Integer> list, String desk) {
       long start = System.currentTimeMillis();
          for (int i=0; i<100000; i++){
          list.add(0, i);       
    }
      long end = System.currentTimeMillis();
      System.out.println(desk + " diff " + (end-start));
      System.out.println("");
           for (int i=0; i<100000; i++){
           list.get(i);
      }
      
}
}

