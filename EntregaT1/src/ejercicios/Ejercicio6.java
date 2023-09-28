package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		// Abrimos el scanner 
		Scanner sc = new Scanner(System.in);
		
		// Variable donde guardaremos los segundos del usuario
		int seg;
		
		// Variable donde guardaremos las horas totales
		int hora;
		
		// Variable donde guardaremos el total de segundos que quedan para calcular los minutos
		int calcMinut;
		
		// Variable donde guardaremos los minuto totales 
		int minut;
		
		// Variable donde guardamos los segundos restantes
		int segRest;
		
		// Le pedimos al usuario un número de segundos
		System.out.println("Dime un número de segundos: ");
		seg = sc.nextInt();
		
		// Calculamos cuantas horas hay en total
		hora = seg / 3600;
		
		// Calculamos el resto para avergiuar el número de segundos restantes
		calcMinut = seg % 3600;
		
		// Calculamos el nçumero de minutos totales
		minut = calcMinut / 60;
		
		// Calculamos los segundos restantes que quedan al final
		segRest = calcMinut % 60;
		
		// Mostramos cuantas horas, minutos y segundos
		System.out.println("\nHoras: " + hora + "\nMinutos: " + minut + "\nSegundos: " + segRest);
		
		// Cerramos el scanner
		sc.close();
		
		
		

	}

}
