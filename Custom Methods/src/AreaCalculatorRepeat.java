import java.util.Scanner;

public class AreaCalculatorRepeat {
	
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		
		int res;
		System.out.println("Shape Area Calculator (c) 2017 Alex Tahan ECS");
		do {
			System.out.println("\n.............................................");
		
			System.out.println("\n1) Triangle");
			System.out.println("2) Rectangle");
			System.out.println("3) Square");
			System.out.println("4) Circle");
			System.out.println("5) Quit");
			System.out.print("Which Shape: ");
			res = keyboard.nextInt();
			System.out.print("\n");
			
			if (res == 1){
				double area = triangle();
				System.out.println("The area is "+area);
			}
			else if (res == 2){
				double area = rectangle();
				System.out.println("The area is "+area);
			}
			else if (res == 3){
				double area = square();
				System.out.println("The area is "+area);
			}
			else if (res == 4){
				double area = circle();
				System.out.println("The area is "+area);
			}
		} while (res != 5);
		
		System.out.println("\nGoodbye!!!");
		keyboard.close();
		
	}
	public static double triangle(){
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Base: ");
		int b = keyboard.nextInt();
		System.out.print("Height: ");
		int h = keyboard.nextInt();
		
		double a = 0.5*b*h;
		return a;
	}
	public static double rectangle(){
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Length: ");
		int l = keyboard.nextInt();
		System.out.print("Width: ");
		int w = keyboard.nextInt();
		
		double a = l*w;
		return a;
	}
	public static double square(){
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Side: ");
		int s = keyboard.nextInt();
		
		double a = s*s;
		return a;
		
		
	}
	public static double circle(){
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Radius: ");
		int r = keyboard.nextInt();
		
		double a = Math.PI*r*r;
		return a;
		
	}

}
