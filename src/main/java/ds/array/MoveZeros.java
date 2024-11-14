package ds.array;

import java.util.Arrays;
import java.util.Collections;

public class MoveZeros {
    public static void main(String[] args) {
        Integer[] array = {128, 0, 99, 67, 50, 0, 29, 7, 0};
        Arrays.sort(array, Collections.reverseOrder());
        for (int i : array) {
            System.out.println(i);
        }
    }
}
