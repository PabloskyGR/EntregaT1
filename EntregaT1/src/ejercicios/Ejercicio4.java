package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Variable donde guardaremos la altura del triángulo
		double altura;
		
		// Variable donde guardaremos la base del triángulo
		double base;
		
		// Variable donde guardaremos el área del triángulo
		double area;
		
		// Le pedimos al usuario la altura
		System.out.println("Dime la altura del triángulo: ");
		altura = sc.nextDouble();
		
		// Le pedimos al usuario la base
		System.out.println("Dime la base del triángulo: ");
		base = sc.nextDouble();
		
		// Calculamos el área del triángulo
		area = (base * altura) / 2;
		
		// Mostramos el área del triángulo
		System.out.println("El área del triángulo es: " + area);
		
		// Cerramos el scanner
		sc.close();
	

	}

}
