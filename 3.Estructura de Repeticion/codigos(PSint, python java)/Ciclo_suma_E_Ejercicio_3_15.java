/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "CICLO_SUMA_E_EJERCICIO_315.java."

import java.io.*;

public class ciclo_suma_e_ejercicio_315 {

	public static void main(String args[]) {
		int i;
		int suma;
		// Enunciado: Encontrar el valor de la suma consecutiva de los numeros enteros positivos del 1 al 50
		// desarrollado por Jonathan López
		// version 1.0
		// fecha 01/03/23
		// declaracion de variables
		// inicializacion de variables
		i = 0;
		suma = 0;
		// procesos y salidas
		System.out.println("Lista de numeros sumados");
		for (i=1;i<=50;i++) {
			System.out.println(i);
			suma = suma+i;
		}
		System.out.println("El resultado de la suma es "+suma);
	}


}

