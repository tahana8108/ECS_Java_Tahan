import java.util.Scanner;

public class MethodPass {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
	
		System.out.print("Pick a number: ");
		int n = keyboard.nextInt();
		boolean check = pass(n);
		
		if(check)
			System.out.println("\nI like that number!");
		else
			System.out.println("\nThat number is gross...");
	}
	public static boolean pass(int a){
		boolean n;
		if (a%3 == 0)
			n = true;
		else
			n = false;
		
		return n;
		
	}

}
