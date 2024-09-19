import java.util.Scanner;

public class squarp{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int nrows = N;
        // int nsp = 0;
        int nst = N;

        for (int rows = 1; rows <= nrows; rows++) {
            // Spaces
            // for (int csp = 1; csp <= nsp; csp++) {
            //     System.out.print(" "); // No spaces needed, this will not print anything
            // }
            // Numbers
            for (int cst = 1; cst <= nst; cst++) {
                if (cst < rows) {
                    System.out.print(rows + " ");
                } else {
                    System.out.print(cst + " ");
                }
            }
            System.out.println();
            // nsp++;  // Not really used here, as no spaces are needed
        }
    }
}
