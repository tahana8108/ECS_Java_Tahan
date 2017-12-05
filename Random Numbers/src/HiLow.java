import java.util.Random;
import java.util.Scanner;

public class HiLow {
	public static void main(String[] args){
		Random r = new Random();
		Scanner keyboard = new Scanner(System.in);
		int x, res;
		x = 1+r.nextInt(100);
		
		System.out.println("I'm thinking of a number between 1-100. Try to guess it.");
		System.out.print(">");
		res = keyboard.nextInt();
		
		System.out.println();
		
		if (res>x){
			System.out.println("Sorry, you are too high. I was thinking of " +x+ ".");
		}
		else if (res<x){
			System.out.println("Sorry, you are too low. I was thinking of " +x+ ".");
		}
		else{
			System.out.println("You guessed it! What are the odds?!?.");
		}
		keyboard.close();
		
	}

}
