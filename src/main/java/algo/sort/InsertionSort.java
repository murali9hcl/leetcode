package algo.sort;

public class InsertionSort {
    public static void main(String[] args) {
        int[] a = {70, 40, 30, 11, 57, 41, 25, 14, 52};
        System.out.println("before sorting");
        printArray(a);
        insertionSort(a);
        System.out.println("after sorting");
        printArray(a);
    }

    private static void printArray(int[] a) {
        for (int j : a) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    private static void insertionSort(int[] a) {
        int n = a.length;
        for (int j = 1; j < n; j++) {
            int key = a[j];
            int i = j - 1;
            while ((i > -1) && (a[i] > key)) {
                System.out.println("value of a[i] " + a[i] + " and key " + key);
                a[i + 1] = a[i];
                i--;
            }
            a[i + 1] = key;
            System.out.println("after swapping");
            printArray(a);
        }
    }
}
