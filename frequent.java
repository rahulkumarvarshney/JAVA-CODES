import java.util.Scanner;
class frequent
{
    public static void main(String[] args) {
        int arr[]={10,20,30,10,40,50,20,10,30,10};
        int key;
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter key");
        key=sc.nextInt();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                count++;
            }
            
        }
        System.out.println(count);

    }
}
