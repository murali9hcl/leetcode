package ds.array;

public class SingleDimensionArray {
    int[] arr;

    public SingleDimensionArray(int size){
        arr = new int[size];
        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.MIN_VALUE;
        }
    }

    //time complexity - O(1)
    public void insert(int location, int value){
        try{
            if(arr[location] == Integer.MIN_VALUE){
                arr[location] = value;
                System.out.println("Successfully inserted");
            }else{
                System.out.println("This cell is already occupied");
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index to access array");
        }
    }

    //time complexity - O(n)
    public void traverseArray(){
        try{
            for(int i = 0; i < arr.length; i++){
                System.out.print(arr[i] + " ");
            }
        }catch(Exception e){
            System.out.println("Array no longer exists");
        }
        System.out.println();
    }

    public void searchInArray(int value){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == value){
                System.out.println("Value is found at location " + i);
                return;
            }
        }
        System.out.println("Value is not found");
    }

    //time complexity - O(1)
    public void deleteValueFromArray(int location){
        try{
            if(arr[location] == Integer.MIN_VALUE){
                System.out.println("This cell is already empty");
            }else{
                arr[location] = Integer.MIN_VALUE;
                System.out.println("Successfully deleted");
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index to access array");
        }
    }

}
