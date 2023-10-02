package JavaTutorial;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[]args){
        HashSet<Integer> hset = new HashSet<Integer>();

        //Adding items in Set
        hset.add(10);
        hset.add(20);
        hset.add(30);
        hset.add(40);
        hset.add(30);
        System.out.println(hset.size());
        System.out.println(hset);

        //Removing items in set
        hset.remove(10);
        System.out.println(hset);

        //One way to print the set of items
        Iterator itr= hset.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        //Second way to print the set of items
        for (Integer intdemo:hset){
            System.out.println(intdemo);
        }

    }
}
