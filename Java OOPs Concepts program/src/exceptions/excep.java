package exceptions;

public class excep {
    public static void main(String[] args) {
        try{
            int divide =20/5;
            System.out.println("division");
        }
        catch(ArithmeticException e){
            System.out.println("error is occurred");
        }
        finally{
            System.out.println("Finally we blocked");
        }
    }
}

