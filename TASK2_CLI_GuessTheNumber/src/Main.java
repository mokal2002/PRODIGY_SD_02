import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main extends Thread {
    public static void main(String[] args) throws InterruptedException {

        int Guess = 29;
        int attempts = 0;

        //Guess the number
        try {
            System.out.println("Program Is Loading................");
            Thread.sleep(1000);
            System.out.println("Started Program");
        }catch (Exception e) {
            e.printStackTrace();
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("############################################");
        System.out.println("Welcome to the Guess The Number Game!");
        System.out.println("############################################");

        while (true) {
            System.out.println("Guess a number between 1 and 100:");
            int userGuess = scanner.nextInt();
            attempts++;
            if (userGuess == Guess) {
                System.out.println(Guess + " Congratulations! You guessed the correct number!");
                System.out.println("Number of attempts: "+ attempts);
                System.out.println("-----------------------------------");

                break;
            } else if (userGuess < Guess) {
                System.out.println("Your guess "+ userGuess +" is too low. Try again!");
                System.out.println("-----------------------------------");

            } else {
                System.out.println("Your guess "+ userGuess +" is too high. Try again!");
                System.out.println("-----------------------------------");

            }
        }


    }
}