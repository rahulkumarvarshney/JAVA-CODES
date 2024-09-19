import java.util.*;
class words
{
    public static void main(String[] args) {
        int i,count=1;
        String s=new String();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string...");;
        s=sc.nextLine();
        for(i=0; i<s.length(); i++)
        {
            
            if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
            {
                count++;
            }
        }
        System.out.println("count words:"+count);
    }
}
