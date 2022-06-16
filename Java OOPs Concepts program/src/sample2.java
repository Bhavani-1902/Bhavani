public class sample2 {
    int id;
    String name;
    sample2(int a, String s){
        id = a;
        name = s;
        System.out.println("I am a Constructor");
    }
    void NS200(){
        System.out.println(id +" "+ name);
    }


    public static void main(String[] args) {
        sample2 obj1=new sample2(1902, "bhavani");
        sample2 obj2=new sample2(3,"asdf");
        obj1.NS200();
        obj2.NS200();

    }
}