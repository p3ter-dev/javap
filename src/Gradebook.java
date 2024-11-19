public class Gradebook {
    public static void main(String[] args) {
        double[] grades = {40.12, 50.98, 60.78, 90.93, 99};

        for(int i = 0; i < grades.length; i++) {
            System.out.printf("grades[%d]: %2f\n", i, grades[i]);
        }

        double sum = 0.0;

        for(double grade : grades) {
            sum += grade;
        }
        double average;
        average = sum / grades.length;
        System.out.printf("Your avarage grade is: %2f\n", average);

        if (average >= 90)
            System.out.println("You got 'A'.");
        else if (average >= 80)
            System.out.println("You got 'B'.");
        else if (average >= 70)
            System.out.println("You got 'C'.");
        else if (average >= 60)
            System.out.println("You got 'D'.");
        else
            System.out.println("You got 'F'.");
    }
}
