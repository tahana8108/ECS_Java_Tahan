import java.util.Scanner;

public class HowOldSpecifically {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		int age;
		String name;
		
		System.out.print("Hey, what's your name? ");
		name = keyboard.next();
		
		System.out.print("Ok " +name+ ", how old are you? ");
		age = keyboard.nextInt();
		
		if (age<16){
			System.out.print("You cannot drive.");
		}
		else if (age<18){
			System.out.print("You can drive but not vote.");
		}
		else if (age<25){
			System.out.print("You can vote but not rent a car.");
		}
		else {
			System.out.print("You can pretty much do whatever you want.");
		}
		keyboard.close();
	}

}
