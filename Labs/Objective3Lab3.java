import java.util.Random;

public class Objective3Lab3{
    public static void main(String[] args) {
        // Create a Random object to generate random numbers
        Random random = new Random();

        // Roll three six-sided dice and sum the results
        int dice1 = random.nextInt(6) + 1;  // Generates a random number between 1 and 6
        int dice2 = random.nextInt(6) + 1;
        int dice3 = random.nextInt(6) + 1;

        int sum = dice1 + dice2 + dice3;

        // Display the results
        System.out.println("Result of rolling three six-sided dice:");
        System.out.println("Dice 1: " + dice1);
        System.out.println("Dice 2: " + dice2);
        System.out.println("Dice 3: " + dice3);
        System.out.println("Sum: " + sum);
    }
}
