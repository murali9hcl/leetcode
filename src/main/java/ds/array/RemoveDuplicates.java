package ds.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] myArray = {1, 1, 2, 2, 3, 4, 5};
        int[] result = removeDuplicates2(myArray);
        System.out.println(Arrays.toString(result));
    }

    public static int[] removeDuplicates2(int[] array) {
        int[] result = new int[array.length];
        int index = 0;
        for (int i = 0; i < array.length -1 ; i++) {
            if(array[i] != array[i+1]){
                result[index++] = array[i];
            }
        }
        result[index++] = array[array.length-1];
        return Arrays.copyOf(result, index);
    }
    public static int[] removeDuplicates1(int[] arr) {
       Set<Integer> set = new HashSet<>();
        Arrays.stream(arr).forEach(set::add);
        return set.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] removeDuplicates(int[] array) {
        int n = array.length;
        int[] uniqueArray = new int[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = i + 1; j < n; j++) {
                if (array[i] == array[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueArray[index++] = array[i];
            }
        }
        return Arrays.copyOf(uniqueArray, index);
    }
}
