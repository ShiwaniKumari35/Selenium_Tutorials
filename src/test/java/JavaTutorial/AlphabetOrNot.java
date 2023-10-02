package JavaTutorial;

public class AlphabetOrNot {
    public static void main(String[] args){
        char c = 'S';
        if((c>= 'a' && c<= 'z') || (c>='A' && c<= 'Z')){
            System.out.println( c + " is a Alphabet");
        }
        else{
            System.out.println( c + " is not a Alphabet");
        }
    }
}
