import java.util.Scanner;
class bubble_sort
{
    int a[]=new int[10];
    void getData()
    {
        int i;
        Scanner sc=new Scanner(System.in);
        for(i=0; i<10; i++)
        {
            System.out.println("enter number:");
            a[i]=sc.nextInt();
        }
    }
    void sort()
    {
        int i,j,t;
        for(i=0; i<10; i++)
        {
            for(j=0; j<9-i; j++)
            {
                if(a[j]>a[j+1])
                {
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                 }
            
        }
    }
    }
    void putData()
    {
        int i;
        for(i=0; i<10; i++)
        {
            System.out.println(a[i]);
        }
    }
    public static void main(String[] args) {
        bubble_sort ob1=new bubble_sort();
        ob1.getData();
        System.out.println("unsorted array elements");
        ob1.sort();
        System.out.println("sorted array elements");
        ob1.putData();
    }
}