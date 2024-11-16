import java.util.ArrayList;

public class fibonacciGenerator {
    public static void main(String[] args) {
        fibonacciGenerator(4);
    }
    public static void fibonacciGenerator(int n) {
        ArrayList<Integer> output = new ArrayList<>();

        if (n == 1) {
            output.add(0);
        }
        else if (n == 2) {
            output.add(0);
            output.add(1);
        }
        else {
            output.add(0);
            output.add(1);

            for (int i = 2; i <= n; i++) {
                output.add(output.get(output.size() - 2) + output.get(output.size() - 1));
            }
        }

        System.out.println(output);
    }
}
