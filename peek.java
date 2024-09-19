class peek
{
    public static void main(String[] args) {
        int a[]={5,10,20,15};
        int low=0;
        int high=a.length-1;
        while (low<high) {
                int mid=low+(high-low)/2;
                if((mid==a.length-1 || a[mid]>a[mid+1]) && (mid==0 || a[mid]>a[mid-1]))
                {
                    System.out.println("peak element is :"+a[mid]);
                    break;
                }
                else if(a[mid]<a[mid+1])
                {
                    low=mid+1;
                }
                else
                {
                    high=mid-1;
                }
            
        }
    }
}