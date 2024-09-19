import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class abcbf implements Serializable {

    int id;
    String name;
    abcbf(int id,String name)
    {
        this.id=id;
        this.name=name;
    }

    
}
class abcbfg
{
    public static void main(String[] args) throws Exception {
        abcbf ob=new abcbf(123,"rahul");
        File f=new File("abc.txt");
        FileOutputStream fis=new FileOutputStream(f);
        ObjectOutputStream obs=new ObjectOutputStream(fis);
        obs.writeObject(ob);

        FileInputStream s=new FileInputStream(f);
        ObjectInputStream obj=new ObjectInputStream(s);
        abcbf obk=(abcbf)obj.readObject();
        System.out.println(obk.id);
        System.out.println(obk.name);

        



    }
}
