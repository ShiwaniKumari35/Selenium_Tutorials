package JavaTutorial;

import java.util.ArrayList;
import java.util.List;

public class ConvertingStringToList {
    public static List<Character> convertStringToCharList(String str)
    {
        // Create an empty List of character
        List<Character> chars = new ArrayList<>();

        // For each character in the String
        // add it to the List
        for (char ch : str.toCharArray()) {
            chars.add(ch);
        }

        // return the List
        return chars;
    }

    public static void main(String[] args)
    {

        // Get the String to be converted
        String str = "Shiwani";

        // Get the List of Character
        List<Character> chars = convertStringToCharList(str);

        // Print the list of characters
        System.out.println(chars);
    }
}
