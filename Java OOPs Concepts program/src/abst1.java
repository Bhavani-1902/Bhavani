abstract class language{
    abstract void display();
}
class teach extends language{
    void display(){
        System.out.println("Abstract language is display");
    }
}

public class abst1 {
    public static void main(String[] args) {
        language obj=new teach();
        obj.display();
    }
}

