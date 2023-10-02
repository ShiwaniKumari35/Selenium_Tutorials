package JavaTutorial;

public class SingleDimensionalArray {
    public static void main(String [] args) {
        int myInt = 2;
        int[] myIntArray = new int[10];
        myIntArray[0] = 10;
        myIntArray[1] = 20;
        myIntArray[2] = 30;
        myIntArray[3] = 40;


        int[] myIntArray1 = {10,20,30,40};
        for(int i=0; i<myIntArray1.length;i++){
            System.out.println(myIntArray1[i]);
        }

    }
}
