class maximum
{
    public static void main(String args[])
    {
        int arr[]={12,1234,45,67,1};
        int max=arr[0];
        int min=arr[0];
        for(int i=1; i<arr.length; i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        for(int i=1; i<arr.length; i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];

            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}