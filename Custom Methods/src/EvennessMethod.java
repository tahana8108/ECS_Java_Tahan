
public class EvennessMethod {
	public static void main(String[] args){
		boolean a, b;
		
		for (int n=1; n<=100; n++){
			System.out.print(n+" ");
			a = isEven(n);
			b = isDivBy3(n);
			if (a)
				System.out.print("<");
			if (b)
				System.out.print("=");
			
			System.out.println("");
		}
	}
	
	public static boolean isEven(int x){
		boolean y;
		
		if (x%2 == 0)
			y = true;
		else
			y = false;
		
		return y;
	}
	
	public static boolean isDivBy3(int x){
		boolean y;
		
		if (x%3 == 0)
			y = true;
		else
			y = false;
		
		return y;
	}

}
