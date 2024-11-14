package ds.array;

public class FindNumberInArray {
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5,6};
        int result = searchInArray(intArray, 6);
        System.out.println(result);
    }

    public static int searchInArray(int[] intArray, int valueToSearch) {
        int index = 0;
        for (int i = 0; i < intArray.length; i++) {
            if(intArray[i] == valueToSearch) {
                index = i;
                break;
            }
        }
        return  index;
    }
}
