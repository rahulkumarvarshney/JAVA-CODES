class union
{
    
    static void punion(int a[],int b[],int m,int n)
    {
        int i=0,j=0;
        while(i<m & j<n)
        {
            if(a[i]<a[j])
            {
                System.out.println(a[i++]+"");
            }
            else if(b[j]<a[i])
            {
                System.out.println(b[j++]+"");
            }
            else
            {
                System.out.println(b[j++]+"");
                i++;
            }
        }
        while(i<m)
        {
                System.out.println(a[i++]);
        }
        while(j<n)
        {
            System.out.println(b[j++]);
        }
    }

    public static void main(String[] args) {
        int a[]={1,2,3};
        int b[]={1,2,3,4};
        int m=a.length;
        int n=b.length;
        punion(a,b,m,n);
    }
}