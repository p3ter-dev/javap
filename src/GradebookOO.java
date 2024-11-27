public class GradebookOO {
    private double[] grades;
    public GradebookOO() {
        grades = new double[0];
    }

    public void printGrades() {
        for (int i = 0; i < grades.length; i++) {
            System.out.printf("grades[%d]: %f\n", i, grades[i]);
        }
    }

    public void addGrades(double grade) {
        double[] temp = new double[grades.length + 1];
        for(int i = 0; i < grades.length; i++) {
            temp[i] = grades[i];
        }
        temp[grades.length] = grade;
        grades = temp;
    }

    public boolean deleteGrade(double grade) {
        int index = -1;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] == grade) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            double[] temp = new double[grades.length - 1];
            for (int i = 0, j = 0; i < grades.length; i++) {
                if (index != i) {
                    temp[j] = grades[i];
                    j++;
                }
            }
            grades = temp;
            return true;
        }
        return false;
    }
    public double averageGrade() {
        double sum = 0.0;
        for (double grade : grades) {
            sum += grade;
        }
        return (sum / grades.length);
    }

    public void letterOfGrade() {
        double average = averageGrade();
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
