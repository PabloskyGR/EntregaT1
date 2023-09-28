package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);	
		
		// Variable donde guardaremos la medida en milimetros
		double mm;
		
		// Variable donde guardaremos la medida en centímetros
		double cm;
		
		// Variable donde guardaremos la medida en metros
		double m;
		
		// Variable donde guardaremos la conversión de metro a centímetro
		double metroAcm;
		
		// Variable donde guardaremos la conversión de milímetros a centímetro
		double milimetroAcm;
		
		// Variable donde guardaremos el total de las 3 medidas en centímetro
		double total;
		
		// Le pedimos al usuario las 3 medidas correspondientes
		System.out.println("Dime 3 medidas, primero en metros, luego en centímetro y por último en milímetros:");
		m = sc.nextDouble();
		cm = sc.nextDouble();
		mm = sc.nextDouble();
		
		// Pasamos los metros a centímetros
		metroAcm = m * 100;
		
		// Pasamos los milímetros a centímetros
		milimetroAcm = mm / 10;
		
		// Calculamos la suma de las 3 medidas
		total = metroAcm + cm + milimetroAcm;
		
		// Mostramos el resultado de la suma de nlas 3 medidas
		System.out.println("La suma de las 3 medidas en centímetros sería de: " + total + " cm");
		
		// Cerramos el scanner
		sc.close();
		
		

	}

}
