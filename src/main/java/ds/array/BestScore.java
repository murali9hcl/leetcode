package ds.array;

public class BestScore {
    public static void main(String[] args) {
       int[] myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0};
       int[] output = findTopTwoScores(myArray);
        for (int i : output) {
            System.out.println(i);
        }
    }

    public static int[] findTopTwoScores(int[] array){
        int first = 0;
        int second = 0;
        for (int i : array) {
            if(i > first){
                second = first;
                first = i;
            }
        }
        return  new int[]{first,second};
    }
}
