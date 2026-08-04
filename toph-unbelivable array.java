
import java.util.*;

class Main {

    static final int MAX = 100000;

    public static int find(int[] ldr, int node) {
        if (ldr[node] != node) {
            ldr[node] = find(ldr, ldr[node]);
        }
        return ldr[node];
    }

    public static void join(int[] ldr, int x, int y) {

        int leaderX = find(ldr, x);
        int leaderY = find(ldr, y);

        if (leaderX != leaderY) {
            
            ldr[leaderX] = leaderY;
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {
        	System.out.println("case:");


            int n = sc.nextInt();
            int q = sc.nextInt();

            int arr[] = new int[n];
             int ldr[] = new int[MAX + 1];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            

            for (int i = 1; i <= MAX; i++) {
                ldr[i] = i;
            }

            while (q-- > 0) {

                int type = sc.nextInt();

                if (type == 1) {

                    int x = sc.nextInt();
                    int y = sc.nextInt();

                    join(ldr, x, y);

                } else{
                	int idx=sc.nextInt();
                	System.out.println(find(ldr,arr[idx-1]));
                }
               
            }
        }

        
    }
}
