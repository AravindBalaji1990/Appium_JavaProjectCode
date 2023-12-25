package Demo;

public class PrimeNumberDemo1 {

	public static void main(String[] args) {
		if(isPrime(4)) {
			System.out.println("the number is prime");
		}else {
			System.out.println("the number is not prime");
		}
	}

	 private static boolean isPrime(int number) {
	        if (number <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(number); i++) {
	            if (number % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
}
