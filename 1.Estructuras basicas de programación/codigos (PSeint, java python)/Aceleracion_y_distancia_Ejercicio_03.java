/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "ACELERACION_Y_DISTANCIA_EJERCICIO_03.java."

import java.io.*;
import java.math.*;

public class aceleracion_y_distancia_ejercicio_03 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double a;
		double d;
		double t;
		double vf;
		double vi;
		// Enunciado: Encontrar la aceleracion y diatancia
		// Leer valores de Vi, Vf, t
		// Pedir cada valores por teclado
		// y hallar la aceleracion y la distancia
		// desarrollado por Jonathan López
		// version 1.0
		// fecha 08/02/23
		// declaracion de variables
		// inicializacion de variables
		vf = 0.0;
		vi = 0.0;
		t = 0.0;
		a = 0.0;
		d = 0.0;
		// Entrada de datos
		System.out.println("Por favor ingresar la velocidad inicial en m/s");
		vi = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Por favor ingresar la velocidad final en m/s");
		vf = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Por favor ingresar el tiempo en segundos");
		t = Double.parseDouble(bufEntrada.readLine());
		// Procesos
		a = (vf-vi)/t;
		d = (vi*t)+(1/2*a)*(Math.pow(t,2));
		// Salida
		System.out.println("La aceleracion fue de: "+a+"m/s2");
		System.out.println("La distancia recorrida fue de: "+d+"m");
	}


}

