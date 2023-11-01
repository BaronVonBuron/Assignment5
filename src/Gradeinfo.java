public class Gradeinfo {
    private String subject;
    private int grade;

    public Gradeinfo(String subject, int grade){
        this.grade = grade;
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Gradeinfo{" +
                "subject='" + subject + '\'' +
                ", grade=" + grade +
                '}';
    }
}
