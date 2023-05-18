/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "ACELERACION_EJERCICIO_02.java."

import java.io.*;

public class aceleracion_ejercicio_02 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double a;
		double t;
		double vfkmh;
		double vfms;
		double vikmh;
		double vims;
		// Enunciado: Calcular la aceleración
		// Leer valores Vfkmh, Vikkmh y t
		// Pedir cada valor por teclado
		// y hallar la aceleración
		// desarrollado por Jonathan López
		// version 1.0
		// fecha 07/02/23
		// declaracion de variables
		// inicializacion de variables
		vfkmh = 0.0;
		vikmh = 0.0;
		t = 0.0;
		vfms = 0.0;
		vims = 0.0;
		a = 0.0;
		// Entrada de datos
		System.out.println("Por favor ingrese la velocidad inicial en km/h");
		System.out.println("Recuerde que si parte del reposo la velocidad inicial es 0");
		vikmh = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Por favor ingrese la velocidad final en km/h");
		vfkmh = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Por favor ingrese el tiempo en segundos");
		t = Double.parseDouble(bufEntrada.readLine());
		// Proceso
		vfms = vfkmh*(5/18);
		vims = vikmh*(5/18);
		a = (vfms-vims)/t;
		// Salida
		System.out.println("La velocidad final en m/s es: "+vfms);
		System.out.println("La velocidad inicial en m/s es: "+vims);
		System.out.println("La aceleración fue de: "+a+"m/s2");
	}


}

