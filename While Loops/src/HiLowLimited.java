import java.util.Random;
import java.util.Scanner;

public class HiLowLimited {
	public static void main(String[] args){
		Random r = new Random();
		Scanner keyboard = new Scanner(System.in);
		int x, res;
		x = 1+r.nextInt(100);
		int g = 1;
		
		System.out.println("I'm thinking of a number between 1-100. You have 7 guesses.");
		System.out.print("First guess: ");
		res = keyboard.nextInt();
		
		
		if (res>x){
			System.out.println("Sorry, you are too high.");
			g++;
		}
		else if (res<x){
			System.out.println("Sorry, you are too low.");
			g++;
		}
		else{
			System.out.println("You guessed it! What are the odds?!?.");
			g=10;
		}
		
		while (g!=8 && g!=10){
			System.out.print("Guess # "+g+":");
			res = keyboard.nextInt();
			
			if (res>x){
				System.out.println("Sorry, you are too high.");
				g++;
			}
			else if (res<x){
				System.out.println("Sorry, you are too low.");
				g++;
			}
			else{
				System.out.println("You guessed it! What are the odds?!?.");
				g=10;
			}
		}
		if (g==8){
			System.out.println("Sorry, you didn't guess it in 7 tries. You lose.");
		}
		keyboard.close();
		
	}

}