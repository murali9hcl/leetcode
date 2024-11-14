package ds.array;

public class SumDiagonal2DArray {
    public static void main(String[] args) {
        int[][] array2d = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(sumDiagonalElements(array2d));
    }

    //write a function to find the sum of diagonal elements of a 2d array

    public static int sumDiagonalElements(int[][] array) {
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i][i];
        }
        return sum;
    }
}
