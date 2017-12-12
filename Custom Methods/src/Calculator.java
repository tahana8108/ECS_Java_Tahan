import java.util.Scanner;

public class Calculator {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("This is a calculator!");
		System.out.println("Insert your calculation as \"### operator ###\"");
		double solution = 0.0;
		
		while (1+1==2){
		
		System.out.print(">");
		double num1 = keyboard.nextDouble();
		String opp = keyboard.next();
		double num2 = keyboard.nextDouble();

		
		
		if (opp.equals("+")){
			solution = add(num1, num2);
		}
		else if (opp.equals("-")){
			solution = sub(num1, num2);
		}
		else if (opp.equals("*")){
			solution = mul(num1, num2);
		}
		else if (opp.equals("/")){
			solution = div(num1, num2);
		}
		else if (opp.equals("^")){
			solution = pow(num1, num2);
		}
		
		System.out.println(solution);
		System.out.println();
		}
	
		
	}
	
	public static double add(double a, double b){
		double t = a+b;
		
		return t;
	}
	public static double sub(double a, double b){
		double t = a-b;
		
		return t;
	}
	public static double mul(double a, double b){
		double t = a*b;
		
		return t;
	}
	public static double div(double a, double b){
		double t = a/b;
		
		return t;
	}
	public static double pow(double a, double b){
		double t = 1;
		for (int i=1; i<=b; i++){
			t = t*a;
		}
		
		return t;
	}

}
