public class UsingControlStructures {
    public static void main(String[] args) {
        int age = 22;

        if (age >= 18) {
            System.out.println("You are old enough to drive!");
        }
        else {
            System.out.println("You are not old enough to drive!!");
        }


        // for (int i = 100; i >= 0; i--) {
        //     if (i % 2 != 0) {
        //         System.out.printf("%d, ", i);
        //     }
        // }


        int i = 100;
        while (i >= 0) {
            if (i % 2 != 0) {
                System.out.printf("%d, ", i);
            }

            i--;
        }
    }
}