import java.util.*;
class RECUR_sub
{
    public static void subsequence(String str,int index,String newstring,Set<String>set)
    {
        if(index==str.length())
        {
            if(set.contains(newstring))
            {
                return;
            }
            else
            {
                System.out.println(newstring);
                set.add(newstring);
                return;
            }
           
        }
        char currelement=str.charAt(index);
        subsequence(str,index+1,newstring+currelement,set);
        subsequence(str,index+1,newstring,set);

    }
    public static void main(String[] args) {
        String str="xxx";
        Set<String>set=new HashSet<>();
        int index=0;
        subsequence(str,index,"",set);
    }
}