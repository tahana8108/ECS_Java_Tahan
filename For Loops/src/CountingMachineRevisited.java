import java.util.Scanner;

public class CountingMachineRevisited {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Count from:\t");
		int a = keyboard.nextInt();
		System.out.print("Count to:\t");
		int b = keyboard.nextInt();
		System.out.print("Count by:\t");
		int c = keyboard.nextInt();
		
		for (int n=a; n <= b; n=n+c){
			System.out.print(n+" ");
		}
		
		keyboard.close();
	}

}