package krb.java.ru;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Stepen {

	public static void asd() throws IOException 
	{ 
	/** Возведение числа в степень **/ 
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 

	String [] list = new String[3]; 
	list[0] = "Число - "; 
	list[1] = " в степени - "; 
	list[2] = " = "; 

	System.out.println("Введите число которое будем возводить в степень и нажмите Enter"); 
	double a = Double.parseDouble(reader.readLine()); 
	System.out.println("Введите степень в которую будем возводить и нажмите Enter"); 
	int b = Integer.parseInt(reader.readLine()); 
	double result = 1; 
	for (int i = 0; i < b; result = result * a) 
	{ 
	if (b == 0) 
	{ 
	result = 1; 
	break; 
	} 
	if (a == 0) 
	{ 
	result = 0; 
	} 
	// 
	if (b % 2 == 0 && a < 0) 
	{ 
	result = result * -1; 
	} 
	i++; 
	} 

	System.out.println(list[0]+a+list[1]+b+list[2]+(int)result); 

	}




}
