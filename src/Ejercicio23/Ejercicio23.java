package Ejercicio23;

import java.util.Scanner;

public class Ejercicio23 {
public static void main(String[] args) {
	
	int contra=2008;
	int ingresado;
	int inten=0;
	Scanner entrada = new Scanner(System.in);
	
	do{
		System.out.println("Ingresar contraseña:");
		ingresado = entrada.nextInt();
		
		if (ingresado!=contra) {
			System.out.println("Contraseña incorrecta");
			
			int mostrar=inten+1;
			System.out.println("Numero de intentos: "+mostrar);
			inten++;
		}
		
	}while(inten<3 && ingresado!=contra);
	
	if(inten>1 && ingresado!=contra) {
		System.out.println("Usuario bloqueado");}
	
	else if (ingresado==contra) {
		System.out.println("conraseña correcta");}
	}
}

