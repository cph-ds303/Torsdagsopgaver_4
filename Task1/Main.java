    // 1.a Create a class Main with a main method
public class Main {
    public static void main(String[] args) {

        // 1.g In the main method in the Main class, create an instance of the Team class (i.e. instantiate the Team class).
        Team team1 = new Team("codingIsPoetry");

        // 1.i From the main method, call the method setRank() on the instance of Team you created in step 1.g with a number of your choice.
        team1.setRank(1);
        team1.addPlayer("Dino");
        team1.addPlayer("Morten");
        team1.addPlayer("Carl");
        team1.addPlayer("Oliver");
        
        // 1.k: Create 5 more Team instances and print them.
        Team team2 = new Team("Team Ostehaps");
        team2.setRank(2);
        team2.addPlayer("Jørgen");
        team2.addPlayer("Mikkel");
        team2.addPlayer("Kefir");
        team2.addPlayer("Bo");


        Team team3 = new Team("Team Mælkesnitte");
        team3.setRank(3);
        team3.addPlayer("Mælk");
        team3.addPlayer("Snitte");

        Team team4 = new Team("Team Citronmåne");
        team4.setRank(4);
        team4.addPlayer("Anders");
        team4.addPlayer("Frk. Olsen");
        team4.addPlayer("Store Jan");

        Team team5 = new Team("Team Agurkesalat");
        team5.setRank(5);
        team5.addPlayer("Anders den anden");
        team5.addPlayer("Jeff");
        team5.addPlayer("Jason");
        team5.addPlayer("Gregory");

        Team team6 = new Team("Team KanDetBliveMegetVærre?");
        team6.setRank(6);
        team6.addPlayer("Tonald Drump");
        team6.addPlayer("Robert Spydkaster");
        team6.addPlayer("Jens Jensen");

        System.out.println(team1);
        System.out.println(team2);
        System.out.println(team3);
        System.out.println(team4);
        System.out.println(team5);
        System.out.println(team6);
    }s
}
