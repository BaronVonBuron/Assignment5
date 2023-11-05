import java.util.List;
import java.util.Scanner;

public class MainMenu extends Menu{


    PersonsManager personsManager = new PersonsManager();
    SmallTestClass test = new SmallTestClass(personsManager);



    public MainMenu(String header, String[] menuItems) {
        super(header, menuItems);
    }

    @Override
    public void run() {
        super.run();
    }


    @Override
    protected void clear() {
        super.clear();
    }

    @Override
    protected void doAction(int option) {
        switch (option){
            case 1:
                printPeople(this.personsManager.getAllTeachers());
                break;
            case 2:
                printPeople(this.personsManager.getAllStudents());
                break;
            case 3:
                printPeople(this.personsManager.getAllPersons());
                break;
            case 4:
                System.out.println("Please input the 3 digit ID number of the person you wish to remove: ");
                Scanner s = new Scanner(System.in);
                int choice = s.nextInt();
                this.personsManager.removePerson(choice);
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
        }
    }

    public void printPeople(List<Person> tempPersonList){
        for (Person p: tempPersonList) {
            System.out.println(p);
        }
    }

    //skal vise 3 options. 1,2,3. Når en option er valgt, skal den skrive "Option 1 chosen", og så vente til man trykker enter.
}
