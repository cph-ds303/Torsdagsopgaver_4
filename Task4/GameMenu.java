import java.util.ArrayList;

// Create an entity class called GameMenu
public class GameMenu {

    // 4.b Add a private instance variable actions with the type ArrayList<String> to the class.
    private ArrayList<String> actions;

    // 4.c 4.d Add a constructor with a parameter of the type ArrayList to the constructor. This is so that objects of the GameMenu class can be instantiated with a list of actions
    public GameMenu(ArrayList<String> actions) {
        this.actions = actions;
    }
    
    // 4.h In the GameMenu class add a method displayMenu() that prints out the elements of the actions attribute.
    public void displayMenu() {
        for(String action : actions) {
            System.out.println(action);
        }
    }
}
