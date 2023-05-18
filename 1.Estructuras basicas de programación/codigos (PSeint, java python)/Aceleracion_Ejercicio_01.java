/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "ACELERACION_EJERCICIO_01.java."

import java.io.*;

public class aceleracion_ejercicio_01 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double a;
		double t;
		double vf;
		double vi;
		// Enunciado: Calacula la Aceleración 
		// Leer valores de Vi, Vf y t
		// Pedir cada valor por teclado
		// Hallar la aceleación
		// desarrollado por Jonathan López
		// version 1.0
		// fecha 7/02/23
		// declaracion de variables
		// inicializacion de variables
		vf = 0.0;
		vi = 0.0;
		t = 0.0;
		a = 0.0;
		// Entrada de datos
		System.out.println("Por favor ingrese el valor de la velocidad inicial en m/s");
		vi = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Por favor ingrese el valor de la velocidad final m/s");
		vf = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Por favor ingrese el valor de el tiempo en segundos");
		t = Double.parseDouble(bufEntrada.readLine());
		// procesos
		a = (vf-vi)/t;
		// salida
		System.out.println("la aceleracion ha sido: "+a+"m/s2");
	}


}

