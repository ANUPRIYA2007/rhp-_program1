
import java.util.*;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int same = 0;
        long ans = 0;

        for (int i = 0; i < n; i++) {

            // Count fixed positions
            if (arr[i] == i + 1) {
                same++;
            }

            // Count swapped pairs
            if (arr[i] > i + 1 && arr[arr[i] - 1] == i + 1) {
                ans++;
            }
        }

        // Add pairs of fixed positions
        ans += (long) same * (same - 1) / 2;

        System.out.println(ans);
    }
}