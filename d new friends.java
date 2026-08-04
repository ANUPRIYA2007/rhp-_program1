import java.util.*;

public class Main {

    static int[] parent;

    // Find Leader
    static int find(int[] parent, int node) {

        if (parent[node] != node) {
            parent[node] = find(parent, parent[node]);
        }

        return parent[node];
    }

    // Join Two Components
    static void join(int[] parent, int u, int v) {

        int leader1 = find(parent, u);
        int leader2 = find(parent, v);

        if (leader1 != leader2) {
            parent[leader2] = leader1;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        parent = new int[N + 1];

        // Initially every node is its own leader
        for (int i = 1; i <= N; i++) {
            parent[i] = i;
        }

        // Read Friendships
        for (int i = 0; i < M; i++) {

            int u = sc.nextInt();
            int v = sc.nextInt();

            join(parent, u, v);
        }

        // Count size of each component
        int[] count = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            int leader = find(parent, i);
            count[leader]++;
        }

        long ans = 0;

        // Calculate maximum friendships
        for (int i = 1; i <= N; i++) {

            if (count[i] > 0) {
                long size = count[i];
                ans += (size * (size - 1)) / 2;
            }
        }

        // Remove already existing friendships
        ans -= M;

        System.out.println(ans);
    }
}