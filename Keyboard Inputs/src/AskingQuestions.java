import java.util.Scanner;

public class AskingQuestions 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		String name;
		int age, feet, inches;
		double weight;
		
		System.out.print("What is your name? ");
		name = keyboard.next();
		
		System.out.print("How old are you? ");
		age = keyboard.nextInt();
		
		System.out.print("How many feet tall are you? ");
		feet = keyboard.nextInt();
		
		System.out.print("How many inches? ");
		inches = keyboard.nextInt();
		
		System.out.print("How much do you weigh? ");
		weight = keyboard.nextDouble();
		
		System.out.print("So you're name is " +name+", you are " +age+ " years old, you're " +feet+ "'" +inches+ " , and you weigh " +weight+ " pounds.");
		
		keyboard.close();
	}

}
