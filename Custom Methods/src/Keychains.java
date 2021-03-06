import java.util.Scanner;

public class Keychains {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Ye Olde Keychain Shoppe\n");
		int choice = 0;
		int keys = 0;
		
		do {
			System.out.println("1. Add keychains to order");
			System.out.println("2. Remove keychains to order");
			System.out.println("3. View current order");
			System.out.println("4. Checkout");
			
			System.out.print("\nPlease enter your choice: ");
			choice = keyboard.nextInt();
			System.out.println();
			if (choice == 1){
				keys = add(keys);
				System.out.println();
			}
			else if (choice==2){
				keys = remv(keys);
				System.out.println();
			}
			else if (choice==3){
				view(keys);
				System.out.println();
			}
			
		} while (choice!=4);
		
		System.out.println("CHECKOUT\n");
		
		System.out.print("What is your name? ");
		String n = keyboard.next();
		System.out.println("You have "+keys+" keychains.");
		System.out.println("Keychains cost $10 each.");
		System.out.println("Total cost is $"+(keys*10)+".");
		System.out.println("Thanks for your order, "+n+"!");
		
		keyboard.close();
	}
	
	public static int add(int a){
		Scanner keyboard = new Scanner(System.in);
		System.out.print("You have "+a+" keychains. How many to add? ");
		int b = keyboard.nextInt();
		int c = a+b;
		System.out.println("You now have " +c+" keychains.");
		
		return c;
	}
	public static int remv(int a){
		Scanner keyboard = new Scanner(System.in);
		System.out.print("You have "+a+" keychains. How many to remove? ");
		int b = keyboard.nextInt();
		int c = a-b;
		System.out.println("You now have " +c+" keychains.");
		
		return c;
	}
	public static void view(int a){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("You now have "+a+" keychains.");
		System.out.println("Keychains cost $10 each.");
		System.out.println("Total cost is $"+(a*10)+".");
	}

}
