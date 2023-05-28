package flow.control;

public class Hello {

	public static void main(String[] args) {
		//System.out.println(1);
		//System.out.println(2);
		//System.out.println(3);
		//System.out.println(4);
		//System.out.println(5);
		//System.out.println(6);
		//System.out.println(7);
		//System.out.println(8);
		//System.out.println(9);
		//System.out.println(10);
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("for loop + : "+i);
		}

		for (int i = 10; i >= 1; i--) {
			System.out.println("for loop - : "+i);
		}
		
		int i = 10;
		for (;i >= 1; i--) {
			System.out.println(i);
		}
		
		int isPrime = 25;
		for (int x = 2; x <= isPrime; x++) {
			System.out.println("x = "+x);
		}
	}

}
