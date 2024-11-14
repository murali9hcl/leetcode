package ds.array;

import java.util.Arrays;

public class MiddleArray {
    public static void main(String[] args) {
    int[] input = {1, 2, 3, 4};
    int[] output = middle(input);
        for (int i : output) {
            System.out.println(i);
        }
    }
    public static int[] middle(int[] array) {
        return Arrays.copyOfRange(array, 1, array.length-1);
    }

}
