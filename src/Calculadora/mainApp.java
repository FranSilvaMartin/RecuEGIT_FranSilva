package Calculadora;

import java.util.Scanner;

public class mainApp {
	// Fran Silva
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.println("Introduce otro numero: ");
		int num2 = Integer.parseInt(sc.nextLine());
		
		System.out.println("Suma: " + suma(num1, num2));
		System.out.println("Resta: " + resta(num1, num2));
		System.out.println("Multiplicacion: " + multiplicacion(num1, num2));
		System.out.println("Division: " + division(num1, num2));
	}

	public static int suma(int num1, int num2) {
		int resultado = num1+num2;
		return resultado;
	}
	
	public static int resta(int num1, int num2) {
		int resultado = num1-num2;
		return resultado;
	}
	
	public static double multiplicacion (int num1, int num2) {
		double resultado = num1*num2;
		return resultado;
	}
	
	public static double division (int num1, int num2) {
		double resultado = num1/num2;
		return resultado;
	}
}
