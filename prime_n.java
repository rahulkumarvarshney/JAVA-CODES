// import java.util.Scanner;
// class prime_n
// {
//     public static void main(String[] args) {
//         int i;
//         int j;
//         int count;
//         int total=0;
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter number you want to prime");
//         int n=sc.nextInt();
//         for(i=1; i<=n; i++)
//         {
//             count=0;
//             for(j=1; j<=i; j++)
//             {
//                 if(i%j==0)
//                 {
//                     count++;
//                 }
//             }
//             if(count==2)
//                  {
//                      System.out.println(i);
//                     //  total=total+1;
//                  }
//         }
//         // System.out.println(total);
        

//     }
    
// }

import java.util.*;
public class prime_n {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count;
		// int total=0;
		int i;
		int j;
		for(i=1; i<=n; i++)
		{
			count=0;
			for(j=1; j<=i; j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(i);
			}
		}
    }
}
