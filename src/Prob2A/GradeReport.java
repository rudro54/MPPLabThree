package Prob2A;

public class GradeReport {

  private String grade;
  private  Student student;

  GradeReport(String grade) {
      this.grade = grade;
  }

  public void setStudent(Student student) {
      this.student = student;
  }

  public String getGrade() {
      return grade;
  }

  public Student getStudent() {
      return student;
  }

    @Override
    public String toString() {
        return "GradeReport [grade=" + grade + ", student=" + student.getName() + "]";
    }





}
