import java.util.Scanner;

/**
 *This program greets the user and calculates their aproximate age
 * @author Jackson
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //create a scanner for user input
    Scanner input = new Scanner(System.in);

    // declare a variable to store a name
    String userName;

    //ask the user for their name
    System.out.println("Please enter your name:");
    //initialize the user's name
    userName = input.nextLine();

    //say hello to the user
    System.out.println("Hello " + userName + "!");

    //ask the user for their year of birth
    System.out.println("Please enter the year you were born:");
    //declare and initialize variable for birth year
    int birthYear = input.nextInt()@author;

    //declare and initialize constant for current year
    final int CURRENT_YEAR = 2020;

    //declare and calculate the users age
    int age = CURRENT_YEAR - birthYear;

    //tell the user their age
    System.out.println("You are " + age + " years old.");
  

  }
}
