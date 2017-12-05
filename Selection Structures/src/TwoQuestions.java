import java.util.Scanner;

public class TwoQuestions {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		String q1, q2;
		
		System.out.println("TWO QUESTIONS!");
		System.out.println("Think of an object, and I'll try and guess what it is!");
		System.out.println("");
		System.out.println("Question 1) Is it an animal, vegetable, or mineral?");
		q1 = keyboard.next();
		
		System.out.println("Question 2) Is it bigger than a breadbox?");
		q2 = keyboard.next();
		
		if (q1.equals("animal")&& q2.equals("no")){
			System.out.println();
			System.out.println("Is it a SQUIRREL?!");
		}
		else if (q1.equals("animal")&& q2.equals("yes")){
			System.out.println();
			System.out.println("Is it a MOOSE?!");
		}
		else if (q1.equals("vegetable")&& q2.equals("no")){
			System.out.println();
			System.out.println("Is it a CARROT?!");
		}
		else if (q1.equals("vegetable")&& q2.equals("yes")){
			System.out.println();
			System.out.println("Is it a WATERMELON?!");
		}
		else if (q1.equals("mineral")&& q2.equals("yes")){
			System.out.println();
			System.out.println("Is it a CAMARO?!");
		}
		else {
			System.out.println();
			System.out.println("Is it a PAPER CLIP?!");
		}
		keyboard.close();
	}

}
