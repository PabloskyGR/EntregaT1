package ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Variable donde guardamos el primer número
		int num1;
		
		// Variable donde guardamos el segundo número
		int num2;
		
		// Booleano inicializado a true para ver si son iguales o no los números
		boolean igual = true;
		
		// Le pedimos al usuario dos números
		System.out.println("Dime 2 números:");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		// Comprobamos si son iguales los números
		igual = num1 == num2;
		
		// Mostramos si son iguales o no con True o False
		System.out.println("¿Son los dos números iguales?\n" + igual);
		
		// Cerramos el scanner
		sc.close();
	}

}
