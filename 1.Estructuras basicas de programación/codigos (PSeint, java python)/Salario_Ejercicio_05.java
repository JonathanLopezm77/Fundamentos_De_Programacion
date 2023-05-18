/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "SALARIO_EJERCICIO_05.java."

import java.io.*;

public class salario_ejercicio_05 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double v_bf;
		double v_fe;
		int v_htd;
		int v_htn;
		String v_nomemp;
		double v_rf;
		double v_salarioneto;
		double v_sp;
		double v_subsalario;
		double v_vh;
		double v_vh40;
		double v_vhn;
		double v_vthd;
		double v_vthn;
		// Enunciado: Calcular el salario con descuentos
		// Leer valores de v_VH, v_HTD, v_HTN
		// Pedir cada valor por teclado
		// y hallar el valor de x
		// desarrollado por Jonathan López
		// version 1.0
		// fecha 28/02/23
		// declaracion de variables
		// inicializacion de variables
		v_vh = 0.0;
		v_vh40 = 0.0;
		v_vhn = 0.0;
		v_vthd = 0.0;
		v_vthn = 0.0;
		v_subsalario = 0.0;
		v_rf = 0.0;
		v_fe = 0.0;
		v_bf = 0.0;
		v_sp = 0.0;
		v_salarioneto = 0.0;
		v_htd = 0;
		v_htn = 0;
		v_nomemp = "";
		// ENTRADA DE DATOS//
		System.out.println("Por favor ingrese el nombre del empleado ");
		v_nomemp = bufEntrada.readLine();
		System.out.println("Por favor ingrese el valor de la hora");
		v_vh = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Por favor ingrese la cantidad de Horas Trabajadas Día");
		v_htd = Integer.parseInt(bufEntrada.readLine());
		System.out.println("Por favor ingrese la cantidad de Horas Trabajadas Noche");
		v_htn = Integer.parseInt(bufEntrada.readLine());
		// Procesos
		v_vthd = (v_vh)*(v_htd);
		v_vh40 = v_vh*0.4;
		v_vhn = (v_vh)+(v_vh40);
		v_vthn = (v_vhn)*(v_htn);
		v_subsalario = (v_vthd)+(v_vthn);
		v_rf = (v_subsalario)*(0.1);
		v_fe = (v_subsalario)*(0.03);
		v_bf = (v_subsalario)*(0.02);
		v_sp = (v_subsalario)*(0.04);
		v_salarioneto = (v_subsalario)-(v_rf)-(v_fe)-(v_bf)-(v_sp);
		// Salida
		System.out.println("Valo Hora Nocturna: "+v_vhn);
		System.out.println("El Subsalario es: "+v_subsalario);
		System.out.println("Descuentos");
		System.out.println("Descuento por retencion de fuente");
		System.out.println("10%");
		System.out.println("Descuento de fondos de empleados");
		System.out.println("3%");
		System.out.println("Descuento de bienestar familiar");
		System.out.println("2%");
		System.out.println("Descuento de salud y pension");
		System.out.println("4%");
		System.out.println("Salario neto");
		System.out.println(v_salarioneto);
	}


}

