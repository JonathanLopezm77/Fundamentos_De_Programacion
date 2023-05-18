/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "DIA_SEMANA_EJERCICIO_4.java."

import java.io.*;

public class dia_semana_ejercicio_4 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double dia;
		int v_dia;
		// Enunciado: Encontrar el dia de la semana con una fecha
		// Leer valor dia
		// Pedir valor dia por teclado
		// hallar el dia de la semana
		// desarrollado por Jonathan López
		// version 1.0
		// fecha 2/03/23
		// declaracion de variables
		System.out.println("Por favor ingrese el dia ");
		// inicializacion de variables
		dia = 0;
		// Entrada de datos
		v_dia = Integer.parseInt(bufEntrada.readLine());
		if (v_dia<=31) {
			switch (v_dia%7) {
			case 0:
				System.out.println("Domingo");
				break;
			case 1:
				System.out.println("Lunes");
				break;
			case 2:
				System.out.println("Martes");
				break;
			case 3:
				System.out.println("Miercoles");
				break;
			case 4:
				System.out.println("Jueves");
				break;
			case 5:
				System.out.println("Viernes");
				break;
			case 6:
				System.out.println("Sabado");
				break;
			}
		} else {
			System.out.println("ningun mes tiene mas de 31 dias ");
		}
	}


}

