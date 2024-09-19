import java.util.*;
public class leap {
    public static void main(String[] args) {
        int year;
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter year\n");
        year=sc.nextInt();
        if(year % 400==0 || (year % 4==0 && year % 100 !=0))
        {
            System.out.println("your year is leap year :"+year);
        }
        else
        {
            System.out.println("your year is not a leap year");
        }
    }
    
}
