package krb.java.ru;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Stepen {

	public static void asd() throws IOException 
	{ 
	/** ���������� ����� � ������� **/ 
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 

	String [] list = new String[3]; 
	list[0] = "����� - "; 
	list[1] = " � ������� - "; 
	list[2] = " = "; 

	System.out.println("������� ����� ������� ����� ��������� � ������� � ������� Enter"); 
	double a = Double.parseDouble(reader.readLine()); 
	System.out.println("������� ������� � ������� ����� ��������� � ������� Enter"); 
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
