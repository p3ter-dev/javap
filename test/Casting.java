public class Casting {
    public static void main(String[] args) {
        //implicit casting
        //byte > short > int > long > double > float
        // short x = 1;
        // int y = x + 2;
        // System.out.println(y);

        // double x = 3.1;
        // double y = x + 3; // the java compiler automatically casts the integer 3 into the double 3.0
        // System.out.print(y);

        // double c = 3.4;
        // int v = (int)c + 4; // this is called casting explicitly
        // System.out.print(v);

        String x = "67";
        int y = Integer.parseInt(x);
        System.out.println(y);
    }
}
