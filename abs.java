abstract class animal
{
    animal()
    {
        System.out.println("all animals are barking");
    }
    void sleep()
    {
        System.out.println("rahul");
    }


    public abstract void sound();
}
class dog extends animal
{
    dog()
    {
        super();
    }
    public void sound()
    {
        System.out.println("dog is barking");
    }
}
class lion extends animal
{
    // lion()
    // {
    //     super();
    // }
    public void sound()
    {
        System.out.println("lion is roars");
    }
}
class abs
{
    public static void main(String[] args) {
        lion l=new lion();
        l.sound();
        l.sleep();
        

        dog d=new dog();
        d.sound();
    }
}
