import java.util.ArrayList;
import java.util.List;

public class PersonsManager {
    public PersonsManager() {

    }

    private List<Person> persons = new ArrayList<>();

    public Person getPerson(int id){
        for (Person p: persons) {
            if (p.getId()==id){
                return p;
            }
        }
        return persons.getFirst();//Skal rettes.
    }

    public void addPerson(Person p){
        persons.add(p);
    }

    public void removePerson(int id){
        for (Person p: persons) {
            if (p.getId()==id){
                persons.remove(p);
                System.out.println("Person has been removed.");
            }
        }
    }

    public List<Person> getAllPersons(){
        return persons;
    }

    public List<Person> getAllStudents(){
        List<Person> tempList = new ArrayList<>();
        for (Person p: persons) {
            if(p.getClass().isAssignableFrom(Student.class)){
                tempList.add(p);
            }
        }
        return tempList;
    }

    public List<Person> getAllTeachers(){
        List<Person> tempList = new ArrayList<>();
        for (Person p: persons) {
            if(p.getClass().isAssignableFrom(Teacher.class)){
                tempList.add(p);
            }
        }
        return tempList;
    }

    public void operation(){

    }
}