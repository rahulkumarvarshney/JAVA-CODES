import java.util.*;
//import java.util.Scanner;
class duplicate_char
{
    public static void dup_char(String str)
    {
        Map<Character,Integer>m=new HashMap<>();
        char []ch=str.toCharArray();
        for(char c:ch)
        {
           if(m.containsKey(c)) 
           {
            m.put(c, m.get(c)+1);
           }
           else
           {
            m.put(c,1);
           }
        }
        for(Map.Entry<Character,Integer>e:m.entrySet())
        {
            if(e.getValue()>1)
            {
                System.out.println(e.getKey()+" "+e.getValue());
            }
        }
    }
    public static void main(String[]args)
    {
        String str="xxxxghuh";
        dup_char(str);
    }
}