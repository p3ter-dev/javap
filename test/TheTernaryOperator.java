public class TheTernaryOperator {
    public static void main(String... args) {
        int income = 200_000;
        String className = income > 100_000 ? "First" : "Economy";
        System.out.println(className);
    }
}
