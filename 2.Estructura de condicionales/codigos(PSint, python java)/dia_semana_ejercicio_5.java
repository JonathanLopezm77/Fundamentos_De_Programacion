/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "DIA_SEMANA_EJERCICIO_5.java."

import java.io.*;

public class dia_semana_ejercicio_5 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int v_d1;
		int v_dia;
		String v_dia1;
		// Enunciado: Encontrar el dia de la semana con una fecha ingresando el primer dia del mes
		// Leer valore dia y primer dia del mes
		// Pedir valores por teclado
		// hallar el dia de la semana
		// desarrollado por Jonathan López
		// version 1.0
		// fecha 2/03/23
		// declaracion de variables
		// Inicialiacion variables
		v_dia = 0;
		v_d1 = 0;
		v_dia1 = "";
		// Entrada de datos
		System.out.println("Cual fue el primer dia del mes (L,M,X,J,V,S,D)");
		v_dia1 = bufEntrada.readLine();
		// Procesos y salidas
		switch (v_dia1) {
		case "L":
			v_d1 = 0;
			break;
		case "M":
			v_d1 = 1;
			break;
		case "X":
			v_d1 = 2;
			break;
		case "J":
			v_d1 = 3;
			break;
		case "V":
			v_d1 = 4;
			break;
		case "S":
			v_d1 = 5;
			break;
		case "D":
			v_d1 = 6;
			break;
		}
		System.out.println("Por favor ingresar el dia");
		v_dia = Integer.parseInt(bufEntrada.readLine());
		v_dia = v_dia+v_d1;
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
	}


}

