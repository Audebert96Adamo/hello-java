package flow.control;

public class Hello {

	public static void main(String[] args) {
		char x = 'A';

		switch (x) {
		case 'a':
			System.out.println("The value of x is a");
			break;
		case 'b':
			System.out.println("The value of x is b");
			break;
		case 'c':
			System.out.println("The value of x is c");
			break;
		default:
			System.out.println("The value of x switch is other than a,b,c");
			break;
		}

		switch (x) {
		case 'a':
		case 'A':
			System.out.println("The value of x multi cases is a");
			break;
		case 'b':
		case 'B':
			System.out.println("The value of x multi cases is b");
			break;
		case 'c':
		case 'C':
			System.out.println("The value of x multi cases is c");
			break;
		default:
			System.out.println("The value of x multi cases is other than a,b,c");
			break;
		}

	}

}
