package JavaTutorial;

import java.util.Arrays;
import java.util.List;

public class ConvertingListToString {

        public static void main(String[] args) {
            // create character list and initialize
            List<Character> str = Arrays.asList('S', 'h', 'i', 'w', 'a', 'n', 'i');

            System.out.println("List - " + str);

            // create object of StringBuilder class
            StringBuilder sb = new StringBuilder();

            // Appends characters one by one
            for (Character ch : str) {
                sb.append(ch);
            }

            // convert in string
            String string = sb.toString();
            System.out.println("String - " + string);
        }
}
