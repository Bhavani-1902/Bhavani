package javaproj3;
interface sports{
    void football();
}
class throwball implements sports{
    public void football(){
        System.out.println("Outdoor games");
    }
}
class badminton implements sports{
    public void football(){
        System.out.println("badminton is alos ourdoor game");
    }
}
public class inset3 {
    public static void main(String[] args) {
        sports s1=new badminton();
        s1.football();
        sports s2=new throwball();
        s2.football();

    }
}

