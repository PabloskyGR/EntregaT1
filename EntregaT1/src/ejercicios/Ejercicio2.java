package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Variable donde guardaremos el número entero que introduzcamos
		int num;
		
		// Variable donde guardaremos el resto del número
		int resto;
		
		// Variable donde guardaremos el número que hay que sumar para que sea múltiplo de 7
		int numSum;
		
		// Le pedimos al usuario un número entero
		System.out.println("Dime un número: ");
		num = sc.nextInt();
		
		// Calculamos el resto del número 
		resto = num % 7;
		
		// Calculamos cuanto hay que sumarle al número para que sea múltiplo de 7
		// Usamos el ternario para en caso de que el número fuese ya multiplo de 7, muestre 0
		numSum = num % 7 == 0 ? 0 : 7 - resto;
		
		// Mostramos cuanto hay que sumarle al número para que sea múltiplo de 7
		System.out.println("Para que el número " + num + " sea múltiplo de 7, hay que sumarle: " + numSum);
		
		// Cerramos el scanner
		sc.close();

	}

}
