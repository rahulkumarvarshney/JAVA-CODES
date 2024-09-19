 class RECUR_moveallx {
    public static void movex(String str,int index,int count,String newstr)
    {
        if(index==str.length()-1)
        {
            for(int i=0; i<=count; i++)
            {
                newstr+='x';
                
            }
            System.out.println(newstr);
            return;
        }
        char ch=str.charAt(index);
        if(ch=='x')
        {
            count++;
            movex(str,index+1,count,newstr);
        }
        else{
            newstr+=ch;
            movex(str,index+1,count,newstr);
        }
    }
    public static void main(String[] args) {
        String str="abcdxexx";
        int index=0;
        movex(str,index,0," ");
    }
}
