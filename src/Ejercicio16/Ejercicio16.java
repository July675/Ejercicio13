package Ejercicio16;

import java.util.Scanner;

public class Ejercicio16 {
public static void main(String[] args) {
	int num;
	Scanner entrada = new Scanner(System.in);

	System.out.println("Ingrese el numero del cafe que desea: ");
	num = entrada.nextInt();

	switch (num) {
	case 1:
		System.out.println("Cafe cortado ");
		break;

	case 2:
		System.out.println("Cafe latte ");
		break;

	case 3:
		System.out.println("Cafe solo ");
		break;
		
	case 4:
		System.out.println("Cafe lagrima");
		break;
	
	case 5:
		break;
		
	default:
		System.out.println("No valido");
		break;

	}
}
}
