import java.util.*;
public class array2
{
public static void main(String args[])
{
	int [] a=new int [5];
    int i;
    System.out.println("enter the array of element");
    Scanner sc=new Scanner(System.in);
    for(i=0; i<5; i++)
    {
        a[i]=sc.nextInt();
    }
    System.out.println(" array of element");
    for(i=0; i<5; i++)
    {
        System.out.println(a[i]);
    }
}
}
