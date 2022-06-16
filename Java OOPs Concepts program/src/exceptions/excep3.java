package exceptions;
import java.io.*;
public class excep3 {
    public static void main(String[] args) {
        char[] array=new char[40];
        try{
            FileOutputStream ens=new FileOutputStream("D:\\java3");
            String s="Rose is butiful";
            byte B[]=s.getBytes();
            ens.write(B);
            ens.write(66);
            ens.close();
            System.out.println("Byee");
            FileInputStream obj=new FileInputStream("D:\\java3");
            InputStreamReader obj1=new InputStreamReader(obj);
            obj1.read(array);
            System.out.println(array);
            obj1.close();
        }
        catch(Exception e){
            System.out.println(e);
            e.getStackTrace();
        }
    }
}

