/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "SALARIO_EJERCICIO_2_9.java."

import java.io.*;

public class salario_ejercicio_2_9 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int v_ch1;
		int v_ch2;
		int v_ch3;
		int v_ch4;
		int v_che1;
		int v_che2;
		int v_che3;
		int v_che4;
		String v_nomemp;
		double v_ph1;
		double v_ph2;
		double v_ph3;
		double v_ph4;
		double v_phe1;
		double v_phe2;
		double v_phe3;
		double v_phe4;
		double v_ps1;
		double v_ps2;
		double v_ps3;
		double v_ps4;
		double v_sm;
		double v_vh;
		// Enunciado: Encontrar el salario a pagar
		// Leer valores de la hora, la cantidad de horas normales de la semana 1, 2, 3 y 4
		// Pedir cada valor por teclado
		// y calcular el salario a pagar
		// desarrollado por Jonathan López
		// version 1.0
		// fecha 01/03/23
		// declaracion de variables
		// inicializacion de variables
		v_vh = 0.0;
		v_ph1 = 0.0;
		v_ph2 = 0.0;
		v_ph3 = 0.0;
		v_ph4 = 0.0;
		v_phe1 = 0.0;
		v_phe2 = 0.0;
		v_phe3 = 0.0;
		v_phe4 = 0.0;
		v_ps1 = 0.0;
		v_ps2 = 0.0;
		v_ps3 = 0.0;
		v_ps4 = 0.0;
		v_sm = 0.0;
		v_ch1 = 0;
		v_ch2 = 0;
		v_ch3 = 0;
		v_ch4 = 0;
		v_che1 = 0;
		v_che2 = 0;
		v_che3 = 0;
		v_che4 = 0;
		v_nomemp = "";
		// Entrada de datos
		System.out.println("Por favor escribir el nombre del empleado");
		v_nomemp = bufEntrada.readLine();
		System.out.println(v_nomemp);
		System.out.println("Por favor introdusca el valor de la hora");
		v_vh = Double.parseDouble(bufEntrada.readLine());
		System.out.println("El valor de la hora es");
		System.out.println(v_vh);
		System.out.println("Por favor introduzca la cantidad de horas trabajadas de la primera semana");
		v_ch1 = Integer.parseInt(bufEntrada.readLine());
		// Procesos y salidas
		if (v_ch1>40) {
			System.out.println("La cantidad de horas trabajadas normales es");
			System.out.println("40");
			v_che1 = v_ch1-40;
			System.out.println("La cantidad de horas trabajadas extraordinarias es");
			System.out.println(v_che1);
		} else {
			System.out.println("La cantidad de horas trabajadas normales es");
			System.out.println(v_ch1);
			System.out.println("La cantidad de horas trabajadas extraordinarias es");
			System.out.println(v_che1);
		}
		if (v_che1!=0) {
			System.out.println("El pago por horas normales en la primera semana es");
			v_ph1 = v_vh*40;
			System.out.println(v_ph1);
		} else {
			System.out.println("El pago por horas normales en la primera semana es");
			v_ph1 = v_vh*v_ch1;
			System.out.println(v_ph1);
		}
		v_phe1 = v_che1*v_vh*(1.5);
		System.out.println("El pago por horas extraordinarias en la primera semana es");
		System.out.println(v_phe1);
		System.out.println("El pago de la primera semana es");
		v_ps1 = v_phe1+v_ph1;
		System.out.println(v_ps1);
		// pago primera semana//
		System.out.println("Por favor introduzca la cantidad de horas trabajadas de la segunda semana");
		v_ch2 = Integer.parseInt(bufEntrada.readLine());
		if (v_ch2>40) {
			System.out.println("La cantidad de horas trabajadas normales en la segunda semana  es");
			System.out.println("40");
			v_che2 = v_ch2-40;
			System.out.println("La cantidad de horas trabajadas extraordinarias en la segunda semana es");
			System.out.println(v_che2);
		} else {
			System.out.println("La cantidad de horas trabajadas normales en la segunda semana es");
			System.out.println(v_ch2);
			System.out.println("La cantidad de horas trabajadas extraordinarias en la segunda semana es");
			System.out.println(v_che2);
		}
		if (v_che2!=0) {
			System.out.println("El pago por horas normales en la segunda semana es");
			v_ph2 = v_vh*40;
			System.out.println(v_ph2);
		} else {
			System.out.println("El pago por horas normales en la segunda semana es");
			v_ph2 = v_vh*v_ch2;
			System.out.println(v_ph2);
		}
		v_phe2 = v_che2*v_vh*(1.5);
		System.out.println("El pago por horas extraordinarias en la segunda semana es");
		System.out.println(v_phe2);
		System.out.println("El pago de la segunda semana es");
		v_ps2 = v_phe2+v_ph2;
		System.out.println(v_ps2);
		// pago segunda semana//
		System.out.println("Por favor introduzca la cantidad de horas trabajadas de la tercera semana");
		v_ch3 = Integer.parseInt(bufEntrada.readLine());
		if (v_ch3>40) {
			System.out.println("La cantidad de horas trabajadas normales en la tercera semana  es");
			System.out.println("40");
			v_che3 = v_ch3-40;
			System.out.println("La cantidad de horas trabajadas extraordinarias en la tercera semana es");
			System.out.println(v_che3);
		} else {
			System.out.println("La cantidad de horas trabajadas normales en la tercera semana es");
			System.out.println(v_ch3);
			System.out.println("La cantidad de horas trabajadas extraordinarias en la tercera semana es");
			System.out.println(v_che3);
		}
		if (v_che3!=0) {
			System.out.println("El pago por horas normales en la tercera semana es");
			v_ph3 = v_vh*40;
			System.out.println(v_ph3);
		} else {
			System.out.println("El pago por horas normales en la tercera semana es");
			v_ph3 = v_vh*v_ch3;
			System.out.println(v_ph3);
		}
		v_phe3 = v_che3*v_vh*(1.5);
		System.out.println("El pago por horas extraordinarias en la tercera semana es");
		System.out.println(v_phe3);
		System.out.println("El pago de la tercera semana es");
		v_ps3 = v_phe3+v_ph3;
		System.out.println(v_ps3);
		// pago tercera semana//
		System.out.println("Por favor introduzca la cantidad de horas trabajadas de la cuarta semana");
		v_ch4 = Integer.parseInt(bufEntrada.readLine());
		if (v_ch4>40) {
			System.out.println("La cantidad de horas trabajadas normales en la cuarta semana  es");
			System.out.println("40");
			v_che4 = v_ch4-40;
			System.out.println("La cantidad de horas trabajadas extraordinarias en la cuarta semana es");
			System.out.println(v_che4);
		} else {
			System.out.println("La cantidad de horas trabajadas normales en la cuarta semana es");
			System.out.println(v_ch4);
			System.out.println("La cantidad de horas trabajadas extraordinarias en la cuarta semana es");
			System.out.println(v_che4);
		}
		if (v_che4!=0) {
			System.out.println("El pago por horas normales en la cuarta semana es");
			v_ph4 = v_vh*40;
			System.out.println(v_ph4);
		} else {
			System.out.println("El pago por horas normales en la cuarta semana es");
			v_ph4 = v_vh*v_ch4;
			System.out.println(v_ph4);
		}
		v_phe4 = v_che4*v_vh*(1.5);
		System.out.println("El pago por horas extraordinarias en la cuarta semana es");
		System.out.println(v_phe4);
		System.out.println("El pago de la tercera semana es");
		v_ps4 = v_phe4+v_ph4;
		System.out.println(v_ps4);
		// pago cuarta semana//
		System.out.println("El salario mensual es");
		v_sm = v_ps1+v_ps2+v_ps3+v_ps4;
		System.out.println(v_sm);
	}


}

