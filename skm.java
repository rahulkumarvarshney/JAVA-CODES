class a
{
    void show()
    {
        System.out.println("what is your name");
    }
}
class b extends a
{
    
    void show()
    {
        super.show(); //this is used not a overidde by super keybord
        System .out.println("my name is rahul varshney");
    }
}
class skm
{
    public static void main(String[] args) {
        b ob=new b();
        ob.show();
        
        
    }
}

