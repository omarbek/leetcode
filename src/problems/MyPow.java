package problems;

public class MyPow {

    public static void main(String[] args) {
        System.out.println(new MyPow().myPow(2.00000, 10));
        System.out.println(new MyPow().myPow(2.10000, 3));
        System.out.println(new MyPow().myPow(2.00000, -2));
    }

    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 1 / x * myPow(1 / x, -(n + 1));
        }
        if (n % 2 == 0) {
            return myPow(x * x, n / 2);
        }
        return x * myPow(x * x, n / 2);
    }
}
