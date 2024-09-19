class nonrepeat
{
    public static void main(String[]args)
    {
        int arr[]={5,4,1,4,3,5,1,6};
        int res=0;
        int temp;
        
        
            for(int i=0; i<arr.length; i++)
            {
                res=res^arr[i];
                
            
            }
           
            System.out.println(res);
        
        
       
        

    }
}