class Solution {

    public int find(int[] ldr, int node) {

        if (ldr[node] != node) {
            ldr[node] = find(ldr, ldr[node]);
        }

        return ldr[node];
    }

    public void join(int[] ldr, int lt, int rt) {

        int leader1 = find(ldr, lt);
        int leader2 = find(ldr, rt);

        if (leader1 != leader2) {
            ldr[leader2] = leader1;
        }
    }

    public int findCircleNum(int[][] isConnected) {

        int n = isConnected.length;

        int[] ldr = new int[n];

        for (int i = 0; i < n; i++) {
            ldr[i] = i;
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                if (isConnected[i][j] == 1) {
                    join(ldr, i, j);
                }
            }
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (find(ldr, i) == i) {
                count++;
            }
        }

        return count;
    }
}