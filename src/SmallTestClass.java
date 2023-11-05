import java.util.ArrayList;
import java.util.List;

public class SmallTestClass {
    List<Person> personList = new ArrayList<>();

    public SmallTestClass(PersonsManager personsManager) {
        //The following 3 lines are commented out, due to person class being abstract.
        //personList.add(new Person(100, "Hans Nielsen"));
        //personList.add(new Person(101, "Niels Hansen"));
        //personList.add(new Person(102, "Ib Boesen"));
        personsManager.addPerson((new Teacher(103, "Bent H. Pedersen", "BHP")));
        personsManager.addPerson((new Teacher(104, "Peter I. Hansen", "PIH")));
        personsManager.addPerson((new Teacher(105, "Henrik Krogh", "HKR")));
        personsManager.addPerson((new Student(106, "Hans Hansen", new Gradeinfo("SCO", 5), "SCO")));
        personsManager.addPerson((new Student(107, "Niels Nielsen", new Gradeinfo("SDE", 5), "SDE")));
        personsManager.addPerson((new Student(108, "Ib Ibsen", new Gradeinfo("ITO", 5), "ITO")));
    }

    public void addPersons(){
        for (Person person: personList) {
            System.out.println(person);//Prints the person's toString()
        }
    }
    public List<Teacher> getTeachers(){
        List<Teacher> tempTeacherList = new ArrayList<>();
        for (Person p: personList) {
            if (p instanceof Teacher){
                tempTeacherList.add((Teacher) p);
            }
        }
        return tempTeacherList;
    }

    public Student getStudents(){
        List<Student> tempStudentList = new ArrayList<>();
        for (Person p: personList) {
            if (p instanceof Student){
                tempStudentList.add((Student) p);
            }
        }
        return (Student) tempStudentList;
    }
}
