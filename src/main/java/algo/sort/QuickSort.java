package algo.sort;

public class QuickSort {
    public static void main(String[] args) {
        int[] a = {70, 40, 30, 11, 57, 41, 25, 14, 52};
        System.out.println("before sorting");
        printArray(a);
        quickSort(a, 0, a.length - 1);
        System.out.println("after sorting");
        printArray(a);
    }


    private static void printArray(int[] a) {
        for (int j : a) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    private static void quickSort(int[] a, int start, int end) {
        if (start < end) {
            int p = partition(a, start, end);  //p is partitioning index
            quickSort(a, start, p - 1);
            quickSort(a, p + 1, end);
        }
    }

    private static int partition(int[] arr, int begin, int end) {
        int pivot = arr[end];
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = swapTemp;

        return i + 1;
    }
}
