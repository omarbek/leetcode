package problems;

public class MergeSortedArray88 {
    public static void main(String[] args) {
//        new MergeSortedArray88().merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3);
//        new MergeSortedArray88().merge(new int[]{1}, 1, new int[]{}, 0);
        new MergeSortedArray88().merge(new int[]{2, 0}, 1, new int[]{1}, 1);
//        new MergeSortedArray88().merge(new int[]{-1, 0, 0, 3, 3, 3, 0, 0, 0}, 6, new int[]{1, 2, 2}, 3);
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        while (m > 0 && n > 0) {
            if (nums2[n - 1] > nums1[m - 1]) {
                nums1[m + n - 1] = nums2[n - 1];
                n--;
            } else {
                nums1[m + n - 1] = nums1[m - 1];
                m--;
            }
        }
        while (n > 0) {
            nums1[m + n - 1] = nums2[n - 1];
            n--;
        }
        System.out.println();
    }
}
