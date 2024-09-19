import java.util.Scanner;
class selection
{
    int a[]=new int[10];
    void getData()
    {
        Scanner sc=new Scanner(System.in);
        int i;
        for(i=0; i<10; i++)
        {
            System.out.print("enter number: ");
            a[i]=sc.nextInt();
        }

    }
    void sort()
    {
        int i,j,t;
        for(i=0; i<9; i++)
        
            for(j=i+1; j<10; j++)
            {
                if(a[i]>a[j])
                {
                    t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        
    }
    void putdata()
    {
        int i;
        for(i=0; i<10; i++)
        {
            System.out.println(a[i]);
        }
    }
    public static void main(String[] args) {
        selection ob=new selection();
        ob.getData();
        System.out.print("unsorted array");
        ob.putdata();
        System.out.println("sorted array");
        ob.sort();
        ob.putdata();
    }
}



//SELECTION SORT(A,N)
//REPEAT STEP 2 AND 3 FOR K=1 TO N-1
//SET MIN=A[K] AND LOC=K
//REPEAT FOR J=K+1 TO N
//IF MIN > A[J] THEN
//SET MIN=A[J] AND LOC=J
