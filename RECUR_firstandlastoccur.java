 class RECUR_firstandlastoccur {

    public static int first=-1;
    public static int last=-1;
    public static void occurance(String str,int index,char element)
    {
        if(index==str.length()-1)
        {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currchar=str.charAt(index);
        if(currchar==element)
        {
            if(first==-1)
            {
                first=index;
            }
            else
            {
                last=index;
            }
        }
        occurance(str, index+1, element);
    }
    public static void main(String[] args) {
        
        String s="aaabcccaaa";
        int index=0;
        char element='a';
        occurance(s,index,element);
    }
    
}
