package problems;

public class Main {

    public static void main(String[] args) {
        //1 2 3
        //1 4 9

        //-1 -2 -3
        //1 4 9

        // -4 1 2 3 5
        // 1 4 9 16 25

        //O(n)

        // 4 1 2 3

        //check first and last element -4 and 5
        //[len-1]
//        int[] arr = new int[]{-4, 1, 2, 3, 5};
//        int[] arr = new int[]{-4};
        int[] arr = new int[]{};
        sqrt(arr);

        //-4 5
        //-4 3
        //1 3
        //1 2
    }

    private static int[] sqrt(int[] arr) {
        int[] ret = new int[arr.length];
        int left = 0;
        int right = arr.length - 1;
        int count = arr.length - 1;
        while (left <= right) {
            int i = Math.abs(arr[left]);
            int j = Math.abs(arr[right]);
            if (i < j) {
                ret[count--] = j * j;
                right--;
            } else {
                ret[count--] = i * i;
                left++;
            }
        }
        return ret;
    }
}
