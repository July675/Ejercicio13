package Ejercicio19;

import java.util.Scanner;

public class Ejercicio19 {
public static void main(String[] args) {
	String NyA;
	Scanner entrada = new Scanner(System.in);
	int numEle;
	int contador = 0;
	boolean flag = false;
	
	System.out.println("Ingrese su nombre y apellido");
	NyA = entrada.nextLine();
	
	int numAle = (int)Math.random()*99;
	
	do {
		System.out.println("Ingrese un numero");
		numEle = entrada.nextInt();
	} while (numEle!=numAle);
	
	while (numEle==numAle) {
	
	System.out.println("GANASTE");}
	
}}
