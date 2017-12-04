import java.util.Scanner;

public class ALittleQuiz {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		int correct, q1, q2, q3;
		correct = 0;
		
		System.out.println("Q1) What is the capital of Alaska?");
		System.out.println("	1) Melbourne");
		System.out.println("	2) Anchorage");
		System.out.println("	3) Juneau");
		System.out.println("");
		System.out.print("> ");
		q1 = keyboard.nextInt();
		
		if (q1==3){
			System.out.println("");
			System.out.println("That's right!");
			correct = correct + 1;
			System.out.println("");
		}
		else {
			System.out.println("");
			System.out.println("Sorry, the correct answer is Juneau.");
			System.out.println("");
		}
		
		
		System.out.println("Q2) Can you store the value \"cat\" in a variable of type int?");
		System.out.println("	1) Yes");
		System.out.println("	2) No");
		System.out.println("");
		System.out.print("> ");
		q2 = keyboard.nextInt();
		
		if (q2==2){
			System.out.println("");
			System.out.println("Correct!");
			correct = correct + 1;
			System.out.println("");
		}
		else {
			System.out.println("");
			System.out.println("Sorry, \"cat\" is a string. ints can only store numbers.");
			System.out.println("");
		}
		
		
		System.out.println("Q3) What is the result of 9+6/3?");
		System.out.println("	1) 5");
		System.out.println("	2) 11");
		System.out.println("	3) 15/3");
		System.out.println("");
		System.out.print("> ");
		q3 = keyboard.nextInt();
		
		if (q3==2){
			System.out.println("");
			System.out.println("That's correct!");
			correct = correct + 1;
			System.out.println("");
		}
		else {
			System.out.println("");
			System.out.println("Sorry, the correct answer is 11.");
			System.out.println("");
		}
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("Overall, you got " +correct+ " out of 3 correct.");
		System.out.println("Thanks for playing!");
		
	}

}
