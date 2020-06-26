
public class Main {

	public static void main(String[] args) {
		
		LazyNumberDetails number = new LazyNumberDetails();
		
		number.updateNumber(13);
		number.isPrime();
		number.isPrime();
		number.isPerfect();
		number.isPerfect();
		number.updateNumber(6);
		number.isPerfect();
		number.isPerfect();
		number.updateNumber(20);
		number.isPrime();
		number.isPrime();
		number.updateNumber(7999999);
		number.isMagic();
		number.isMagic();
		number.updateNumber(100);
		number.isMagic();
		number.isMagic();
		
	}

}