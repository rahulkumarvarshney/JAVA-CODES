class I_SORT
{
    public static void main(String[]args)
    {
        int arr[]={10,58,69,2,9,87};
        for(int i=0; i<arr.length; i++)
        {
            int temp=arr[i];
            int j=i-1;
            while( j>=0 && arr[j]>temp)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}