public class deletElement {
    
    public static void main(String[] args) {
        int element=20;
        int a[]={10,20,30,40,50};
        for(int i=0; i<a.length; i++)
        {
            if(element==a[i])
            {
                for(int j=i; i<a.length-1; i++)
                {
                    a[j]=a[j+1];
                }
                break;
            }
        }
        for(int i=0; i<a.length; i++)
        {
            System.out.println(a[i]+" ");
        }
    }
}
