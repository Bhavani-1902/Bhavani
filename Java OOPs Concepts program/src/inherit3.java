//parent class
class sports{
    void games(){
        System.out.println("chess and throwball");
    }
}
//child class1
class indoorgames extends sports{
    void chess(){
        System.out.println("To play Chess");
    }
}
//child class2
class outdoorgames extends sports{
    void throwball(){
        System.out.println("To play Throwball");
    }
}

public class inherit3 {

    public static void main(String[] args) {
    outdoorgames sports2=new outdoorgames();
    sports2.throwball();
    sports2.games();
    indoorgames sports1=new indoorgames();
    sports1.chess();
    sports1.games();
    }

}
