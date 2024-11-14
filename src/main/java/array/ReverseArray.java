package array;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] reversed = reverse(arr);
        for (int i = 0; i < reversed.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static int[] reverse(int[] arr){
        int left = 0;
        int right = arr.length -1;
        while(left < right) {
            int temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
            left++;
            right--;
        }
        return arr;
    }
}
