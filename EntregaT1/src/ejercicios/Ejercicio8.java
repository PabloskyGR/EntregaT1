package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Constante donde guardaremos el precio de adultos
		final double precioAdul = 20;
		
		// Constante donde guardaremos el precio infantil
		final double precioInfan = 15.50;
		
		// Variable donde guardaremos el número de entradas de adulto
		int entradaAdul;
		
		// Variable donde guardaremos el número de entradas infantiles
		int entradaInfan;
		
		// Variable donde guardamos el precio total de las entradas
		double precioTot;
		
		// Variable donde guardaremos el precio con descuento
		double precioFin;
		
		// Le pedimos al usuario cuantas entradas de adulto quiere
		System.out.println("Dime cuantas entradas de adulto quieres:");
		entradaAdul = sc.nextInt();
		
		// Le pedimos al usuario cuantas entradas infantiles quiere
		System.out.println("Dime cuantas entradas infantiles quieres:");
		entradaInfan = sc.nextInt();
		
		// Calculamos el total de las entradas
		precioTot = (entradaAdul * precioAdul) + (entradaInfan * precioInfan);
		
		// Calculamos el precio si tiene descuento
		precioFin = precioTot < 100 ? precioTot : precioTot - ((precioTot * 5) / 100);
		
		// Mostramos el precio final
		System.out.println("El precio final es de: " + precioFin);
		
		// Cerramos el scanner
		sc.close();
		
		
		
		

	}

}
