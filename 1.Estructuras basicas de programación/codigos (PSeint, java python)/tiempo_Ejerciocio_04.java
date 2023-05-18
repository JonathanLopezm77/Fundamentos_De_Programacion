/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "TIEMPO_EJERCIOCIO_04.java."

import java.io.*;

public class tiempo_ejerciocio_04 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double a;
		double t;
		double vfkmh;
		double vfms;
		double vims;
		// Enunciado: Encontrar el tiempo que tarda en lacanzar la velocidad final un cuespo
		// Leer valores de Vims, Vfkmh, a
		// Pedir cada valor por teclado
		// y hallar el tiempo que tarda
		// desarrollado por Jonathan López
		// version 1.0
		// fecha 08/02/23
		// declaracion de variables
		// inicializacion de variables
		vims = 0.0;
		vfkmh = 0.0;
		vfms = 0.0;
		a = 0.0;
		t = 0.0;
		// Entrada de datos
		System.out.println("Por favor ingresar la velocidad inicial en m/s");
		vims = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Por favor ingresar la velocidad final en km/h");
		vfkmh = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Por favor ingresar la aceleración en m/s2");
		a = Double.parseDouble(bufEntrada.readLine());
		// Procesos
		vfms = vfkmh*5/18;
		t = (vfms-vims)/a;
		// Salida
		System.out.println("La velocidad final en m/s es: "+vfms);
		System.out.println("El tiempo que tarda un cuerpo en lacanzar la velocidad final es: "+t+"s");
	}


}

