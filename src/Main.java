
public class Main {

    public static void main(String[] args) {
        // Following code is used to test. Remove the comments to try it out.
        //SmallTestClass test = new SmallTestClass();
        //test.addPersons();


        String startMenuHeader = "Main Menu";//This and the following lines is to initiate the main menu constructor.
        String[] menuOptions = new String[10];
        menuOptions[0] = "Exit";
        menuOptions[1] = "Option 1";
        menuOptions[2] = "Option 2";
        menuOptions[3] = "Option 3";
        menuOptions[4] = "Option 4";
        menuOptions[5] = "Option 5";
        menuOptions[6] = "Option 6";
        menuOptions[7] = "Option 7";
        menuOptions[8] = "Option 8";
        menuOptions[9] = "Option 9";


        PersonsManager personsManager = new PersonsManager();
        MainMenu mainMenu = new MainMenu(startMenuHeader, menuOptions);
        mainMenu.run();

    }

}
