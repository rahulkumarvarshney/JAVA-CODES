import java.util.Scanner;
class array19
{
    public static void main(String[] args) {
        int i,j;
        int a[][]=new int[2][2];
        Scanner sc=new Scanner(System.in);
        for(i=0; i<2; i++)
        {
            for(j=0;j<2;j++)
            {
                a[i][j]=sc.nextInt();
            }
            System.out.print("\n");
        }
        for(i=0; i<2; i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.println(a[i][j]);
            }
        System.out.print("\n");
        }
        for(i=0; i<2; i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.println(a[j][i]);
            }
        System.out.println("\n");
        }
    }
    }
        