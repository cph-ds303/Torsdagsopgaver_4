import java.util.Scanner;

    // 2.a Create a Main class with a main method
public class Main {
    public static void main(String[] args) {

        // 2.b In the main method start by printing this message to the user: "Please type your name".
        System.out.println("Please type your name");
        
        // 2.c Create a Scanner object for reading from the command line (remember to import the Scanner class from the util library: import java.util.Scanner; )
        Scanner scanner = new Scanner(System.in);
        
        // 2.d Declare a String variable name and assign to it whatever is returned from a call to scanner's nextLine() method.
        String name = scanner.nextLine();
        
        // 2.e Declare a String variable name and assign to it whatever is returned from a call to scanner's nextLine() method.
        System.out.println("Hello " + name + ". Please type your age");
        
        // 2.f Declare another variable of type int called age and assign to it the value returned by the nextInt() method of the Scanner object (reuse the Scanner object created in 2.c).
        int age = scanner.nextInt();
        
        // 2.g  Print the value the user writes (the age variable) i.e. like this: "You are <age> years old".
        System.out.println("You are " + age + " years old");
        
        // 2.h Declare a third variable of type int. To this variable, assign the calculated number of years until the user can retire. You may assume retirement starts at age 67. Print the result (i.e. like this: "You have <x> years until retirement").
        int yearsUntilRetirement = 67 - age;
        System.out.println("You have " + yearsUntilRetirement + " years until retirement");
        
        
    }
}
