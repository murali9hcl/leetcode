package recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }

    public static int  factorial(int num) {
        if(num == 1) {
            return 1;
        }
        if(num == 2) {
            return 2;
        }
        return num * factorial(num - 1);
    }
}
