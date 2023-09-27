package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Variable donde guardaremos el número entero que introduzcamos
		int num1;
		
		// Variable donde guardaremos el otro número entero
		int num2;
		
		// Variable donde guardaremos el resto del num1
		int resto;
		
		// Variable donde guardaremos cuanto hay que sumar a num1 para que sea múltiplo de num2
		int numSum;
		
		// Le pedimos al usuario dos números
		System.out.println("Dime dos números: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		// Calculamos el resto de num1
		resto = num1 % num2;
		
		//Usamos el ternario para en caso de que num1 fuese ya multiplo de num2, muestre 0
		numSum = num1 % num2 == 0 ? 0 : num2 - resto;
		
		// Mostramos cuanto hay que sumar a num1 para que sea múltiplo de num2
		System.out.println("Para que el número " + num1 + " sea múltiplo de " + num2 + ", hay que sumarle: " + numSum);
		
		// Cerramos el scanner
		sc.close();
		
	}

}
