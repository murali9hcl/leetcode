package recursion;

public class recursiveRange {
    public static void main(String[] args) {
        System.out.println(recursiveRange(10));
    }

    public static int recursiveRange(int num) {
       if(num <=0 ) {
           return 0;
       }
       return num + recursiveRange(num - 1);
    }
}
