package tehtävä08;

import java.util.Random;
import java.util.Scanner;

// ConcreateClass
public class GuessTheNumberGame extends Game {

	private int randNumber = 0;
	private boolean win = false;
	private int winner = 0;

	@Override
	void initializeGame() {
		System.out.println("Welcome to a simple Guess The Number game!");
		System.out.println("The rules are simple... First player to quess the correct number wins!");
		System.out.println("Number of players: " + playersCount + "\n");
	}

	@Override
	void makePlay(int player) {
		Random rand = new Random();
		Scanner scanner = new Scanner(System.in);
		
		randNumber = rand.nextInt(6);
		System.out.println("Player " + player + " turn");
		System.out.print("Guess a number between 0-5: ");
		int input = scanner.nextInt();

		if (input == randNumber) {
			winner = player;
			win = true;
		} else {
			System.out.println("\n--Argh, " + input + " wasn't a correct answer.\n");
		}
	}

	@Override
	boolean endOfGame() {
		if (win) {
			System.err.println("\n--We have a winner!\n");
			return true;
		} else {
			return false;
		}
	}

	@Override
	void printWinner() {
		System.out.println("Winner is player number " + winner + "! Congratulations!");
		System.out.println("The right answer was: " + randNumber);
	}
}