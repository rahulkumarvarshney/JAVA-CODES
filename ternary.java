// class ternary
// {
//     public static void main(String[] args) {
//         int a=200,b=1000,c=30,max;
//         max=(a>b)?(a>c?a:c):(b>c?b:c);
//         System.out.println(max);
//     }
// }

class ternary
{
    public static void main(String[] args) {
        int a=200,b=1000,c=3000;
        if(a>b)
        {
            if(a>c)
            {
                System.out.println(a);
            }
            else
            {
                System.out.println(b);
            }
        }
        else if(b>c)
        {
            System.out.println(b);
        }
        else
        {
            System.out.println(c);
        }
    }
}