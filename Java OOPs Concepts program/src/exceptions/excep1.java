package exceptions;
import java.io.*;
public class excep1{
    public static void  main (String[] args){
        char[] array=new char[30];
        try{
            FileInputStream obj=new FileInputStream("D:\\blank");
            InputStreamReader obj1=new InputStreamReader(obj);
            obj1.read(array);
            System.out.println(array);
            obj1.close();
        }
        catch(Exception e){
            e.getStackTrace();
        }
    }
}