package JavaTutorial;

import java.util.ArrayList;
import java.util.Collections;

public class AscendingOrderSort {
    public static void main(String args[])
    {

        ArrayList<String> list = new ArrayList<String>();

        list.add("Shiwani");
        list.add("Jia");
        list.add("Aarti");
        list.add("Kajal");
        list.add("Monti");

        // Print the unsorted ArrayList
        System.out.println("Unsorted ArrayList: " + list);

        // Sorting ArrayList in ascending Order
        Collections.sort(list);

        // Print the sorted ArrayList
        System.out.println("Sorted ArrayList " + "in Ascending order : " + list);
    }
}
