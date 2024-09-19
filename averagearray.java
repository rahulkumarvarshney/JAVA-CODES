import java.util.*;
class averagearray
{
    public static int acgarr(int arr[])
    {
        int sum=0;
        for(int i=0; i<arr.length; i++)
        {
            sum=sum+arr[i];
        }
        
        return sum;

    }
    public static double averagearray(int arr[])
    {
        double sum=acgarr(arr);
        double avg=sum/arr.length;
        return avg;
    }

    public static void main(String[] args) {
        int n;
        System.out.println("enter the size of an array");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("please enter the elements");
        for(int i=0; i<arr.length; i++)
        {
                arr[i]=sc.nextInt();
        }
        int x=acgarr(arr);
        System.out.println(x);

       double y= averagearray(arr);
       System.out.println(y);
        
        }
}