package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Variable donde guardaremos el coeficie de "a"
		int a;
		
		// Variable donde guardaremos el coeficie de "b"
		int b;
		
		// Variable donde guardaremos el coeficie de "c"
		int c;
		
		// Variable donde guardaremos el coeficie de "x"
		int x;
		
		// Variable dopnde guardaremos el resultado de "y"
		int y;
		
		// Le pedimos al usuario lo valores de "a", "b", "c" y "x"
		System.out.println("Dime los valores de: \na \nb \nc \nx ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		x = sc.nextInt();
		
		// Calculamos "y"
		y = (int) ((a * Math.pow(x, 2)) + (b * x) + c);
		
		// Mostramos el resultado
		System.out.println("El resultado de 'y' es: " + y);
		
		// Cerramos el scanner 
		sc.close();
		
	}

}
