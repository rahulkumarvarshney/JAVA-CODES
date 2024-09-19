import java.util.*;
class counts
{
    public static void main(String[] args) {

        String str;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string..");
        str=sc.nextLine();
        int count=0;
        String temp[]=str.split(" ");
        String word;
        word=sc.nextLine();
        System.out.println("enter charcter");
        for(int i=0; i<temp.length; i++)
        {
            if(word.equals(temp[i]))
            {
                count++;
            }
           
        }



    }
}


//WAF 
