public class TempConverter {
    public static void main(String[] args) {
        double celsius = 100;
        double fahrenheit = (9 / 5.0) * celsius + 32;
        System.out.printf("%.2f degrees Fahrenheit is %.2f degrees Celsius\n", celsius, fahrenheit);
    }
}
