//Write a program to Determine if a string can be rearranged to form a palindrome in java

package JavaTutorial;
import java.util.Arrays;

public class PalindromePermutation {
        static int NO_OF_CHARS = 256;
        static boolean canFormPalindrome(String str)
        {
            int count[] = new int[NO_OF_CHARS];
            Arrays.fill(count, 0);

            for (int i = 0; i < str.length(); i++)
                count[(int)(str.charAt(i))]++;

            int odd = 0;
            for (int i = 0; i < NO_OF_CHARS; i++) {
                if ((count[i] & 1) == 1)
                    odd++;

                if (odd > 1)
                    return false;
            }
            return true;
        }

        public static void main(String args[])
        {
            if (canFormPalindrome("radar"))
                System.out.println("Yes");
            else
                System.out.println("No");

            if (canFormPalindrome("Shiwani"))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }

