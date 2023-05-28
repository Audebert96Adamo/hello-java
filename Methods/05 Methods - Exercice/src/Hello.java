import main.Calculate;

public class Hello {

	public static void main(String[] args) {
		Calculate prime = new Calculate();
		if (prime.isPrime(11)) {
			System.out.println("Number passed is prime");
		} else {
			System.out.println("Number passed is not prime");
		}
		if (prime.isPrime(7.5)) {
			System.out.println("Number passed is prime");
		} else {
			System.out.println("Number passed is not prime");
		}
	}
}
