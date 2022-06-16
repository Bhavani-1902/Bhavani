public class Fibonacci {
    public static void main(String[] args) {
        // write your code here
        int num1=5;
        int num2=1;
        int num3=9;

        for(int i=1;i<=18;i++){
            int num=num1+num2;
            System.out.println(num1+"");
            System.out.println(num2+"");
            System.out.println(num3+"");
            num1=num2;
            num2=num3;

        }
    }
}

