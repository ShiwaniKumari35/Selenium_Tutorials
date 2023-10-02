package JavaTutorial;

import java.util.Scanner;

public class LongestWordLength {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word or sentence:");
        String str = in.nextLine();

        str += " "; //Add space at end of string
        String word = "", longestWord = "";
        int len = str.length();

        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {

                if (word.length() > longestWord.length()) longestWord = word;

                word = "";
            }
            else {
                word += ch;
            }
        }

        System.out.println("The longest word is : " + longestWord + " and The length of the word is : " + longestWord.length());
    }
}
