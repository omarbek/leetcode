package companies.moniepoint;

public class BinarySearch {
    static int binarySearch(int arr[], int l, int r, int x) {
        if (r >= l) {
//            int mid = l + (r - l) / 2;
            int mid = (l+r)/2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return binarySearch(arr, l, mid + 1, x);
            return binarySearch(arr, mid + 1, r, x);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 10, 20, 30, 40, 50, 55, 60};
        System.out.println(binarySearch(arr, 0, arr.length - 1, 30));
    }
}
