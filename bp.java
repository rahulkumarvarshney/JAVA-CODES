import java.util.Scanner;
class bp
{
    
    public static void main(String[] args) {
        int i,j;
        Scanner sc=new Scanner(System.in);
        int [][]a=new int[2][2];
        for(i=0; i<2; i++)
        {
            for(j=0; j<2; j++)
            {
                a[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("enter the array elements");
        for(i=0; i<2; i++)
        {
            for(j=0; j<2; j++)
            {
                
                System.out.println("transpose:"+a[i][j]);
            }
            
        }
        
    

    }
   
}