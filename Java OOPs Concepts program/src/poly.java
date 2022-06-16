//method overloading
public class poly {
    static int sub(int a,int b){
        int c=a+b;
        return c;
    }
    static double sub(double a, double b, double c ){
        double d=a+b+c;
         return d;
    }
    public static void main(String[] args) {
        System.out.println(poly.sub(100,29));
        System.out.println(poly.sub(33,24,23));
    }
}

