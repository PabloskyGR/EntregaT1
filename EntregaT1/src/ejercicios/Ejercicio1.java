package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Variable donde guardamos el número con decimales
		double num;
		
		// Variable donde guardaremos el número redondeado
		int numRed;
		
		// Le pedimos al usuario un número con decimales
		System.out.println("Dime un número con decimales: ");
		num = sc.nextDouble();
		
		// Redondeamos el número al entero más próximo
		numRed = (int) (num + 0.5);
		
		// Mostramos el número redondeado
		System.out.println("El número redondeado sería: " + numRed);
		
		// Cerramos el scanner
		sc.close();

	}

}
