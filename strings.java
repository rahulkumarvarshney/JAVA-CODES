import java.util.*;

class strings {
    public static void main(String[] args) {
        // String firstname = "tony";
        // String lastname = "start";
        // String fullname = firstname + " " + lastname;
        // System.out.println(fullname.length());
        // // charAT()
        // for (int i = 0; i < fullname.length(); i++) {
        //     System.out.println(fullname.charAt(i));
        // }



        //s1>s2:+ve value
        //s1==s2 :0
        //s1<s2:-ve value
        String name1="aony";
        String name2="Aony";
        // if(name1.compareTo(name2)==0)
        // {
        //     System.out.println("strings are equal");
        // }
        // else
        // {
        //     System.out.println("strings are not equal");
        // }
        // if(name1==name2)
        // {
        //     System.out.println("verified");
        // }
        // else
        // {
        //     System.out.println("Vverified");
        // }

        // if(name1.equals(name2))
        // {
        //     System.out.println("verified");
        // }
        // else
        // {
        //     System.out.println("Vverified");
        // }

        if(new String("tony") == new String("tony"))
        {
            System.out.println("strings are equals");
        }
        else
        {
            System.out.println("string");
        }

        System.out.println(name1.compareTo(name2));

        String stars="hello indians";
        String rs=stars.substring(6,stars.length()-1);
        System.out.println(rs);

        //Strings are immutable
    }
}