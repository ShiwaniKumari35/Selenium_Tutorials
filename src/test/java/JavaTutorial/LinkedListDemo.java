package JavaTutorial;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String [] args){
        LinkedList l = new LinkedList();
        l.add(100);
        l.add("welcome");
        l.add("Shiwani");
        l.add(200);
        l.add(15.2);
        l.addFirst("Jaik");
        l.addLast(55);

        System.out.println(l);
        System.out.println("Size of the list " + l.size());

        //removing the list
        l.remove(2);//index
        System.out.println("After removing Items" + l);
        System.out.println(l.removeFirst());
        System.out.println(l.removeLast());


        //retrieving the item
        System.out.println(l.get(3));
        System.out.println(l.getFirst());
        System.out.println(l.getLast());


        //Changing the value
        l.set(2,"Hello World");
        System.out.println("After Updating the items" + l);

        //containing the item
        System.out.println(l.contains("Hello World")); //true
        System.out.println("Jai"); //false

        //isEmpty()
        System.out.println(l.isEmpty());

        //reading elements from list using for loop
        for (int i=0;i<l.size();i++){
            System.out.println(l.get(i));
        }

        //Sort
        System.out.println("Before Sorting " + l);
        Collections.sort(l);
        System.out.println("After Sorting" + l);

        //Reverse Order
        Collections.sort(l,Collections.reverseOrder());
        System.out.println("After reversing the list order " + l );

        //Shuffling
        System.out.println("Before Shuffling" + l);
        Collections.shuffle(l);
        System.out.println("After Shuffling " + l);
    }
}
