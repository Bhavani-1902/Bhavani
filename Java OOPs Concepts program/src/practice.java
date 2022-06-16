public class practice {
    int id=1902;
    double salary=20000;
    String name="bhavani";
    public static void main(String[] args)  {
        practice obj1=new practice( );
        practice obj2=new practice ();

        System.out.println(obj1.id);
        System.out.println(obj1.salary);
        System.out.println(obj1.name);

        System.out.println(obj2.id);
        System.out.println(obj2.salary);
        System.out.println(obj2.name);
    }
}
