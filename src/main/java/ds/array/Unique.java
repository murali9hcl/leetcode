package ds.array;

public class Unique {
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5,6};
        System.out.println(isUnique(intArray));
    }

    public static boolean isUnique(int[] intArray) {
        boolean isUnique = true;
        for (int i = 0; i < intArray.length-1; i++) {
            if(intArray[i] == intArray[i+1]) {
                isUnique = false;
                break;
            }
        }
        return isUnique;
    }

}
