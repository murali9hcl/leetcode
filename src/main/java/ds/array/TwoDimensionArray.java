package ds.array;

public class TwoDimensionArray {
    int[][] arr;

    public TwoDimensionArray(int row, int col) {
        arr = new int[row][col];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = Integer.MIN_VALUE;
            }
        }
    }

    public void insert(int row, int col, int value) {
        try {
            if (arr[row][col] == Integer.MIN_VALUE) {
                arr[row][col] = value;
                System.out.println("Successfully inserted");
            } else {
                System.out.println("This cell is already occupied");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array");
        }
    }

    public void accessCell(int row, int col){
        System.out.println("Accessing row - "+row+", col - "+col);
        try{
            System.out.println("Cell value is: "+arr[row][col]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index to access array");
        }
        System.out.println();
    }

    // time complexity O(row * col) where row and col are the number of rows and columns in the array respectively.
    public void traverseArray(){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void searchInArray(int value){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                if(arr[i][j] == value){
                    System.out.println("Value is found at location "+i+", "+j);
                    return;
                }
            }
        }
        System.out.println("Value is not found");
    }

    public void delete(int row, int col){
        try{
            System.out.println("Successfully deleted: "+arr[row][col]);
            arr[row][col] = Integer.MIN_VALUE;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println();
            System.out.println("Cant delete the value as cell provided is not in the range of array size");
        }
    }
}
