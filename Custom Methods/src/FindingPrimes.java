import java.util.Scanner;

public class FindingPrimes {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("We are going to find some primes!");
		System.out.println("What range would you like them in?");
		System.out.println("(only positive integers 2 or greater)");
		
		System.out.print("\nLow end: ");
		int l = keyboard.nextInt();
		System.out.print("High end: ");
		int h = keyboard.nextInt();
		
		for (int n=l; n<=h; n++){
			System.out.print(n+" ");
			if (prime(n))
				System.out.println("<");
			else
				System.out.println();
		}
		
		keyboard.close();
	}
	
	public static boolean prime(int x){
		boolean y = true;
		
		for (int i=2; i<x;i++){
			if (x%i==0)
				y = false;
		}
		
		return y;
	}
	

}
