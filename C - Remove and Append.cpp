import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int Q = sc.nextInt();

        int[] pos = new int[N + 1];

        for (int p = 1; p <= N; p++) {
            int curr = sc.nextInt();
            pos[curr] = p;
        }

        int nxtpos = N + 1;

        while (Q-- > 0) {
            int val = sc.nextInt();
            pos[val] = nxtpos++;
        }

        int[][] arr = new int[N][2];

        for (int val = 1; val <= N; val++) {
            arr[val - 1][0] = pos[val];
            arr[val - 1][1] = val;
        }

        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        for (int[] pair : arr) {
            System.out.print(pair[1] + " ");
        }

        System.out.println();
    }
}