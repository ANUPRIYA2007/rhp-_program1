import java.util.*;

public class Main {

    static void solve(Scanner sc) {

        int N = sc.nextInt();

        int[] arr = new int[N];
        ArrayList<Integer> z1 = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] == 0) {
                z1.add(i);
            }
        }

        if (z1.size() == 1) {
            System.out.println("NO");
            return;
        }

        char[] s = new char[N];
        Arrays.fill(s, 'C');

        if (z1.size() > 0) {

            int fzidx = z1.get(0);

            s[fzidx] = 'B';

            for (int i = 1; i < z1.size(); i++) {
                s[z1.get(i)] = 'A';
            }
        }

        System.out.println("YES");
        System.out.println(new String(s));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            solve(sc);
        }
    }
}