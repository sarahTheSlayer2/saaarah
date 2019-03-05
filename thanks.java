import java.util.Scanner;
import java.util.Random;

public class thanks {

	public static int getRounds(Scanner sc) {
		int rounds = 0;
		while(rounds < 1) {
			System.out.print("Enter how many game will be played: ");
			try {
				rounds = sc.nextInt();
			} catch(Exception e) {
				System.out.println("Get better at typing.");
				rounds = 0;
				sc.nextLine();
			}
		}
		System.out.println("First person to " + rounds + " wins!");
		return rounds;
	}
	

	public static int getComputerInput(Random rn) {
		int c = rn.nextInt(3) + 1;
		switch(c) {
			case 1 :
			System.out.println("Computer picked Rock");
			return 1;
			case 2 : 
			System.out.println("Computer picked Paper");
			return 2;
			case 3 : 
			System.out.println("Computer picked Scissors");
			return 3;
			default :
			System.out.println("I did something wrong here...");
			return -1;
		}
	}

	public static int getUserInput(Scanner sc) {
		int userInput = 0;
		while(userInput < 1 || userInput > 3) {
			System.out.print("1: Rock\n2: Paper\n3: Scissors\nPlease enter your choice as a number: ");
			try {
				userInput = sc.nextInt();
			} catch(Exception e) {
				System.out.println("You suck at typing, do better.");
				userInput = 0;
				sc.nextLine();
			}
		}
		sc.nextLine();
		return userInput;
	}

	public static void main(String[] args) {
		int compWins = 0;
		int youWins = 0;
		int rounds = 0;
		System.out.println("Welcome to our game...");
		System.out.println("Between the two of us, we will make some type of game, what type of game would you like to create here?");
		System.out.println("Maybe a random rock paper scissors game? Yeah I'll do that quick hold on");
		System.out.println("If this doesn't work on the first try for me, it's up to you to finish the game.");
		System.out.println();
		System.out.println();

		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		rounds = getRounds(sc);

		while(youWins != rounds && compWins != rounds) {
		int userInput = getUserInput(sc);
		int compInput = 0;
		switch(userInput) {
			case 1 :
			System.out.println("You picked Rock");
			compInput = getComputerInput(rn);
			if (userInput == compInput) 
				System.out.println("You tied that round.");
			else if (compInput == 2) {
				System.out.println("You lost bud");
				++compWins;
			} 
			else {
				System.out.println("Wow, you da best. You won that round.");
				++youWins;
			}
			break;
			case 2 : 
			System.out.println("You picked Paper");
			compInput = getComputerInput(rn);
			if (userInput == compInput) 
				System.out.println("You tied that round.");
			else if (compInput == 3) {
				System.out.println("You lost bud");
				++compWins;
			} 
			else {
				System.out.println("Wow, you da best. You won that round.");
				++youWins;
			}
			break;
			case 3 : 
			System.out.println("You picked Scissors");
			compInput = getComputerInput(rn);
			if (userInput == compInput) 
				System.out.println("You tied that round.");
			else if (compInput == 1) {
				System.out.println("You lost bud");
				++compWins;
			} 
			else {
				System.out.println("Wow, you da best. You won that round.");
				++youWins;
			}
			break;
			default :
			System.out.println("I really did something wrong here...");
		}
		System.out.println();
		System.out.println();
		
	}
		if (youWins == rounds) 
			System.out.println("You are a winner!!!!!!!!!!!!!!!!!!!!!!!!!!!!! Good work :)");
		else 
			System.out.println("You really suck at Rock Paper Scissors, get better for next time\nYou lost");

		System.out.println("Alright well after thoughts on this are that I just wasted like 20 minutes making this and I'm not really sure if it works or not, so it's up to you to test everything and make sure it's 100%");
		System.out.println("If you have any additions or would like to make another game inside this go ahead. This is everything that I'm going to do...");
		System.out.println("But I can't wait for Culver's!!!!!!!!! I am going to enjoy that very much");
	}

}