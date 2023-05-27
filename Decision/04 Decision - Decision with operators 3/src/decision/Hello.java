package decision;

public class Hello {

	public static void main(String[] args) {
		boolean x = true;
		boolean y = false;

		if (true && x) {
			System.out.println("if both Condition is True");
		} else {
			System.out.println("One of two Condition is False");
		}

		if (x && y) {
			System.out.println("Both Condition is True");
		} else {
			System.out.println("else One of two Condition is False");
		}

		if (x || y) {
			System.out.println("if One of two Conditions is True");
		} else {
			System.out.println("Both Condition is False");
		}

		if (false || y) {
			System.out.println("One of two Condition is True");
		} else {
			System.out.println("else Both Conditions is False");
		}

		int ageOfBoy = 17;
		int ageOfGirl = 20;

		if ((ageOfBoy >= 21) && (ageOfGirl >= 18)) {
			System.out.println("ready to get married !");
		} else {
			System.out.println("Wait for it kiddo !!");
		}
	}

}
