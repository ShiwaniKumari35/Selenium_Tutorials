package JavaTutorial;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        int[][] myMultiDimArray = new int[2][3];
        myMultiDimArray[0][0] = 3;
        myMultiDimArray[0][1] = 6;
        myMultiDimArray[0][2] = 7;
        myMultiDimArray[1][0] = 5;
        myMultiDimArray[1][1] = 2;
        myMultiDimArray[1][2] = 4;

       // System.out.println(myMultiDimArray[1][2]);

     //   int[][] myMultiDimArray1 = {{2, 3, 3},{6, 8, 9}};
        //System.out.println(myMultiDimArray1[1][2]);

        for (int i=0;i<myMultiDimArray.length;i++){
            for (int j=0;j<myMultiDimArray[i].length;j++){
                System.out.println(myMultiDimArray[i][j]);
            }
        }
    }
}
