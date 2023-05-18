/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "NOTA_EJERCICIO_06.java."

import java.io.*;

public class nota_ejercicio_06 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int v_ina;
		double v_n;
		double v_n1;
		double v_n2;
		double v_n3;
		double v_nd;
		String v_nomasi;
		String v_nomest;
		double v_np;
		double v_ns;
		double v_nt;
		double v_p1;
		double v_p2;
		double v_p3;
		int v_si;
		int v_si hacer;;
		// Enunciado: Encontrar el valor de x en una ecuacion lineal tip ax + b
		// Leer valores de a y b
		// Pedir cada valor por teclado
		// y hallar el valor de x
		// desarrollado por Jonathan López
		// version 1.0
		// fecha 28/02/23
		// Declaracion de variables
		// Inicializacion de variables
		v_n1 = 0.0;
		v_n2 = 0.0;
		v_n3 = 0.0;
		v_p1 = 0.0;
		v_p2 = 0.0;
		v_p3 = 0.0;
		v_np = 0.0;
		v_ns = 0.0;
		v_nt = 0.0;
		v_n = 0.0;
		v_nd = 0.0;
		v_si = 0;
		v_ina = 0;
		v_nomest = "";
		v_nomasi = "";
		// Entrada de datos
		System.out.println("Por favor ingrese el nombre del estudiante");
		v_nomest = bufEntrada.readLine();
		System.out.println("Por favor ingrese el nombre e la asignatura");
		v_nomasi = bufEntrada.readLine();
		System.out.println("Por favor ingrese nota del primer parcial");
		v_n1 = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Por favor ingrese nota del segundo parcial");
		v_n2 = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Por favor ingrese nota del tercer parcial");
		v_n3 = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Por favor ingrese el primer porsentaje recuerde que debe ser en decimal así 10%= 0.1");
		v_p1 = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Por favor ingrese el segundo porsentaje");
		v_p2 = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Por favor ingrese el tercer porsentaje ");
		v_p3 = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Por favor Ingrese la cantidad de inacistencias");
		v_ina = Integer.parseInt(bufEntrada.readLine());
		// Procesos y salidas 
		System.out.println("la nota del primaer parcial es ");
		v_np = v_n1*v_p1;
		System.out.println(v_np);
		System.out.println("la nota del segundo parcial es ");
		v_ns = v_n2*v_p2;
		System.out.println(v_ns);
		System.out.println("la nota del segundo parcial es ");
		v_nt = v_n3*v_p3;
		System.out.println(v_nt);
		System.out.println("La nota es ");
		v_n = v_np+v_ns+v_nt;
		System.out.println(v_n);
		System.out.println("si el numero de inacistencias es menor a 12 y nota  es mayor a 3.5 opcion 1, si el numero de inacistencias es menor a 12 pero la nota es menor a 3.5 opcion 2, si el numero de inacistencias es mayor o igual a 12 opcion 3 ");
		v_si = Integer.parseInt(bufEntrada.readLine());
		switch (v_si hacer;) {
		case 1:
			System.out.println("aprueba academicamente");
			System.out.println("la Nota definitiva es igual a");
			v_nd = v_n;
			System.out.println(v_nd);
			break;
		case 2:
			System.out.println("reprueba academicamente");
			System.out.println("la Notade definitiva es igual a");
			v_nd = v_n;
			System.out.println(v_nd);
			break;
		case 3:
			System.out.println("reprueba por inacistencias");
			System.out.println("la Notade definitiva es igual a");
			v_nd = v_n/2;
			System.out.println(v_nd);
			break;
		}
	}


}

