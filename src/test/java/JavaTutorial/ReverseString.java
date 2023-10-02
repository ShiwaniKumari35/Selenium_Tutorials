package JavaTutorial;

public class ReverseString {
    public static void main(String[] args){
        String originalString="Shiwani";
        String reverseString="";
        System.out.println("Original String : " + originalString);
        for (int i=0 ; i<originalString.length();i++){
            reverseString = originalString.charAt(i) + reverseString;
        }
        System.out.println("Reversed String : " + reverseString);
    }
}
