package JavaTutorial;

public class ReverseString {
    public static void main(String[] args){
        String originalString="My name is Shiwani"; // reversing the whole string
        String reverseString="";
        System.out.println("Original String : " + originalString);
        for (int i=originalString.length()-1; i>=0; i--){
            reverseString = reverseString + originalString.charAt(i) ;
        }
        System.out.println("Reversed String : " + reverseString);
    }
}

