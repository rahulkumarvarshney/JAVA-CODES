import java.util.Scanner;
class insertionsort {
    int a[]=new int[10];
    void getdata()
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0; i<10; i++)
        {
            System.out.println("enter numbar");
            a[i]=sc.nextInt();
        }
        
    }
    void putdata()
    {
        for(int i=0; i<10; i++)
        {
            System.out.println(a[i]);

        }
    }
    void sort()
    {
        int val,j;
        for(int i=1; i<10;i++)
        {
             val=a[i];
             j=i-1;
             while(val<a[j])
             {
                a[j+1]=a[j];
                j--;
                if(j==-1)
                {
                    break;
                }
             }
             a[j+1]=val;

        }
    }
    
}
/**
 * sorti02
 */
 class sorti02 {

    public static void main(String[] args) {
          insertionsort ob=new insertionsort();
          ob.getdata();
          System.out.println("unsorted array is");
          ob.putdata();
          ob.sort(); 
          System.out.println("sorted array is:");  
          ob.putdata();       
    }
}

