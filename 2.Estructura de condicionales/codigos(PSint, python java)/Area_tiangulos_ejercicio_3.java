/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "AREA_TIANGULOS_EJERCICIO_3.java."

import java.io.*;
import java.math.*;

public class area_tiangulos_ejercicio_3 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double v_area;
		double v_l1;
		double v_l2;
		double v_l3;
		double v_sp;
		// Enunciado: Encontrar el area de un triaungulo
		// Leer la base y la altura
		// Pedir cada valor por teclado
		// hallar el area del triangulo
		// desarrollado por Jonathan López
		// version 1.0
		// fecha 01/03/23
		// declaracion de variables
		// Inicializacion de variables
		v_l1 = 0.0;
		v_l2 = 0.0;
		v_l3 = 0.0;
		v_sp = 0.0;
		v_area = 0.0;
		// Entrada de datos
		System.out.println("Por favor escriba los 3 lados del triangulo");
		v_l1 = Double.parseDouble(bufEntrada.readLine());
		v_l2 = Double.parseDouble(bufEntrada.readLine());
		v_l3 = Double.parseDouble(bufEntrada.readLine());
		// Procesos y salidas
		v_sp = (v_l1+v_l2+v_l3)/2;
		if ((v_sp>v_l2) && (v_sp>v_l2) && (v_sp>v_l3)) {
			v_area = Math.sqrt(v_sp*(v_sp-v_l1)*(v_sp-v_l2)*(v_sp-v_l3));
			System.out.println(v_area);
		} else {
			System.out.println("No es un triangulo");
		}
	}


}

