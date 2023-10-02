package JavaTutorial;

public class SumOfNaturalNumber {
    public static void main (String[] args){
        int n=10, sum=0;
        for(int i=1; i<=n; i++){
            //sum = sum+i;
            sum +=i;

        }
        System.out.println("Sum of n Numbers is = " +sum);
    }
}
