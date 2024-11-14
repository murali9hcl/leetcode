package ds.array;

public class MaxProduct {
    public static void main(String[] args) {
        int[] intArray = {10,60,30,40,50};
        System.out.println(maxProduct(intArray));
    }

    public static String maxProduct(int[] intArray) {
    String pairs = "";
    int maxProduct = 0;
        for (int i = 0; i < intArray.length; i++) {
            for (int j = i+1; j < intArray.length; j++) {
                if(maxProduct < intArray[i] * intArray[j]) {
                    maxProduct = intArray[i] * intArray[j];
                    pairs = intArray[i] +","+ intArray[j];
                }
            }
        }
       return pairs;
    }
}
