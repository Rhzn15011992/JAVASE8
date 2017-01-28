package krb.java.ru;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyFirstClass {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int sizeArray = Integer.parseInt(reader.readLine());
		long array[] = new long[sizeArray];
		array[0] = 1;
		array[1] = 1;
		System.out.println(array[0]);
		System.out.println(array[1]);
		for (int i = 2; i < sizeArray; i++) {
			System.out.println(array[i] = array[i - 1] + array[i - 2]);
		}

	}

}
