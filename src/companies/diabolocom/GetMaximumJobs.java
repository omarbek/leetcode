package companies.diabolocom;

public class GetMaximumJobs {

    public static void main(String[] args) {
        System.out.println(getMaximumJobs(5, 11, 3));
        System.out.println(getMaximumJobs(5, 11, 5));
        System.out.println(getMaximumJobs(5, 16, 2));
    }

    public static int getMaximumJobs(int n, int m, int k) {
        int ret = m - n - 1;
        return invoke(n, k, ret, m);
    }

    private static int invoke(int n, int k, int ret, int m) {
        int[] arr = new int[n];
        arr[k - 1] = ret;
        int sum = getSum(k, arr, ret);
        if (sum > m) {
            return invoke(n, k, ret - 1, m);
        }
        return ret;
    }

    private static int getSum(int k, int[] arr, int ret) {
        int temp=ret;
        for (int i = k; i < arr.length; i++) {
            if (ret == 1) {
                arr[i] = 1;
            } else {
                arr[i] = --ret;
            }
        }
        for (int i = k-2; i >= 0; i--) {
            if (ret == 1) {
                arr[i] = 1;
            } else {
                arr[i] = --temp;
            }
        }
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }
}
