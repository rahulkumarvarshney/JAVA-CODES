class permut_combi
{
    public static void combination(String str,String combination)
    {
        if(str.length()==0)
        {
            System.out.println(combination);
            return;
        }
        for(int i=0; i<str.length(); i++)
        {
            char element=str.charAt(i);
            String newstr=str.substring(0,i)+str.substring(i+1);
            combination(newstr,combination+element);
        }
    }
    public static void main(String[]args)
    {
        String str="abcd";
        combination(str,"");
    }
}

//output 
// abc
// acb
// bac
// bca
// cab
// cba