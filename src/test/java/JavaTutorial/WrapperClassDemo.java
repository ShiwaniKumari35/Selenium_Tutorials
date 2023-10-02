package JavaTutorial;

public class WrapperClassDemo {
    public static void main(String[]args){
        int i=10;
        Integer int1 = new Integer(i); //Wrapping - Auto Boxing
        System.out.println(int1);

        int j= int1;     //Unwrapping - AutoUnboxing
        System.out.println(j);
    }
}
