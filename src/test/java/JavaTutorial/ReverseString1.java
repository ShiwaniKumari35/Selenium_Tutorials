package JavaTutorial;

public class ReverseString1 {
    public static void main(String[] args) {
        // Define the string to be reversed
        String name = "my name shiwani";

        // Convert the string to a character array
        char[] charArray = name.toCharArray();

        // Initialize an empty result string
        String reversedString = "";

        // Initialize a temporary word string
        String word = "";

        // Loop through each character in the array
        for (int i = 0; i < charArray.length; i++) {
            // If the character is not a space, add it to the word
            if (charArray[i] != ' ') {
                word = charArray[i] + word;
            } else {
                // If the character is a space, add the reversed word to the result
                reversedString += word + " ";
                word = ""; // Reset the word
            }
        }

        // Add the last word to the result (since it won't be followed by a space)
        reversedString += word;

        // Print the reversed string
        System.out.println("Reversed string: " + reversedString);
    }
}
