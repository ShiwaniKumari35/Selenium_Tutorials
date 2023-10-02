package JavaTutorial;

import java.util.Scanner;

public class PrintInteger {
    public static void main(String[] args) {

       // Scanner is used to Creates a reader instance which takes input from standard input - keyboard
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number : "  );

        // nextInt() is used to reads the next integer from the keyboard
        int number= reader.nextInt();
        System.out.println( "The number I have entered is " +number);

    }

}
