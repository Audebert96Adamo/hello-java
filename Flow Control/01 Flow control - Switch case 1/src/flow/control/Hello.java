package flow.control;

public class Hello {

	public static void main(String[] args) {
		int x = 2;

		if (x == 1) {
			System.out.println("The value of x is 1");
		} else if (x == 2) {
			System.out.println("The value of x is 2");
		} else if (x == 3) {
			System.out.println("The value of x is 3");
		} else {
			System.out.println("The value of x is other than 1,2,3");
		}

		switch (x) {
		case 1:
			System.out.println("The value of x switch without break is 1");
		case 2:
			System.out.println("The value of x switch without break is 2");
		case 3:
			System.out.println("The value of x switch without break is 3");
		default:
			System.out.println("The value of x switch without break is other than 1,2,3");
		}

		switch (x) {
		case 1:
			System.out.println("The value of x switch with break is 1");
			break;
		case 2:
			System.out.println("The value of x switch with break is 2");
			break;
		case 3:
			System.out.println("The value of x switch with break is 3");
			break;
		default:
			System.out.println("The value of x switch with break is other than 1,2,3");
			break;
		}
	}

}
