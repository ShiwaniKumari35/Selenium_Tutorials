package JavaTutorial;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = reader.nextInt();

        if(num %2 == 0){
            System.out.println(num + " is Even");
        }
        else {
            System.out.println(num + " is Odd");
        }

    }
}
