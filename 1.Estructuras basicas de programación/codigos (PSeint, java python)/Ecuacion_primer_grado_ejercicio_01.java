/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "ECUACION_PRIMER_GRADO_EJERCICIO_01.java."

import java.io.*;

public class ecuacion_primer_grado_ejercicio_01 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double v_valora;
		double v_valorb;
		double v_valorx;
		// Enunciado: Encontrar el valor de x en una ecuacion lineal tip ax + b
		// Leer valores de a y b
		// Pedir cada valor por teclado
		// y hallar el valor de x
		// desarrollado por Jonathan López
		// version 1.0
		// fecha 28/02/23
		// declaracion de variables
		// inicializacion de variables
		v_valora = 0;
		v_valorb = 0;
		v_valorx = 0;
		// Entrada
		System.out.println("Calculadora de ecuaciones de primer grado tipo ax + b= 0");
		System.out.println("Por favor escribir el valor de a");
		v_valora = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Por favor escribir el valor de b");
		v_valorb = Double.parseDouble(bufEntrada.readLine());
		v_valorx = (-v_valorb)/v_valora;
		System.out.println(" El valor de x es "+v_valorx);
	}


}

