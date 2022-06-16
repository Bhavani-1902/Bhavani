//abstract

class c extends language{
    void display(){
        System.out.println("c is also a programming language");
    }
}
class java extends language{
    void display(){
        System.out.println("java is also a programming language");
    }
}
 class abs {
    public static void main(String[] args) {
        c obj1=new c();
        obj1.display();
        java obj2=new java();
        obj2.display();
    }
}

