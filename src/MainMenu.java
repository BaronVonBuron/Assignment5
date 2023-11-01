public class MainMenu extends Menu{

    //private String[] menuItems;
    //private String header;



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
                System.out.println("det virkede fandme!");
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
        }
    }

    //skal vise 3 options. 1,2,3. Når en option er valgt, skal den skrive "Option 1 chosen", og så vente til man trykker enter.
}
