package ds.array;

public class ReverseArray {

    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7 ,9};
        a = reverse(a);
        for (int k : a) {
            System.out.println(k);
        }
    }

    private static int[] reverse(int[] array){
        int j = array.length;
        int[] newArray = new int[j];
        for (int k : array) {
            newArray[j - 1] = k;
            j--;
        }
        return newArray;
    }
}
