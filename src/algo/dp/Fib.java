package algo.dp;

public class Fib {

    public static void main(String[] args) {
        System.out.println(new Fib().fib(4));
    }

    public int fib(int n) {
        if (n < 2) {
            return n;
        }
        return fib(n - 2) + fib(n - 1);
    }
}
