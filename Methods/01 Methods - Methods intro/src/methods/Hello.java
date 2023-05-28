package methods;

public class Hello {

	public static void main(String[] args) {
		loop1();

		System.out.println("*******************");

		loop2();

		System.out.println("*******************");

		loop1();

		System.out.println("*******************");

		loop3(1, 27);
		
		System.out.println("*******************");

		loop3(1, 20);
	}

	public static void loop1() {
		int i = 1;

		while (i <= 10) {
			System.out.println(i);
			i++;
		}
	}

	public static void loop2() {
		int j = 20;
		while (j <= 40) {
			System.out.println(j);
			j++;
		}
	}
	
	public static void loop3(int step, int finalValue) {
		while (step <= finalValue) {
			System.out.println(step);
			step++;
		}
	}

}
