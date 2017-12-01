import java.util.Scanner;

public class NameAgeSalary {
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		String name;
		int age;
		double salary;
		
		System.out.print("Hello. What is your name? ");
		name = keyboard.next();
		
		System.out.print("Hi, " +name+ "! How old are you? ");
		age = keyboard.nextInt();
		
		System.out.println("So you are " +(age)+ "? I guess that's not too old, " +name+ ".");
		System.out.println("How much do you make per hour?");
		salary = keyboard.nextDouble();
		
		System.out.println("Wow, " +salary+ " is a lot for your age!");
		
		keyboard.close();
	}

}
