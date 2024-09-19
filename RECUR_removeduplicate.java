 class RECUR_removeduplicate {
    public static boolean[] map=new boolean[26];
    public static void removeDuplicates(String str,int index,String newstring)
    {
        if(index==str.length())
        {
            System.out.println(newstring);
            
            return;
        }
        char currchar=str.charAt(index);
        if(map[currchar-'a']==true)
        {
            removeDuplicates(str, index+1, newstring);
        }
        else
        {

            newstring+=currchar;
            map[currchar-'a']=true;
            removeDuplicates(str, index+1, newstring);
        }
    }
    public static void main(String[] args) {
        String str="aabbccdd";
        int index=0;
        removeDuplicates(str,index,"");
    }
    
}
