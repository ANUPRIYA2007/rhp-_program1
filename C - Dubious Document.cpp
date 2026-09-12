import java.util.*;

public class Main {

    static void solve(Scanner sc) {

        int N = sc.nextInt();

        int[] cmn = new int[26];
        Arrays.fill(cmn, 50);

        for (int ctr = 1; ctr <= N; ctr++) {

            String s = sc.next();

            int[] curr = new int[26];

            for (char ch : s.toCharArray()) {
                curr[ch - 'a']++;
            }

            for (int i = 0; i < 26; i++) {
                cmn[i] = Math.min(cmn[i], curr[i]);
            }
        }

        for (int i = 0; i < 26; i++) {

            while (cmn[i]-- > 0) {
                System.out.print((char) ('a' + i));
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        solve(sc);
    }
}