package algo.graphs4;

public class SmallestRepunitDivByK {
    public static void main(String[] args) {
        System.out.println(new SmallestRepunitDivByK().smallestRepunitDivByK(3));
    }

    public int smallestRepunitDivByK(int k) {
        if (k % 2 == 0 || k % 5 == 0) {
            return -1;
        }
        int n = 0;
        for (int i = 0; i < k; i++) {
            n = (n * 10 + 1) % k;
            if (n == 0) {
                return i + 1;
            }
        }
        return -1;
    }
}
