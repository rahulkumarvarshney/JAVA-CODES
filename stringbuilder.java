import java.util.Scanner;
public class stringbuilder {
    public static void main(String[]args)
    {
        StringBuilder sb=new StringBuilder("xxxxx123");
        // sb.append('e');
        // sb.append('l');
        // System.out.println(sb);
        // // System.out.println(sb.charAt(0));
        // // // for(int i=0; i<sb.length(); i++)
        // // // {
        // // //     System.out.println(sb.charAt(i));
        // // // }
        // // sb.setCharAt(0, 'p');
        // // System.out.println(sb);

        // sb.insert(2, 'n');
        // System.out.println(sb);

        // sb.delete(2, 4);
        // System.out.println(sb.length());
        for(int i=0; i<sb.length()/2; i++)
        {
            int front=i;
            int back=sb.length()-1-i;
            char frontchar=sb.charAt(front);
            char backchar=sb.charAt(back);
            sb.setCharAt(front, backchar);
            sb.setCharAt(back, frontchar);
        }
        System.out.println(sb);
        
    }
    
    

}
