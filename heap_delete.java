import java.util.Scanner;
public class heap_delete {
    public static void heapd(int arr[],int n)
    {
        arr[1]=arr[n];
        n=n-1;
       int i=1;
       while(i<n)
       {
        int left=arr[2*i];
        int right=arr[2*i+1];
        int larger=left>right?2*i:2*i+1;
        if(arr[i]<larger)
        {
            int temp=larger;
            larger=arr[i];
            arr[i]=temp;
            i=larger;
        }
       }

    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter array elements");
        for(int i=1; i<arr.length; i++)
        {
            arr[i]=sc.nextInt();
        }
        heapd(arr,n);
        for(int i=1; i<=arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
    
}
