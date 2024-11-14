package ds.array;

public class SelectionSortTestDrive {
    public static void main(String[] args) {
        int[] arr = {9,1,8,6,7,4,5,3,2};
        selectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void selectionSort(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length -1; i++) {
            int min = i;
            for (int j = i+ 1; j < length; j++) {
                if(arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

        }
    }
}
