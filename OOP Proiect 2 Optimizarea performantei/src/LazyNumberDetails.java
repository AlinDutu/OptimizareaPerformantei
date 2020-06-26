
public class LazyNumberDetails {

	private int number;
	private boolean primeResult;
	private boolean perfectResult;
	private boolean magicResult;
	private boolean calculatedPrime;
	private boolean calculatedPerfect;
	private boolean calculatedMagic;
	
	public LazyNumberDetails() {
		this.number = -1;
		this.primeResult = false;
		this.perfectResult = false;
		this.magicResult = false;
		this.calculatedPrime = false;
		this.calculatedPerfect = false;
		this.calculatedMagic = false;
	}

	public void updateNumber(int number) {
		this.number = number;
		this.calculatedPrime = false;
		this.calculatedPerfect = false;
		this.calculatedMagic = false;
	}

	private boolean isPrime(int number) {
		for(int i = 2; i <= number / 2; i++) {
			if(number % i == 0) {
				return false;
			}
		}
		return true;
	}
	public void isPrime() {
		if(calculatedPrime == true) {
			System.out.println("Cached, is prime number? " + primeResult);
		} else {
		this.primeResult = isPrime(this.number);
		this.calculatedPrime = true;
		System.out.println("Computation, is prime number? " + primeResult);
		}
	}
	
	
	private boolean isPerfect(int number) {
		int sum = 1;
		for(int i = 2; i <= number / 2; i++) {
			if(number % i == 0) {
				sum += i;
			}
		}
		if(sum == number) {
			return true;
		}
		return false;
	}
	public void isPerfect() {
		if(calculatedPerfect == true) {
			System.out.println("Cached, is perfect number? " + perfectResult);
		} else {
			this.perfectResult = isPerfect(this.number);
			this.calculatedPerfect = true;
			System.out.println("Computation, is perfect Number? " + perfectResult);
		}
	}
	private boolean isMagic(int number) {
		int sum = 0;
		while(number != 0) {
			int lastDigit = number % 10;
			sum += lastDigit;
			number /= 10;
		}
		if(sum > 9) {
			int sum2 = 0;
			while(sum != 0) {
				int lastDigit = sum % 10;
				sum2 += lastDigit;
				sum /= 10;
			}
			if(sum2 == 3 || sum == 7 || sum == 9) {
				return true;
			}
		} 
		else if(sum == 3 || sum == 7 || sum == 9) {
			return true;
		}
		return false;
	}
	public void isMagic() {
		if(calculatedMagic == true) {
			System.out.println("Cached, is magic number? " + magicResult);
		} else {
			this.magicResult = isMagic(this.number);
			this.calculatedMagic = true;
			System.out.println("Computation, is magic number? " + magicResult);
		}
	}

}
