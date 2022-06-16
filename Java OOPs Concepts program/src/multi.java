class A{
    void display(){
        System.out.println("Display A");
    }

}
class B extends A{
    void fun(){
        System.out.println("Fun B");
    }
}
class C extends B{
    void eat(){
        System.out.println("Eat food");
    }
}
 class multi {
    public static void main(String[] args) {
        C c=new C();
        c. display();
        c.fun();
        c.eat();
    }
}

