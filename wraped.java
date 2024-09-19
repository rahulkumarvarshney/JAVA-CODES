public class wraped {
    public static void main(String[] args) {
        int i=10;
        Integer ob=new Integer(i);
        System.out.println(ob);
        int j=ob.intValue();
        System.out.println(j);
        int k=i;
        System.out.println(k);
    }
}
