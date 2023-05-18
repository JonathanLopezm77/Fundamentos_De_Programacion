/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "EJERCICIO_28_CICLO_SUMA_PARES.java."

import java.io.*;

public class ejercicio_28_ciclo_suma_pares {

	public static void main(String args[]) {
		int i;
		int suma;
		// Enunciado: Encontrar el valor de la suma de los numeros enteros psositivos pares del 2 al 100
		// desarrollado por Jonathan López
		// version 1.0
		// fecha 02/03/23
		// declaracion de variables
		// inicializacion de variables
		i = 0;
		suma = 0;
		// procesos y salidas
		System.out.println("Lista de numeros sumados");
		for (i=2;i<=100;i+=2) {
			System.out.println(i);
			suma = suma+i;
		}
		System.out.println("El resultado de la suma es "+suma);
	}


}

