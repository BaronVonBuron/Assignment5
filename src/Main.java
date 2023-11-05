
public class Main {

    public static void main(String[] args) {

        String startMenuHeader = "Main Menu";//This and the following lines is to initiate the main menu constructor.
        String[] menuOptions = new String[10];
        menuOptions[0] = "Press 0 to Exit";
        menuOptions[1] = "Press 1 to print list of Teachers";
        menuOptions[2] = "Press 2 to print list of Students";
        menuOptions[3] = "Press 3 to print a list of all Persons";
        menuOptions[4] = "Press 4 to remove a Person: ";
        //menuOptions[5] = "Option 5";
        //menuOptions[6] = "Option 6";
        //menuOptions[7] = "Option 7";
        //menuOptions[8] = "Option 8";
        //menuOptions[9] = "Option 9";

        MainMenu mainMenu = new MainMenu(startMenuHeader, menuOptions);
        mainMenu.run();


    }

}
