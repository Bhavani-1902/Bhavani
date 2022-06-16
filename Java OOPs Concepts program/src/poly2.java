public class poly2 {
    static String animal(String a, String b){
        String c=a+b;
        return c;
    }
    static String animal(String a, String b, String c, String d){
        String e=a+b+c+d;
        return e;
    }
    public static void main(String[] args) {
        System.out.println(poly2.animal("Dog", "Cat"));
       System.out.println(poly2.animal("Tiger", "Lion", "Deer", "Fox"));

    }
}

