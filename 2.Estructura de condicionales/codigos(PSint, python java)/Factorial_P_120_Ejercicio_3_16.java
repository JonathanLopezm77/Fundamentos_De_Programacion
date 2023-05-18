/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "FACTORIAL_NATURALES_EJERCICIO_3_16.java."

import java.io.*;

public class factorial_naturales_ejercicio_3_16 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int v_f;
		int v_numn;
		double v_numnn;
		// Escribir un algoritmo que calcule el producto de los n primeros números naturales hasta el 12.
		// Leer valores del numero natural
		// Pedir el valor por teclado
		// y hallar el factorial
		// desarrollado por Jonathan López
		// version 1.1
		// fecha 04/03/23
		// declaracion de variables
		// inicializacion de variables
		// VARIABLE QUE ALMACENA EL NUMERO NATURAL.
		v_numnn = 0;
		// VARIABLE QUE ALMACENA EL PRODUCTO O FACTORIAL.
		v_f = 0;
		// Entrada de datos
		System.out.println("Escriba un numero natura");
		v_numn = Integer.parseInt(bufEntrada.readLine());
		// Proceso
		if (v_numn==0) {
			System.out.println("Factorial de 0 igual a 1");
		} else {
			if (v_numn>0) {
				v_f = 1;
			} else {
				System.out.println("Numero negativo");
			}
		}
		do {
			v_f = v_f*v_numn;
			v_numn = v_numn-1;
		} while (v_numn!=1);
		// Salida
		System.out.println("Factorial="+v_f);
	}


}

