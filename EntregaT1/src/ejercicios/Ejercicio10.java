package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		// Abrimos el scanner 
		Scanner sc = new Scanner(System.in);
		
		// Variable donde guardaremos la cantidad de metros
		double m;
		
		// Variable donde guardaremos la cantidad lanzada pero en centímetros
		int cm;
		
		// Le pedimos al usuario cuantos a cuantos metros ha lanzado el papel
		System.out.println("¿Cuantos metros has llegado a lanzar tu papel?");
		m = sc.nextDouble();
		
		// Hacemos la conversión de metros a centímetros
		cm = (int) (m * 100);
		
		// Mostramos el total de centímetros que ha recorrido
		System.out.println("El papel ha recorrido un total de " + cm + " cm");
		
		// Cerramos el scanner
		sc.close();
		
	}

}
