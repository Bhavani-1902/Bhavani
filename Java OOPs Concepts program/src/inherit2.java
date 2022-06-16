//parent class
class Teacher{
    void specialization(){
        System.out.println("Science and English");
    }
}
//child class1
class Student1 extends Teacher{
    void Science(){
        System.out.println("To learn Science");
    }
}
//child class2
class student2 extends Teacher{
    void English(){
        System.out.println("To learn English");
    }
}

public class inherit2 {
    public static void main(String[] args) {
        student2 s2=new student2();
        s2.English();
        s2.specialization();
        Student1 s1=new Student1();
        s1.Science();
        s1.specialization();
    }
}

