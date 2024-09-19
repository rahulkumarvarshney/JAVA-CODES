import java.util.*;
public class bubble {
    public static void bubl(int arr[])
    {
        
        for(int i=arr.length; i>0; i--)
        {
            for(int j=0; j<i-1; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("sorted array");
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int n;
       
       
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array elements");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter array elements");
        for(int i=0; i<arr.length; i++)
        {
            arr[i]=sc.nextInt();
        }
        bubl(arr);
    }
}
