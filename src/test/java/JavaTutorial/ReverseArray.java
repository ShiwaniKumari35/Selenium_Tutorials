package JavaTutorial;

public class ReverseArray {
    public int[] ReverseArray(int arr[]) {
        // computing the size of the array arr
        int size = arr.length;

        // auxiliary array for reversing the
        // elements of the array arr
        int temp[] = new int[size];

        int index = 0;
        for (int i = size - 1; i >= 0; i--) {
            temp[i] = arr[index];
            index = index + 1;
        }
        return temp;
    }

    public static void main(String argvs[]) {
        // creating an object of the class ReverseArr
        ReverseArray obj = new ReverseArray();

        // input array - 1
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};

        // computing the length
        int len = arr.length;
        int ans[] = obj.ReverseArray(arr);

        System.out.println("For the input array: ");
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println("The reversed array is: ");
        for (int i = 0; i < len; i++) {
            System.out.print(ans[i] + " ");
        }

    }
}
