import java.util.*;
class check_bitwise
{
    public static void main(String[]args)
    {
        int first,second;
        int result;
        Scanner sc=new Scanner(System.in);
        System.out.println("plese enter first number :\n\b \"please enter second number :\"");
        first=sc.nextInt();
        second=sc.nextInt();
         result=first & second;
         int resultbit=first ^ second;
         System.out.println("result is :"+result);
         System.out.println("resultbit is: "+resultbit);
         if(result%2==0)
         {
            System.out.println("even number \n");
         } 
         else{
            System.out.println("odd numbers");
         }
          

    }
}