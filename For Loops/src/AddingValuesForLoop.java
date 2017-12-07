import java.util.Scanner;

public class AddingValuesForLoop {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Number: ");
		int x = keyboard.nextInt();
		int s=0;
		
		for (int n=1; n <= x; n++){
			System.out.print(n+" ");
			s = s+n;
		}
		System.out.println("\nThe sum is "+s+".");
		keyboard.close();
	}

}