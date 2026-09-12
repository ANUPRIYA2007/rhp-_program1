import java.util.*;

public class Main {

    static void solve(Scanner sc) {
        int x = sc.nextInt();
        int y = sc.nextInt();

        int sum = x + y;
        int rx = 0, ry = 0;

        for (int sh = 30; sh >= 0; sh--) {
            if ((sum & (1 << sh)) != 0) {

                if ((rx | (1 << sh)) <= x) {
                    rx = rx | (1 << sh);
                } else {
                    ry = ry | (1 << sh);
                }
            }
        }

        System.out.println(sum + " " + (x - rx));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            solve(sc);
        }
    }
}