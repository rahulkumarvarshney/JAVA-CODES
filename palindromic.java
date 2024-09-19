
public class palindromic {
    public static void main(String[] args) {
        String str="saas";
        StringBuilder strs=new StringBuilder(str);
        int i=0;
        int j=str.length()-1;
        boolean flag=true;
        while(i<j)
        {
            if(strs.charAt(i)!=strs.charAt(j))
            {
                flag=false;
                break;
            }
            i++;
            j--;
        }
        if(flag==true)
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not palindrome");
        }

    }
}
