import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person{

    private List<String> subjects = new ArrayList<>();
    private String initials;
    private double salary;


    public Teacher(int id, String name, String initials) {
        super(id, name);
        this.initials = initials;
        addSubject("Subject test");//THIS IS A TEST THING - DELETE LATER
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public String getInitials() {
        return initials;
    }

    public double getSalary() {
        return salary;
    }

    public void addSubject(String subject){
        this.subjects.add(subject);
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + " Teacher{" +
                "subjects=" + subjects +
                ", initials='" + initials + '\'' +
                '}';
    }
}
