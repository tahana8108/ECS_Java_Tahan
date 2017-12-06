import java.util.Random;

public class ShorterDoubleDice {
	public static void main(String[] args){
		Random r = new Random();
		int r1, r2, t;
		
		System.out.println("HERE COMES THE DICE!");
		
		
		do{
			r1 = 1+r.nextInt(6);
			r2 = 1+r.nextInt(6);
			t = r1+r2;
			
			System.out.println("\nRoll #1: "+r1);
			System.out.println("Roll #2: "+r2);
			System.out.println("The total is "+t+"!");
		}while (r1!=r2);
	}

}
