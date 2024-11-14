package algo.sort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] a = {70, 40, 30, 11, 57, 41, 25, 14, 52};
        System.out.println("before sorting");
        printArray(a);
        selectionSort(a);
        System.out.println("after sorting");
        printArray(a);
    }

    private static void printArray(int[] a){
        for (int j : a) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    private static void selectionSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int index = i;
            for (int j = i+1; j < n; j++) {
                if(a[j] < a[index]) {
                    index = j;
                }
            }
           System.out.println("swapping " + a[i] + " with " + a[index]);
            int temp = a[i];
            a[i] = a[index];
            a[index] = temp;
            printArray(a);
        }
    }
}
