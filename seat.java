import java.io.*;

public class seat {

    public static void printRow(int[] row) {
        for (int i : row) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int twoDm[][] = new int[5][7];
        int i, j, k = 1;
        int ans;

        for (i = 0; i < 5; i++) {
            for (j = 0; j < 7; j++) {
                twoDm[i][j] = k;
                k++;
            }
        }

        for (int[] row : twoDm) {
            printRow(row);
        }
        System.out.print("Enter a Seat number to reserve: ");
        ans = Integer.parseInt(br.readLine());

        boolean seatFound = false;
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 7; j++) {
                if (twoDm[i][j] == ans) {
                    twoDm[i][j] = 0;
                    seatFound = true;
                }
            }
        }

        if (!seatFound) {
            System.out.println("Seat number not found.");
        } else {
            // Replace all seats with 0
            for (i = 0; i < 5; i++) {
                for (j = 0; j < 7; j++) {
                    twoDm[i][j] = 0;
                }
            }

            System.out.println("All seats have been replaced with 0.");
            for (int[] row : twoDm) {
                printRow(row);
            }
        }
    }
}
