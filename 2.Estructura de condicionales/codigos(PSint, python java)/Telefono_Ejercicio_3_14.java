/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "TELEFONO_EJERCICIO_3_14.java."

import java.io.*;

public class telefono_ejercicio_3_14 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int v_cll;
		int v_numpas;
		int v_numpasex;
		// Enunciado:Determinar la cantidad total a pagar por una llamada telefónica, teniendo en cuenta lo siguiente:
		// el coste minimo de una llamada es 10 centimos  este costo se mantiene en los primeros 3 minutos
		// cualquier minuto adicional se cobra a 5 centimos
		// Creado por: Jonathan Lopez
		// version 1.0
		// fecha 28/02/23
		// declaracion de variables
		// inicializacion de variables
		// variable que alamacena la cantidad 
		v_numpas = 0;
		// variable donde se alamcena el costo de la llamada
		v_cll = 0;
		// variable que alamacaena la cantidad de pasos depues de los 3 minutos
		v_numpasex = 0;
		// Entrada de datos
		System.out.println("Escribir numero de pasos");
		v_numpas = Integer.parseInt(bufEntrada.readLine());
		// Proccesos
		if (v_numpas<0) {
			System.out.println("ERROR");
			// porque no puden cobrar pasos negativos
			v_numpas = 0;
		} else {
			// porque el cobro minimo es de 10 
			v_cll = 10;
			v_numpasex = v_numpas-5;
			if (v_numpasex>0) {
				// por cada paso se agregan 5 centimos
				v_cll = v_cll+v_numpasex*5;
			}
		}
		// Salida
		System.out.println("PASOS="+v_numpas);
		// resuktado final imprime la cantidad de pasos y los centimos a pagar por ewl ususario
		System.out.println("VALOR DE LA LLAMADA="+v_cll+"CENTIMOS");
	}


}

