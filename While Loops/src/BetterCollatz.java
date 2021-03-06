import java.util.Random;
import java.util.Scanner;

public class BetterCollatz {
	public static void main(String[] args){
		Random r = new Random();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Let's create a COLLATZ SEQUENCE!");
		System.out.println("\nRules:");
		System.out.println("If the number is even, divide it by two.");
		System.out.println("If the number is odd, multiply by 3 and add 1.");
		System.out.println("Repeat this decision until you reach 1.");
		System.out.print("\nStarting Number: ");
		int x = keyboard.nextInt();
		System.out.print("[ "+x+" - ");
		int n=0;
		int l=0;
		
		do {
			n++;
			if (x%2 == 0)
				x = x/2;
			else
				x = 3*x +1;
			System.out.print(x+" - ");
			if (x>l)
				l=x;
		} while (x!=1);
		
		System.out.println("]");
		System.out.println("\nTerminated after "+n+ " steps.");
		System.out.println("The largest value was "+l+".");
		keyboard.close();
	}

}
