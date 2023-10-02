package JavaTutorial;

public class SumOfPrimeNumber {
    public static void main(String args[]) {

        int count, sum = 0;

        for (int i = 1; i <= 10; i++) {
            count = 0;

            for (int j = 2; j <= i / 2; j++) {

                if (i % j == 0) {
                    count++;
                    break;
                }
            }

            if (count == 0 && i != 1) {
                sum = sum + i;
            }
        }

        System.out.println("The Sum of Prime Numbers from 1 to 10 is: " + sum);
    }
}
