public class First {
    public static void main(String[] args) {
        int a=9;
        int b=6;

       /* -using additional variable
        int c=a;
        a=b;
        b=c;*/

        b=a+b;
        a=b-a;
        b=b-a;

        System.out.println(" a = " + a);
        System.out.println(" b = " + b);
    }
}
//   Develop a program that can switch values between two variables:
//
//        int a = 9 int b = 6                  =>             int a = 6 int b = 9
//
//        -using additional variable
//        -without additional variable