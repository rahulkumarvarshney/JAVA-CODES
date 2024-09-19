//import java.util.Scanner;
public class maxsubarray {
    public static void main(String[] args) {
        // System.out.println("enter size of an array");
        // Scanner sc=new Scanner(System.in);
        // int size=sc.nextInt();
        int arr[]={-5,4,6,-3,4,1};
        int maxsum=0;
        int currentsum=0;
        // for(int i=0; i<=arr.length; i++)
        // {
        //     arr[i]=sc.nextInt();
        // }
        for(int i=0; i<arr.length; i++)
        {
            currentsum=currentsum+arr[i];
            if(currentsum>maxsum)
            {
                maxsum=currentsum;
            
            }
            if(currentsum<0)
            {
                currentsum=0;
            }
            
        }
        System.out.println(maxsum);
        
    }
}
