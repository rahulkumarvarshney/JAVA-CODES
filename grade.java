 import java.util.*;
 class grade {
    public static void main(String[] args) {

        int marks;
        Scanner sc=new Scanner(System.in);
        marks=sc.nextInt();
        if(marks>90 && marks<100)
        {
            System.out.println("A");

        }
        else if(marks>80 && marks<90)
        {
                System.out.println("grade : \"B\"");
        }   

        else if(marks>70 && marks<80)
        {
                System.out.println("C");
        }  
        else
        {
            System.out.println("fail");
        } 

        int x=8;
        int y= -x;
        System.out.println(y);
        
        
    }
}
