package algo;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(factorial(7));
        System.out.println(power(2,4));

    }

    private static int factorial(int num) {
        if(num < 1) {
            return 1;
        } else  {
            return num *factorial(num -1);
        }
    }

    private static int power(int base, int exp) {
        if(exp < 1) {
            return 1;
        } else  {
            return base  *power(base, exp -1);
        }
    }
}
