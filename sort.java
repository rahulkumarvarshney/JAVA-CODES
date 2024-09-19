import java.util.Arrays;

public class sort {
   public static void main(String[] args) {
    int arr[]={2,5,2,6,8,7};
    for(int i=0; i<arr.length; i++)
    {
        for(int j=i+1; j<arr.length;j++ )
        {
            if(arr[j]>arr[i])
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

            }
        }
        System.out.println(arr[i]);
    }
   } 
}
