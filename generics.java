import java.util.ArrayList;

class generics

{
    public static void main(String[]args)
    {
            dog<String,String> d1=new dog<>("asdf123","rahul");
            dog<Integer,String> d2=new dog<>(123,"123");
            goat<Integer> d3=new goat<>(11);
            System.out.println(d3.getid());
               
    }
}
class dog<E,V>
{
    E id;
    V name;
    
    dog(E id,V name)
    {
        this.id=id;
        this.name=name;
        System.out.println(this.id);
        System.out.println(this.name);
        
    }
    
}
class goat<E>
{
    E id;
    
    goat(E id)
    {
        this.id=id;
        System.out.println(this.id);
        
    }
    E getid()
    {
        return id;
        
    }
}