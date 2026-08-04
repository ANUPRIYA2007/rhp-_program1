import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] diff = new int[N + 2];

        // Mark ranges
        for (int i = 0; i < M; i++) {

            int L = sc.nextInt();
            int R = sc.nextInt();

            diff[L]++;
            diff[R + 1]--;
        }

        int current = 0;
        int ans = Integer.MAX_VALUE;

        // Prefix sum
        for (int i = 1; i <= N; i++) {

            current += diff[i];
            ans = Math.min(ans, current);
        }

        System.out.println(ans);
    }
}