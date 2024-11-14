package algo.sort;

public class SortingTestDrive {
    public static void main(String[] args) {
        int[] a = {70, 40, 30, 11, 57, 41, 25, 14, 52};
        System.out.println("before sorting");
        printArray(a);
        bubbleSort(a);
        System.out.println("after sorting");
        printArray(a);


    }

    private static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println(" ");
    }


    private static void selectionSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int smallestIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[smallestIndex]) {
                    smallestIndex = j;
                }
            }
            int temp = a[i];
            a[i] = a[smallestIndex];
            a[smallestIndex] = temp;
        }
    }

    private static void bubbleSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[i]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}
