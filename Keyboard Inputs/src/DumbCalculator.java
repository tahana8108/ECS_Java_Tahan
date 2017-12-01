import java.util.Scanner;

public class DumbCalculator {
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		double f, s, t, a;
		
		System.out.println("Let's find the average of a few numbers...");
		System.out.println();
		System.out.print("What is the first number? ");
		f = keyboard.nextDouble();
		System.out.print("What is the second number? ");
		s = keyboard.nextDouble();
		System.out.print("What is the third number? ");
		t = keyboard.nextDouble();
		System.out.println();
		
		a = (f+s+t)/3;
		System.out.println("The average of the three numbers is " +a);
	}

}
