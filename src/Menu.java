import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public abstract class Menu {
    private String header;
    private String[] menuItems;


    protected abstract void doAction(int option);



    public Menu(String header, String[] menuItems) {
        this.header = header;
        this.menuItems = menuItems;
    }


    public void run() {
        boolean done = false;
        while (!done) {
            showMenu();
            int option = getOption();
            pause(option);
            doAction(option);
            if (option == 0) {//Option 0 = exit
                done = true;
                System.out.println("Goodbye!");
            }
        }
    }


    public int getOption() {
        Scanner scanner = new Scanner(System.in);
        boolean gettingOption = true;
        while(gettingOption){
            String temp = scanner.next();
            if (temp.length() != 1){
                System.out.println("Unrecognized input, try again!");
                continue;
            }
            try {
                return Integer.parseInt(temp);

            } catch (Exception e) {
                System.out.println("Unrecognized input, try again!");

            }
        }

        return 0;
    }



    private void showMenu() {
        for (String option : menuItems) {
            if (option != null) {
                System.out.println(option);
            }
        }
    }



    protected void pause(int option) {
        System.out.print("Option: "+option+" Selected. Press enter to continue.");
        boolean pause = true;
        try {
            while (pause){
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                int nextChar = br.read();
                if (nextChar == '\n' || nextChar == '\r') {
                    pause = false;
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
    }

}



    protected void clear() {
    }
}
