class negshif
{
    static void neg(int a[])
    {
        
        int t[]=new int[a.length];
        int j=0;
        for(int i=0; i<a.length; i++)
        {
            if(a[i]>=0)
            {
                t[j++]=a[i];
            }
            if(j==0 || j==0)
            {
                return;
            }
            for(i=0; i<a.length; i++)
            {
                if(a[i]<0)
                {
                    t[j++]=a[i];
                }
            }
            for(  i=0; i<a.length; i++)
        {
            a[i]=t[i];
            
            
          
        }
       
        }

        
      
        
        


    }
    public static void main(String[] args) {
        int a[]={1,-1,3,2,-7,-5,11};
        neg(a);
    }
}
