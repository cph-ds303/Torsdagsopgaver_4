import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // 4.f  In the main method create an ArrayList<String> called actions. Don't forget to import the ArrayList class. Add the following String values to the actions list:
        ArrayList<String> actions = new ArrayList<>();

        actions.add("1) Start game");
        actions.add("2) Resume game");
        actions.add("3) Pause game");
        actions.add("4) End game");
        
        // 4.g Still in the main method, instantiate theGameMenu class with the actions list as an argument to the constructor.
        GameMenu menu = new GameMenu(actions);
        
        // 4.i From the main method in Main test the displayMenu() method by calling it on the GameMenu instance created in step 4.g.
        menu.displayMenu();
    }
}
