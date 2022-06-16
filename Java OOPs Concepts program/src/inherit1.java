//multi level inheritance
class twowheeler{
    void latest(){
        System.out.println("Latest bike models");
    }
}
//parent class

class bike extends twowheeler{
    void ride(){
        System.out.println("Exclusive bikes");
    }
}
//child class
class honda extends bike{
    void milage(){
        System.out.println("Honda is speed bike");
    }
}


public class inherit1 {
    public static void main(String[] args) {
        honda bike1=new honda();
        bike1.milage();
        bike1.ride();
    }
}

