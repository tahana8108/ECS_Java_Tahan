import java.util.Random;
import java.util.Scanner;

public class NumbGuessCount {
	public static void main(String[] args){
		Random r = new Random();
		Scanner keyboard = new Scanner(System.in);
		int x = 1+r.nextInt(10);
		int g=0;
		int guess;
		
		System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
		
		
		do {
			System.out.print("Your guess: ");
			guess = keyboard.nextInt();
			g++; 
			if (guess!=x) {
				System.out.println("That is incorrect. Guess again.");
			}
		} while (guess!=x);
		
		System.out.println("That's right!. You're a good guesser.");
		System.out.println("It only took you " +g+" tries.");
		keyboard.close();
	}

}