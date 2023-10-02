package JavaTutorial;

public class SecondSmallestNumber {
    public static int getSecondSmallest(int[] a, int total){
        int temp;
        for (int i = 0; i < total; i++)
        {
            for (int j = i + 1; j < total; j++)
            {
                if (a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[1];
    }
    public static void main(String args[]){
        int a[]={1,2,5,6,3,4};
        int b[]={9,5,6,10,4,8,7};
        System.out.println("Second Largest: "+getSecondSmallest(a,6));
        System.out.println("Second Largest: "+getSecondSmallest(b,7));
    }
}
