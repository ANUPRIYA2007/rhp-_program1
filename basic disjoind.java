import java.util.*;

class Main {

    public static int find(int[] ldr, int node) {

        if (ldr[node] != node) {
            ldr[node] = find(ldr, ldr[node]);
        }

        return ldr[node];
    }

    public static void join(int[] ldr, int lt, int rt) {

        int arrlt = find(ldr, lt);
        int arrrt = find(ldr, rt);

        if (arrlt != arrrt) {
            ldr[arrrt] = arrlt;
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int ldr[] = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            ldr[i] = i;
        }

        for (int j = 0; j < m; j++) {
            int lt = sc.nextInt();
            int rt = sc.nextInt();

            join(ldr, lt, rt);
        }

        HashSet<Integer> h = new HashSet<>();

        for (int k = 1; k <= n; k++) {
            h.add(find(ldr, k));
        }

        System.out.println(h.size());
    }
}