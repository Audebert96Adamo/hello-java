package flow.control;

public class Hello {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			break;
		}
		
		for (int i = 1; i <= 10; i++) {
			if(i == 5) {
				continue;
			}
			System.out.println("5 is not here "+i);
		}

	}

}
