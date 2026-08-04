import java.util.*;

class Main {

     static int[] arr;
    static int[] tree;

    // Build the segment tree
     static void build(int i, int start, int end) {

        // Leaf node
        if (start == end) {
            tree[i] = arr[start];
            return;
        }

        int mid = (start + end) / 2;

        // Build left subtree
        build(2 * i, start, mid);

        // Build right subtree
        build(2 * i + 1, mid + 1, end);

        // Store minimum of both children
        tree[i] = Math.min(tree[2 * i], tree[2 * i + 1]);
    }

    // Query minimum in range [l, r]
     static int query(int i, int start, int end, int l, int r) {

        // No overlap
        if (r < start || end < l)
            return Integer.MAX_VALUE;

        // Complete overlap
        if (l <= start && end <= r)
            return tree[i];

        // Partial overlap
        int mid = (start + end) / 2;

        int leftMin = query(2 * i, start, mid, l, r);
        int rightMin = query(2 * i+ 1, mid + 1, end, l, r);

        return Math.min(leftMin, rightMin);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();

        arr = new int[n];
        tree = new int[4 * n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Build segment tree
        build(1, 0, n - 1);

        while (q-- > 0) {

            int l = sc.nextInt() - 1;
            int r = sc.nextInt() - 1;

            System.out.println(query(1, 0, n - 1, l, r));
        }
    }
}