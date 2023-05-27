package decision;

public class Hello {

	public static void main(String[] args) {
		boolean x = !true;	
		System.out.println(x);
		
		boolean x2, x3;
		x2 = (5>4)? true:false;
		System.out.println("5 is greater than 4 : "+x2);
		x3 = (3>4)? true:false;
		System.out.println("3 is greater than 4 : "+x3);
		
		int x4, x5;
		x4 = (10 == 9) ? 1 : 0;
		System.out.println("10 = 9 ? if true 1 else 0 : "+ x4);
		x5 = (10 == 10) ? 1 : 0;
		System.out.println("10 = 10 ? if true 1 else 0 : "+ x5);
		
		int x6 = 9;
		x6 = !(10 == x6) ? 1 : 0;
		System.out.println("10 not = 9 ? if true 1 else 0 : "+ x6);
	}

}
