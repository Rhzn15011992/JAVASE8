package krb.java.ru;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Stepen {

	public static void main(String[] args) throws IOException {
		/** возведение в степень **/
		System.out.println(stepen(2, 3));

	}

	public static int stepen(int a, int b) {

		for (int i = 1; i < b; i++) {
			a = a * 2;
		}

		return a;
	}
}
