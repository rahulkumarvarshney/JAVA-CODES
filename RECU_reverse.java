class RECU_reverse
{
    public static void revers(String s,int index)
    {
        if(index==0)
        {
            System.out.println(s.charAt(index));
            return;
        }
        System.out.print(s.charAt(index));
        revers(s,index-1);
    }
    public static void main(String[]args)
    {
        String s="rahul";
        
        revers(s,s.length()-1);
    }
}