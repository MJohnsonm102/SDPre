import java.util.Scanner;

public class Objective4Lab1 {
  public static void main(String[] args) {

      Scanner keyboard = new Scanner(System.in);

        String fname = "";
        String lname = "";
        String favoriteAnimal = "";
        String favoriteFood = "";
        String favoriteSong = "";

        System.out.println("What is your first name?");
        fname = keyboard.nextLine();
        System.out.println("What is your last name?");
        lname = keyboard.nextLine();
        System.out.println("What is your favorite animal?");
        favoriteAnimal = keyboard.nextLine();
        System.out.println("What is your favorite food?");
        favoriteFood = keyboard.nextLine();
        System.out.println("What is your favorite song?");
        favoriteSong = keyboard.nextLine();

        System.out.printf("My name is name %s %s. %n", fname, lname);
        System.out.printf("My favorite animal is the %s. %n", favoriteAnimal);
        System.out.printf("My favorite food is %s. %n", favoriteFood);
        System.out.printf("My favorite song is %s. %n", favoriteSong);





    /*
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    System.out.println("What is your first name?");
    String userInput = keyboard.nextLine();
    //close scanner
    scanner.close();


    //Get user last name
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    System.out.println("What is your last name?");
    int lname = scanner.nextInt(); 
    System.out.println("What is your last name?");
    String userInput = keyboard.nextLine();
    System.out.println("What is your favorite animal?");*/




    //java.util.Scanner scanner = new java.util.Scanner(system.in);

    //TODO prompt the user to get input for all of the String variables.

    //TODO print the output formatted to look like the expected output using String concatenation.

  }
}