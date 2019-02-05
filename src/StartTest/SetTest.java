

package StartTest;

import java.util.*;



public class SetTest {

    public static void main(String[] args) {
        //множества. обеспечивается уникальность, не м.б. двух одинаковых 
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        hashSet.add("Bob");
        hashSet.add("Lisa");
        hashSet.add("German");
        hashSet.add("Bob");
        hashSet.add("Ivan");
        
       hashSet.forEach((name)->{
           System.out.println(name);
       });
        System.out.println("\n"+hashSet.contains("Bob"));
        System.out.println(hashSet.isEmpty());
        System.out.println(hashSet);
        
        Set<Integer> set1= new HashSet<>();
        Set<Integer> set2= new HashSet<>();
        set1.add(0);
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);
        set2.add(8);
        set2.add(9);
        
        //union- объединение множеств
        Set<Integer> setUnion = new HashSet<>(set1);
        setUnion.addAll(set2);
        System.out.println(setUnion);
        
        //Intersection-пересечение множеств
        Set<Integer> setIntersection = new HashSet<>(set1);
        setIntersection.retainAll(set2);
        System.out.println(setIntersection);
        
        //Differece1-разность множеств
        Set<Integer> setDifferece1 = new HashSet<>(set1);
        setDifferece1.removeAll(set2);
        System.out.println(setDifferece1);
        
        //Differece1-разность множеств
        Set<Integer> setDifferece2 = new HashSet<>(set2);
        setDifferece2.removeAll(set1);
        System.out.println(setDifferece2);
        
    }
}
