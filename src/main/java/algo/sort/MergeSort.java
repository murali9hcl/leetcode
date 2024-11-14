package algo.sort;

public class MergeSort {
    public static void main(String[] args) {
        int[] a = {70, 40, 30, 11, 57, 41, 25, 14, 52};
        System.out.println("before sorting");
        printArray(a);
        mergeSort(a, 0 , a.length -1);
        System.out.println("after sorting");
        printArray(a);
    }

    private static void printArray(int[] a){
        for (int j : a) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    private static void mergeSort(int[] a, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(a, start, mid);
            mergeSort(a, mid + 1, end);
            merge(a, start, mid, end);
        }
    }

    private static void merge(int[] a, int beg, int mid, int end) {
        int i, j, k;
        int n1 = mid - beg + 1;
        int n2 = end - mid;

        /* temporary Arrays */
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        /* copy data to temp arrays */
        for (i = 0; i < n1; i++)
            leftArray[i] = a[beg + i];
        for (j = 0; j < n2; j++)
            rightArray[j] = a[mid + 1 + j];

        i = 0; /* initial index of first sub-array */
        j = 0; /* initial index of second sub-array */
        k = beg;  /* initial index of merged sub-array */

        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                a[k] = leftArray[i];
                i++;
            } else {
                a[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            a[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            a[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
