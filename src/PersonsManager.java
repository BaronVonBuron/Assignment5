import java.util.ArrayList;
import java.util.List;

public class PersonsManager {
    public PersonsManager() {

    }

    private List<Person> persons = new ArrayList<>();

    public Person getPerson(int id){//Not yet used.
        for (Person p: persons) {
            if (p.getId()==id){
                return p;
            }
        }
        return persons.getFirst();
    }

    public void addPerson(Person p){//Used to add new objects to this objects's persons list.
        persons.add(p);
    }

    public void removePerson(int id){//Removes a person with a given ID from this.persons list.
        for (Person p: persons) {
            if (p.getId() == id){//Needs input control. Can crash the program as it is now.
                persons.remove(p);
                System.out.println("Person with id: "+id+" has been removed.");
                break;
            }
        }
    }

    public List<Person> getAllPersons(){//Returns a list of the persons added to this.persons.
        return persons;
    }

    public List<Person> getAllStudents(){//Returns a list of all students currently in this.persons list.
        List<Person> tempList = new ArrayList<>();
        for (Person p: persons) {
            if(p.getClass() == Student.class){
                tempList.add(p);
            }
        }
        return tempList;
    }

    public List<Person> getAllTeachers(){//Returns a list of all teachers currently in this.persons list.
        List<Person> tempList = new ArrayList<>();
        for (Person p: persons) {
            if(p.getClass() == Teacher.class){
                tempList.add(p);
            }
        }
        return tempList;
    }

    public void operation(){//Not in use yet.

    }
}