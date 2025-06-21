package JavaTutorial;

public class PalindromeOrNot {
        public static void main(String[] args) {
            String word = "Malayalam";
            String reverseString = "";
            int wordLength = word.length();
            for(int i=(wordLength-1);i>=0;i--){
                reverseString = reverseString + word.charAt(i);
            }
            if(word.toLowerCase().equals(reverseString.toLowerCase())){
                System.out.println(word + " is palindrome ");
            }
            else {
                System.out.println(word + " is not a palindrome");
            }
        }
}

