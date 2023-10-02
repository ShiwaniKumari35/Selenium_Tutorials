package JavaTutorial;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args){
        ArrayList al= new ArrayList();

        //Adding Items to the array list
        al.add(01);
        al.add("Shiwani");
        al.add(true);
        System.out.println(al.size());
        System.out.println(al);

        //This line is used for typecasting into integer
        int k = (Integer)al.get(0);
        //Or else we can also use another way for type casting
        // ArrayList<Integer> al= new ArrayList<Integer>();


        //Removing items from the array list
        al.remove(0);
        al.add("Shiwani");
        al.add(true);
        System.out.println(al);

        //Fetching items from the array list
        System.out.println(al.get(0));

        //we can print the list in different ways
        //this is the first way using for loop
        for (int i=1;i<al.size();i++){
            System.out.println(al.get(i));
        }

        //The second way is using with for loop and Object
        for (Object obj:al){
            System.out.println(obj);
        }

        //The third way is using Iterator
        Iterator itr= al.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
