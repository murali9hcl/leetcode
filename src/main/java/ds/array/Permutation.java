package ds.array;

import java.util.Arrays;

public class Permutation {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {5,1,2,3,4};
        System.out.println(permutation(array1, array2));
    }

    public static  boolean permutation(int[] array1, int[] array2){
       if(array1.length != array2.length)
            return false;
        int sum1 = 0;
        int sum2=0;
        int mul1 = 1;
        int mul2 = 1;
        for (int i = 0; i < array1.length; i++) {
            sum1 += array1[i];
            sum2 += array2[i];
            mul1 *= array1[i];
            mul2 *= array2[i];
        }
        return sum1 == sum2 && mul1 == mul2;
    }

    public static  boolean permutation1(int[] array1, int[] array2){
        Arrays.sort(array1);
        Arrays.sort(array2);
        return Arrays.equals(array1, array2);
    }
}
