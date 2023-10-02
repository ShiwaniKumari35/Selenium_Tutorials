package JavaTutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateElement {
    public static void main(String[] args){

            ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 1, 3));
            System.out.println("ArrayList with duplicate elements: " + numbers);

            // convert the arraylist into a set
            Set<Integer> set = new LinkedHashSet<>();
            set.addAll(numbers);

            // delete al elements of arraylist
            numbers.clear();

            // add element from set to arraylist
            numbers.addAll(set);
            System.out.println("ArrayList without duplicate elements: " + numbers);
        }
    }
