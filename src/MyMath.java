public class MyMath {
    public static final double PI = 3.14159;
    public static double square(double x) {
        return x * x;
    }
    public static int setpi(int PI) {
        return PI;
    }


    public static void main(String[] args) {
        MyMath m = new MyMath();
        System.out.println("m: value of PI is " + MyMath.PI);
        System.out.println("m: square root of 4 " + MyMath.square(4));
        MyMath n = new MyMath();
        System.out.println("n: value of PI is " + MyMath.PI);
        System.out.println("n: square root of 4 " + MyMath.square(4));

        int seepi = MyMath.setpi(-7);
        System.out.println(seepi);
        System.out.println(Math.PI);
        System.out.println(Math.abs(seepi));

    }
}
