import java.util.*;

public class Main {

    // C++ upper_bound equivalent
    static int upperBound(int[] arr, int target) {
        int left = 0;
        int right = arr.length;

        while (left < right) {
            int mid = (left + right) / 2;

            if (arr[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }

    static void solve(Scanner sc) {

        int N = sc.nextInt();

        int[] u = new int[N];
        int[] m = new int[N];
        int[] l = new int[N];

        for (int i = 0; i < N; i++)
            u[i] = sc.nextInt();

        for (int i = 0; i < N; i++)
            m[i] = sc.nextInt();

        for (int i = 0; i < N; i++)
            l[i] = sc.nextInt();

        Arrays.sort(u);
        Arrays.sort(m);
        Arrays.sort(l);

        long[] pmid = new long[N];

        // Count L > M[i]
        for (int i = 0; i < N; i++) {

            int it = upperBound(l, m[i]);

            if (it != N) {
                pmid[i] = N - it;
            }
        }

        // Prefix sum
        for (int i = 1; i < N; i++) {
            pmid[i] += pmid[i - 1];
        }

        long ans = 0;

        // For every U[i], find M > U[i]
        for (int i = 0; i < N; i++) {

            int it = upperBound(m, u[i]);

            if (it != N) {

                int midx = it;

                if (midx == 0) {
                    ans += pmid[N - 1];
                } else {
                    ans += pmid[N - 1] - pmid[midx - 1];
                }
            }
        }

        System.out.println(ans);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = 1;

        while (T-- > 0) {
            solve(sc);
        }

        sc.close();
    }
}