package JavaTutorial;

public class LargestAmongThreeNumbers {
    public static void main(String[] args){
        int a=10, b=20, c=26;
        if(a>=b && a>=c){
            System.out.println("a = " + a + " is the largest number");
        }
        else if(b>=c && b>=a){
            System.out.println("b = " + b + " is the largest number");
        }
        else{
            System.out.println("c = " + c + " is the largest number" );
        }
    }
}
