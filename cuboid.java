class cuboid
{
    double length;
    double breath;
    double height;
    double cubo;

    cuboid()
    {
         length=10.22;
         breath=20.33;
         height=30.21;

    }
    void volume()
    {
        
        cubo=this.length * this.breath * this.height;
    }
    void display()
    {
        System.out.println(cubo);
    }
    public static void main(String[] args) {
        cuboid co=new cuboid();
        co.volume();
        co.display();
    }
    
}