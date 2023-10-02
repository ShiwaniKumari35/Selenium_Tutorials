package JavaTutorial;

public class FactorialOfNumbers {
    public static void main(String[] args){
        int n=10, factorial =1;
        for(int i=1; i<=n; i++){
            factorial = factorial*i;
            //factorial *=i;
        }
        System.out.println("The Factorial of n numbers is = " + factorial);
    }
}
