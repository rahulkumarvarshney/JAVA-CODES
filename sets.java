import java.util.*;
class sets
{
    
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String s1="{1,3,5,7,9,11,13,15,17,19,21,23,25,27,29,31}";
        String s2="{2,3,6,7,10,11,14,15,18,19,22,23,26,27,30,31}";
        String s3="{4,5,6,7,12,13,14,15,20,21,22,23,28,29,30,31}";
        String s4="{8,9,10,11,12,13,14,15,24,25,26,27,28,29,30,31}";
        String s5="{16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31}";
        int sum=0;
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        for(int i=0; i<5; i++)
        {
            System.out.println("is your birth date exist in set (T/t)"+i+1);
            char ans=sc.nextLine().charAt(0);
            int temp=(int)Math.pow(2,i);
            if(ans=='t'){
                sum+=temp;
            }
        }
        System.out.println(sum);
        
    }

        

}