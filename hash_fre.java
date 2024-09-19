import java.util.*;
class hash_fre
{
    public static void main(String[]args)
    {
        int arr[]={1,2,5,1,4,4,4,6,4};
    Map<Integer,Integer>fre=new HashMap<>();
    for(int ele:arr)
    {
        if(!fre.containsKey(ele))
        {
            fre.put(ele,1);
        }
        else
        {
                fre.put(ele,fre.get(ele)+1);
        }
    }
    
    // int maxfreq=0; int anskey=-1;
    // for(var e:fre.entrySet())
    // {
    //     if(e.getValue() > maxfreq)
    //     {
    //         maxfreq=e.getValue();
    //         anskey=e.getKey();
    //     }
    // }
    // System.out.println(anskey);
    int majority = arr.length / 3;
    for(var e:fre.keySet())
    {
        if(fre.get(e) > majority)
        {
            System.out.println(e);
        }
    }

    
    
}
}
    