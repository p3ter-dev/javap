public class GBProgram {
    public static void main(String[] args) {
        double[] grades = {99, 87, 78, 60};
        GradebookOO gb = new GradebookOO();
        for (int i = 0; i < grades.length; i++) {
            gb.addGrades(grades[i]);
        }
        gb.printGrades();
        double average = gb.averageGrade();
        System.out.printf("your average is %f\n", average);
        gb.letterOfGrade();
        if (gb.deleteGrade(87)) {
            System.out.println("Element Successfully deleted!");
            gb.printGrades();
        }
        else {
            System.out.println("Element Not Found!");
            gb.printGrades();
        }
    }
}
