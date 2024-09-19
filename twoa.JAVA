import java.util.*;
class twoa
{
    public static void main(String[]args)
    {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter rows size");
        int rows=sc.nextInt();
        System.out.println("enter columns size");
        int cols=sc.nextInt();
        int arr[][]=new int[rows][cols];
        int arrs[][]=new int[rows][cols];
        int arrm[][]=new int[rows][cols];
        System.out.println("enter rows and columns");
        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<cols; j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<cols; j++)
            {
                arrs[i][j]=sc.nextInt();
            }
        }

        
        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<cols; j++)
            {
                System.out.print("["+arr[i][j]+"]"+" ");
            }
            System.out.println();
        }

        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<cols; j++)
            {
                System.out.print("["+arrs[i][j]+"]"+" ");
            }
            System.out.println();
        }
        System.out.println("sum of two matrix");

        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<cols; j++)
            {
                arrm[i][j]=arr[i][j]+arrs[i][j];
            }
            System.out.println();
        }
            System.out.println("sum is: ");

        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<cols; j++)
            {
                arrm[i][j]=arr[i][j]+arrs[i][j];
            }
            System.out.println();
        }

    }

}