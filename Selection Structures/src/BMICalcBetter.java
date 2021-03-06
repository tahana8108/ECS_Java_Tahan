import java.util.Scanner;

public class BMICalcBetter {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		double feet, inch, lbs, bmi;
		
		System.out.println("BMI (Body Mass Index) is a way of representing your size.");
		System.out.println();
		System.out.print("How many feet tall are you? ");
		feet = keyboard.nextDouble();
		System.out.print("How many inches? ");
		inch = keyboard.nextDouble();
		System.out.print("How many pounds do you weigh? ");
		lbs = keyboard.nextDouble();
		
		inch = inch/12;
		feet = inch+feet;
		feet = feet*0.3048;
		lbs = lbs*0.4536;
		bmi = (lbs/(feet*feet));
		
		System.out.println();
		System.out.println("Your BMI is: " +bmi);
		
		if (bmi<18.5){
			System.out.println("You are underweight.");
		}
		else if (bmi<24.9){
			System.out.println("You are normal.");
		}
		else if (bmi<29.9){
			System.out.println("You are overweight.");
		}
		else {
			System.out.println("You are obese.");
		}
		
		
	}

}
