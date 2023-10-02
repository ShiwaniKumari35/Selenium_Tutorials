package JavaTutorial;

public class VowelORConstant {
    public static void main(String[] args){
        char ch = 'v';
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println(ch+ " is vowel");
        }
        else {
            System.out.println(ch+ " is constant");
        }
    }
}
