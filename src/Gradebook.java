import java.util.Scanner;

public class Gradebook {
    public static void main(String[] args) {
        double[] grades;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of grades: ");
        int num = sc.nextInt();

        if (num <= 0) return;
        grades = new double[num];
        for (int i = 0; i < num; i++) {
            System.out.printf("grades[%d]: ", i);
            grades[i] = sc.nextDouble();
        }
        System.out.println("Choice: ");
        System.out.println(" 1: Print Grades.");
        System.out.println(" 2: Print Average.");

        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                printGrades(grades);
                break;
            case 2:
                double average;
                average = averageGrade(grades);
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

    public static void printGrades(double[] grades) {
        for(int i = 0; i < grades.length; i++) {
            System.out.printf("grades[%d]: %2f\n", i, grades[i]);
        }
    }
    public static double averageGrade(double[] grades) {
        double sum = 0.0;
        double average;
        for(double grade : grades) {
            sum += grade;
        }  
        return (sum / grades.length);

    }
}
