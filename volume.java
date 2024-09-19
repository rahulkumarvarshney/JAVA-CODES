import java.util.*;
class volume
{
    int length,breath,height,c;
    volume(int length,int breath,int height)
    {
        this.length=length;
        this.breath=breath;
        this.height=height;
    }
    void volumes()
    {
        c=this.length*this.breath*this.height;
    }
    void display()
    {
        System.out.println(c);
    }
    public static void main(String[] args) {
            int x;
            int y;
            int z;
            Scanner sc=new Scanner(System.in);
            x=sc.nextInt();
            y=sc.nextInt();
            z=sc.nextInt();
        
            volume vo=new volume(x,y,z);
            vo.volumes();
            vo.display();


    }
}
