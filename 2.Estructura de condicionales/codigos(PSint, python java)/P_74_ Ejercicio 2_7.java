/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "SECUENCIA_EJERCICIO_2_7.java."

import java.io.*;

public class secuencia_ejercicio_2_7 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int v_i;
		double v_media;
		double v_num;
		double v_suma;
		// Enunciado:cular la media de una serie de números positivos, suponiendo que los datos se leen desde un terminal. 
		// Leer valores de v_dato
		// Pedir cel valor por teclado
		// y hallar la media
		// desarrollado por Jonathan López
		// version 1.1
		// fecha 26/02/2023
		// declaracion de variables
		// VARIABLE DE ENTRADA QUE CUENTA LOS NUMEROS
		// VARIABLE DE ENTRADA QUE SUMA LOS NUMEROS
		// VARIABLE DE PROCESO QUE ALMACENA EL NUMERO ESCRITO
		// VARIABLE DE SALIDA QUE ALMACENA LA MEDIA
		// inicializacion de variables
		v_i = 0;
		v_suma = 0.0;
		v_num = 0.0;
		v_media = 0.0;
		// Procesos
		System.out.println("Por favor introduzca los numeros de los cuales desea sacar la media para fiinalizar digite 0");
		do {
			// Entrada de dato
			v_num = Double.parseDouble(bufEntrada.readLine());
			// procesos
			if (v_num==0) {
				v_media = v_suma/v_i;
			} else {
				if (v_num<0) {
					System.out.println("Este programa no suma numeros negativos");
				} else {
					v_i = v_i+1;
					v_suma = v_suma+v_num;
				}
			}
		} while (!(v_num==0 || v_num<0));
		// Salida
		System.out.println("la media es= "+v_media);
	}


}

