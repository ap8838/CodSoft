import java.util.Random;
import java.util.Scanner;

public class Numbergame {

    public static void main(String[] args) {
        comparator();
    }
public  static void comparator () {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    int x = random.nextInt(100) + 1;
    int numberOfGuesses = 0;
    boolean playerchoice ;
    boolean guessedCorrectly = false;
    while (numberOfGuesses < 5) {
        System.out.print(" Enter your guess: ");
        int guess = scanner.nextInt();
        numberOfGuesses++;

        if (guess == x) {

            System.out.println("Congratulations! You guessed the number: " + x + "Would you like to play Another round Please answer True if Yes and False if no ");
            guessedCorrectly = true;
            playerchoice = scanner.nextBoolean();
            if (playerchoice){
                comparator();
            }
            else break;
        } else if (guess < x) {
            System.out.println("The guess is less than expected. Try again.");
        } else {
            System.out.println("The guess is higher than expected. Try again.");
        }
    }
    if (!guessedCorrectly) {
        System.out.println("Sorry, you've used all your attempts. The correct number was " + x + " Would you like to play Another Round  Please answer True if Yes and False if no " );
        playerchoice = scanner.nextBoolean();
        if (playerchoice ){
            comparator();
        }
    }
    }
}



