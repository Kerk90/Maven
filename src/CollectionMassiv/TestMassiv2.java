/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionMassiv;

//import Collection.ArrayList;
//import Collection.ArrayList;
import java.util.*;

//import java.awt.List;
/**
 *
 * @author User
 */
public class TestMassiv2 {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> LinkedList = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            arrayList.add(i);

        }

        /* System.out.println(arrayList.toString());
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(99));
        System.out.println(arrayList.get(arrayList.size() - 1));
        for (int i = 0; i < arrayList.size(); i++) {
        System.out.println(arrayList.get(i));
        }
        for (Integer x : arrayList) {
        System.out.println(x);
        }
        arrayList.forEach((x) -> {
        System.out.println(x);
        });
        for (int i = 0; i < 100; i++) {
        arrayList.add(i);
        }
        arrayList.remove(99);*/
        arrayList.forEach((x) -> {
            System.out.println(x);
        });
}
}
