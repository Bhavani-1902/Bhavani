public class practice1 {
    int num;
    String name;
    //Function without parameter
    void working(){
        System.out.println("All are working");
    }
    //Function with parameter
    void display(int a){
        System.out.println(a);
    }
    public static void main(String[] args) {
        practice1 obj=new practice1();
        obj.working();
        obj.display( 3);

    }
}