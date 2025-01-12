import java.util.Date;


public class variables {
    public static void main(String[] args) {
        byte age = 30;
        short viewsCount = 12345;
        long viewsCountLong = 3_123_456_789L;
        long viewsCountInt = 3_123_456_789L;
        float price = 10.99F;
        char letter = 'A';
        boolean isEligible = false;

        Date now = new Date();
        boolean result = now.after(now);
        System.out.println(result);
    }
}
