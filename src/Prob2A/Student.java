package Prob2A;

public class Student {

    private String name;
    private GradeReport gradeReport;

    public Student(String name, GradeReport gradeReport) {
        this.name = name;
        this.gradeReport = gradeReport;
        gradeReport.setStudent(this);
    }

    public String getName() {
        return name;
    }

    public GradeReport getGradeReport() {
        return gradeReport;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", gradeReport=" + gradeReport.getGrade() + "]";
    }

}
