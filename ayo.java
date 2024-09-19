import java.util.Scanner;
class ayo
{
    public static void main(String[] args) {
        int size;
        System.out.println("enter array element");
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();
        int[]arr=new int [size];
        for(int i=0; i<size; i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<size; i++)
        {
            System.out.println(arr[i]);
        }
    }

}

