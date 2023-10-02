package JavaTutorial;

import java.util.ArrayList;
import java.util.List;

public class SumOfElementInList {

        public static void main(String[] args) {
            List<Integer> list = new ArrayList<>();
            list.add(5);
            list.add(6);
            list.add(7);
            list.add(10);
            list.add(9);

            System.out.println(list);
            int sum = 0;
            for (int i = 0; i < list.size(); i++) {
                sum += list.get(i);
            }

            System.out.println("Sum of all elements in the list is " + sum);
        }
}
