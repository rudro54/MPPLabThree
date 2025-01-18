package Prob2A;

public class TestStudent {
    public static void main(String[] args) {
        GradeReport gradeReport = new GradeReport("A");
        Student student = new Student("Zayed", gradeReport);
        System.out.println(gradeReport);
        System.out.println(student);

    }

}
