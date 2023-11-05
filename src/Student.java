import java.util.List;

public class Student extends Person{

    private Gradeinfo gradeReport;
    private String education;

    public Student(int id, String name, Gradeinfo gradeReport, String education) {
        super(id, name);
        this.gradeReport = gradeReport;
        this.education = education;
    }

    public Gradeinfo getGradeReport() {
        return this.gradeReport;
    }

    public String getEducation() {
        return education;
    }

    public double getAverageGrade(){
        return 0.0;
        //fix.
    }

    public int getGrade(String subject){
        return 0;
        //fix
    }

    public void addGrade(Gradeinfo grade){
        //add grade or something
    }

    @Override
    public String toString() {
        return super.toString() + " Student{" +
                "gradeReport=" + gradeReport +
                ", education='" + education + '\'' +
                '}';
    }
}
