import java.util.Scanner;
public class array3
{    public static void main (String args[])
    {
        int  a[][]=new int [2][2];
        int b[][]=new int [2][2];
        int i;
        int j;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array elements of first matrics");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }

        System.out.println("enter the array elements of second matrics");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }

        System.out.println(" elements of first matrics");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.println(a[i][j]+" ");
            }
        }

        System.out.println(" elements of second matrics");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.println(b[i][j]+" ");
            }
        }

        System.out.println(" additon of two matrics");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                a[i][j]=a[i][j]+b[i][j];

            }
        }
        

        System.out.println(" result add of two matrics");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.print(a[i][j]+" ");
                
            }
    System.out.println(" ");
        
        }
        


    }
}