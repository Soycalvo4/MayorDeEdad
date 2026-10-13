package edades;

import java.util.Scanner;

public class Controlador {
		
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce edad:");
		
		int edad = teclado.nextInt();
		
		boolean resultadoMayorDeEdad;
		resultadoMayorDeEdad = Edades.mayorEdad(edad);
		System.out.println("Mayor de edad verdadero/falso");
		System.out.println(resultadoMayorDeEdad);
		
		
		
		
	}

}
