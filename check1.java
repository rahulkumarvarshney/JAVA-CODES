
interface client
{
    void webdesign();    // public+abstract
    void webdevlp();
}



abstract class rajtech implements client
{
   public  void webdesign()
    {
        System.out.println("green,menu top,three dot button");
    }
}

 class rtech extends rajtech
{
    public void webdevlp()
    {
        System.out.println("HTML,CSS,JAVASCRIPT");
    }
}
class check1
{
     public static void main(String[] args) {
        rtech ob=new rtech();
        ob.webdesign();
        ob.webdevlp();
    }
}