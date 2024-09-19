class intersec
{
    
    static void pintersec(int a[],int b[],int m,int n)
    {
        int i=0,j=0;
        while(i<m & j<n)
        {
            if(a[i]<a[j])
            {
                i++;
            }
            else if(b[j]<a[i])
            {
                j++;
            }
            else
            {
                System.out.println(b[j++]+"");
                i++;
            }
        }
        
    }

    public static void main(String[] args) {
        int a[]={1,3,4,7};
        int b[]={1,3,4};
        int m=a.length;
        int n=b.length;
        pintersec(a,b,m,n);
    }
}