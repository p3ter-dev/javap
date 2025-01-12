
import java.text.NumberFormat;

public class FormattingNumbers {
    public static void main(String... args) {
        // NumberFormat currency = NumberFormat.getCurrencyInstance();
        // String result = currency.format(123456.892);
        // System.out.print(result);

        NumberFormat percent = NumberFormat.getPercentInstance();
        String result = percent.format(0.5);
        System.out.println(result);
    }
}
