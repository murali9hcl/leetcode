package algo.search;

public class LinerSearch {
    public static void main(String[] args) {
        int[] a = {70, 40, 30, 11, 57, 41, 25, 14, 52};
        int result = linearSearch(a, 42);
        if(result == -1){
            System.out.println("value is not found");
        }else {
            System.out.println("value is found at index " + result);
        }

    }

    public static int linearSearch(int[] a, int value){
        for (int i = 0; i < a.length; i++) {
            if(a[i]==value){
                return i +1;
            }
        }
        return -1;
    }
}
