import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];

        // Read input
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Sort the array
        Arrays.sort(a);

        // Maximum value
        int max = a[n - 1];

        // Count array
        int[] count = new int[max + 2];

        // Store frequency
        for (int i = 0; i < n; i++) {
            count[a[i]]++;
        }

        // Suffix sum
        for (int i = max - 1; i >= 1; i--) {
            count[i] += count[i + 1];
        }

        StringBuilder ans = new StringBuilder();

        int carry = 0;

        // Build answer
        for (int i = 1; i <= max; i++) {

            int total = count[i] + carry;

            ans.append(total % 10);

            carry = total / 10;
        }

        // Remaining carry
        while (carry > 0) {
            ans.append(carry % 10);
            carry /= 10;
        }

        // Reverse because digits were added from right to left
        System.out.println(ans.reverse());
    }
}
