package recursion;

public class ProductArr {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println(productofArray(arr, arr.length));


    }

    public static int productofArray(int[] arr, int length){
        if(length == 1){
            return arr[0];
        }
        return arr[length -1] * productofArray(arr, length -1);
    }
}
