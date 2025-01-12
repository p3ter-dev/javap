
import java.util.Scanner;

public class ReadingInput {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // byte age = scanner.nextByte();
        // System.out.println("You are this " + age);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner.nextLine().trim();
        System.out.println("You are " + name);
    }
}
