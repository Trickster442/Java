package Week4;
import java.util.Scanner;
public class Guess_game {
    private int targetNumber;
    private int guessRemaining;
    private boolean gameOver;
    private boolean gameWon;
    public Guess_game() {
        targetNumber = (int) (Math.random() * 100) + 1;
        guessRemaining = 10;
        gameOver = false;
        gameWon = false;
    }
    public int getGuessRemaining() {
        return guessRemaining;
    }
    public boolean isGameOver() {
        return gameOver;
    }
    public boolean isGameWon() {
        return gameWon;
    }
    public void makeGuess(int guess) {
        if (!gameOver) {
            guessRemaining--;
            if (guess == targetNumber) {
                gameOver = true;
                gameWon = true;
                System.out.println("Congratulations! You guessed the number.");
            } else if (guessRemaining == 0) {
                gameOver = true;
                System.out.println("Game over! You've run out of guesses. The correct number was: " + targetNumber);
            } else if (guess < targetNumber) {
                System.out.println("Too low! Guesses remaining: " + guessRemaining);
            } else {
                System.out.println("Too high! Guesses remaining: " + guessRemaining);
            }
        } else {
            System.out.println("The game is already over.");
        }
    }
    public void printCorrectNumber() {
        if (gameOver) {
            System.out.println("The correct number was: " + targetNumber);
        } else {
            System.out.println("The game is not over yet.");
        }
    }
    public static void main(String[] args) {
        Guess_game game = new Guess_game();
        Scanner scanner = new Scanner(System.in);
        while (!game.isGameOver()) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            game.makeGuess(guess);
        }
        scanner.close();
        game.printCorrectNumber();
    }
}
