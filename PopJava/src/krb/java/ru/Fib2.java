package krb.java.ru;

public class Fib2 {

	public static void main(String[] args) {

		/** решение без массива **/
		
		int pervoe = 1;
		int vtoroe = 1;

		System.out.print(pervoe + " ");
		System.out.print(vtoroe + " ");
		int result = pervoe + vtoroe;

		for (int i = 0; i < 20; i++) {
			System.out.print(result = pervoe + vtoroe);
			pervoe = vtoroe;
			vtoroe = result;
			System.out.print(" ");

		}

	}

}
