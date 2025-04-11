package Ejercicio13;

import java.util.Scanner;

public class Eercicio13 {
public static void main(String[] args) {
	int hora;
	int minuto;
	int segundo;
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Ingresar hora: ");
	hora = entrada.nextInt();
	
	System.out.println("Ingresar minuto: ");
	minuto = entrada.nextInt();
	
	System.out.println("Ingresar segundo: ");
	segundo = entrada.nextInt();
	
	if(hora<24 && minuto<60 ) {
		if(segundo<60) {
	System.out.println("Valor valido");	
	}}
	else {
		System.out.println("Valor invalido");
	}
}
}
