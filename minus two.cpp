import java.util.*;

public class Main {
    static void solve(Scanner sc) {
        int n = sc.nextInt();

        int odd = 0, eoq = 0, eeq = 0;

        for (int i = 0; i < n; i++) {
            int curr = sc.nextInt();

            if (curr % 2 == 1) {
                odd++;
            } else {
                int q = curr / 2;

                if (q % 2 == 1)
                    eoq++;
                else
                    eeq++;
            }
        }

        System.out.println(Math.max(odd, Math.max(eoq, eeq)));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            solve(sc);
        }
    }
}