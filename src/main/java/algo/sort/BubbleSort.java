package algo.sort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {70, 40, 30, 11, 57, 41, 25, 14, 52};
        System.out.println("before sorting");
        printArray(a);
        bubbleSort(a);
        System.out.println("after sorting");
        printArray(a);
    }

    private static void printArray(int[] a){
        for (int j : a) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    private static void bubbleSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(a[j] > a[i]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
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
