import java.util.*;

public class Main {

    // First index where arr[index] >= target
    static int lowerBound(int[] arr, int target) {
        int l = 0;
        int r = arr.length;

        while (l < r) {
            int mid = l + (r - l) / 2;

            if (arr[mid] < target)
                l = mid + 1;
            else
                r = mid-1;
        }

        return l;
    }

    // First index where arr[index] > target
    static int upperBound(int[] arr, int target) {
        int l = 0;
        int r = arr.length;

        while (l < r) {
            int mid = l + (r - l) / 2;

            if (arr[mid] <= target)
                l = mid + 1;
            else
                r = mid-1;
        }

        return l;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }

        long[] pre = new long[n + 1];

        for (int i = 1; i <= n; i++) {
            int p = sc.nextInt();
            pre[i] = pre[i - 1] + p;
        }

        int q = sc.nextInt();

        while (q-- > 0) {

            int L = sc.nextInt();
            int R = sc.nextInt();

            int left = lowerBound(x, L);
            int right = upperBound(x, R);

            System.out.println(pre[right] - pre[left]);
        }

        sc.close();
    }
}