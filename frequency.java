import java.util.Scanner;
class frequency
{
    int n,key;
    int a[];
    void getData()
    {
        int i;
        System.out.println("enter size of array");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        a=new int[n];
        for(i=0; i<n; i++)
        {
            System.out.println("enter array elements");
            a[i]=sc.nextInt();
        }
        
        System.out.println("enter the search key");
        key=sc.nextInt();
    }
    void search()
    {
        int i,count=0;
        for(i=0; i<=n; i++)
        {
            if(a[i]==key)
            {
             
                count=count+1;
             }
               
        }
        System.out.println("searching is sucsessfull"+count);
    }
    public static void main(String[] args) {
        frequency ob=new frequency();
        ob.getData();
        ob.search();

    }
    }
