package ds.array;

import java.util.Arrays;

public class TwoDimensionArrayTestDrive {
    public static void main(String[] args) {
        TwoDimensionArray twoDimensionArray = new TwoDimensionArray(2,2);
        twoDimensionArray.insert(0,0,1);
        twoDimensionArray.insert(0,1,2);
        twoDimensionArray.insert(1,0,3);
        twoDimensionArray.insert(1,1,4);
        twoDimensionArray.insert(1,1,5);
        twoDimensionArray.accessCell(1, 0);
        twoDimensionArray.traverseArray();
        twoDimensionArray.searchInArray(3);
        twoDimensionArray.delete(1, 0);
        System.out.println(Arrays.deepToString(twoDimensionArray.arr));
    }
}
