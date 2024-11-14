package recursion;

public class PowerEx {
    public static void main(String[] args) {
        PowerEx powerEx = new PowerEx();
        System.out.println(powerEx.power(3, 2));

    }

    public int power(int num, int exp) {
        if(num < 0) {
            return -1;
        }
        if(exp == 0) {
            return 1;
        }
        return num * power(num, exp -1);
    }
}
