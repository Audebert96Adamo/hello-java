package flow.control;

public class hello {

	public static void main(String[] args) {
		for (int i = 1, j = 1; i < 10 && j < 10; i++, j++) {
			System.out.println("&& i="+i+" and j="+j);
		}
		for (int i = 1, j = 10; i < 10 && j < 10; i++, j++) {
			System.out.println("&& i="+i+" and j="+j);
		}

		for (int i = 1, j = 10; i <= 10 || j <= 10; i++, j++) {
			System.out.println("|| i="+i+" and j="+j);
		}
		
		int i = 0, j = 0;
		do {
			i++;
			j++;
			System.out.println("do while i="+i+" and j="+j);
		} while (i < 10 || j < 10);
	}

}
