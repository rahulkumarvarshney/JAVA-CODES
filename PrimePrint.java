import java.util.*;

class PrimePrint {
    public static boolean[] prs(int n) {
        boolean isprime[] = new boolean[n + 1];
        Arrays.fill(isprime, true);
        isprime[0] = false;
        isprime[1] = false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            for (int j = 2 * i; j <= n; j += i) {
                isprime[j] = false;
            }
        }
        return isprime;
    }

    public static void main(String[] args) {
        boolean isprime[] = prs(20);
        for (int i = 0; i <= 20; i++) {
            if (isprime[i]) {
                System.out.println(i + " is a prime number.");
            } else {
                System.out.println(i + " is not a prime number.");
            }
        }
    }
}
