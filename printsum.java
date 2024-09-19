class printsum
{
    
        static int printsumm(int i,int n,int sum)
        {
            if(i==n)
            {
                //sum+=i;
               // System.out.println(sum);
                return 1;
            }
            sum+=i;
            return printsumm(i+1,n,sum);
            


        }
        public static void main(String[] args) {
          System.out.println(printsumm(1, 5, 0)); 
          
           
        }
    }
