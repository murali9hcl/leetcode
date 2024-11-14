package ds.array;

public class BubbleSortTestDrive {


    public static void main(String[] args) {
        int[] arr = {9,6,7,3,4,5,8,1,2};
        bubblerSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void bubblerSort(int[] arr) {
        int length = arr.length -1;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }


}
