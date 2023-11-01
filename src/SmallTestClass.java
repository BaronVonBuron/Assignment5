import java.util.ArrayList;
import java.util.List;

public class SmallTestClass {
    List<Person> personList = new ArrayList<>();

    public SmallTestClass() {
        personList.add(new Person(100, "Hans Nielsen"));
        personList.add(new Person(101, "Niels Hansen"));
        personList.add(new Person(102, "Ib Boesen"));
        personList.add(new Teacher(103, "Bent H. Pedersen", "BHP"));
        personList.add(new Teacher(104, "Peter I. Hansen", "PIH"));
        personList.add(new Teacher(105, "Henrik Krogh", "HKR"));
        personList.add(new Student(106, "Hans Hansen", new ArrayList<Gradeinfo>(), "SCO"));
        personList.add(new Student(107, "Niels Nielsen", new ArrayList<Gradeinfo>(), "SDE"));
        personList.add(new Student(108, "Ib Ibsen", new ArrayList<Gradeinfo>(), "ITO"));
    }

    public void addPersons(){
        for (Person person: personList) {
            System.out.println(person);//Prints the person's toString()
        }
    }
}
