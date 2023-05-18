/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "MAYOR_JERCICIO_6.java."

import java.io.*;

public class mayor_jercicio_6 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double a;
		double b;
		double c;
		// ENUNCIADO=Ealgorimo que dice cual el mayor de los 3 numeros ingresados por el usuario
		// Leer valores de a, b y c
		// Pedir cada valor por teclado
		// y hallar el vnumero mayor
		// Desarerolado por: Jonathan López
		// VERSION=1.1
		// fecha 26/02/23
		// declaracion de variables
		// variables que alamcenan los nhumeros a comparar
		// inicializacion de variables
		a = 0.0;
		b = 0.0;
		c = 0.0;
		// Entrada de datos
		System.out.println("Por favor ingrese el primer numero (a)");
		a = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Por favor ingrese el segundo numero (b)");
		b = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Por favor ingrese el tercer numero (c)");
		c = Double.parseDouble(bufEntrada.readLine());
		// Procesos y salidas}
		// comparaciones  para saber si 2 o toodos numeros ingresador por el usuario son iguales
		if (a==b) {
			System.out.println("a y b son iguales");
		}
		if (c==b) {
			System.out.println("b y c son iguales");
		}
		if (a==c) {
			System.out.println("a y c son iguales");
		}
		if (a==b && b==c) {
			System.out.println("todos los numeros son iguales");
		} else {
			// comparacion para sber cual es el numero mayor
			if (a<b) {
				if (b<c) {
					System.out.println("EL numero amyor es= "+c);
				} else {
					System.out.println("EL numero mayor es= "+b);
				}
			} else {
				if (a<c) {
					System.out.println("El numero mayor es= "+c);
				} else {
					System.out.println("EL numero mayor es ="+a);
				}
			}
		}
	}


}

