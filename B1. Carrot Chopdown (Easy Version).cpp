import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[] cnt = new int[m + 1];

            for (int i = 0; i < n; i++) {
                cnt[sc.nextInt()]++;
            }

            int ans = 0;
            int greater = n;

            for (int x = 1; x <= m; x++) {
                greater -= cnt[x];

                int cur = cnt[x] + greater;

                if (2 * x <= m)
                    cur += cnt[2 * x];

                ans = Math.max(ans, cur);
            }

            System.out.println(ans);
        }
    }
}