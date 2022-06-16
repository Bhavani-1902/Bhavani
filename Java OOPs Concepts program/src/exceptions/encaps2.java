package exceptions;
import java.io.*;

public class encaps2 {
    public static void main(String[] args) {
        try{
            FileOutputStream fout1 =new FileOutputStream("D:\\blank");
            String s="Welcome to my page";
            byte b[] = s.getBytes();
            fout1.write(b);
            fout1.write(66);
            fout1.close();
            System.out.println("Hello");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

