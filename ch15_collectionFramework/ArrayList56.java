package ch15_collectionFramework;

//import java.lang.reflect.Array;
import java.util.*;


public class ArrayList56 {
    public static void main(String[] args) {
        ArrayList<Integer> l1 =new ArrayList<>();
        ArrayList<Integer> l2 =new ArrayList<>(5);
        l2.add(15);
        l2.add(12);
        l2.add(14);

        l1.add(6);
         l1.add(7);
          l1.add(8);
           l1.add(9);
            l1.add(1,4);
             l1.add(1,5);
              l1.addAll(2,l2);
              
           // for(int i = 0; i<l1.size(); i++)
            //    System.out.print(l1.get(i));
            System.out.println(l1.indexOf(7));
            
               
            for(int i = 0; i<l1.size(); i++){
                System.out.print(l1.get(i));
            System.out.print(", ");
    }
}}
