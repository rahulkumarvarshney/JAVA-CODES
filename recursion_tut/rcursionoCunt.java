public class rcursionoCunt {
    public static void count(int n) {
        if (n == 0) {
            System.out.println(n);
        } else {
            
            count(n - 1);
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        int x = 10;
        count(x);
    }
}
