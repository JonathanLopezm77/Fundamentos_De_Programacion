Algoritmo Nomina_y_salarioneto_Ejercicio_2
	//Enunciado: leer la cantidad de horas trabajadas y el valor de la hora por cada semana
	// Pedir por teclado las horas trabajadas y valor hora
	//calcular valor hora extraordinaria, cantidad de horas extraordinarias, 
	// y hallar el valor de x
	//desarrollado por Jonathan López
	//version 1.0
	//fecha 28/02/23
	//declaracion de variables
	definir v_vh, v_ph1, v_ph2, v_ph3, v_ph4, v_phe1, v_phe2, v_phe3, v_phe4, v_ps1, v_ps2, v_ps3, v_ps4, v_sb, v_impuestos, v_sn  Como Real;
	definir v_ch1, v_ch2, v_ch3, v_ch4, v_che1, v_che2, v_che3, v_che4 como entero;
	Definir n Como Caracter;
	//inicializacion de variables
	n= "";
	v_vh=0.0;
	v_ph1=0.0;
	v_ph2=0.0;
	v_ph3=0.0;
	v_ph4=0.0;
	v_phe1=0.0;
	v_phe2=0.0;
	v_phe3=0.0;
	v_phe4=0.0;
	v_ps1=0.0;
	v_ps2=0.0;
	v_ps3=0.0;
	v_ps4=0.0;
	v_sb=0.0;
	v_impuestos=0.0;
	v_sn=0.0;
	v_ch1=0;
	v_ch2=0;
	v_ch3=0;
	v_ch4=0;
	v_che1=0;
	v_che2=0;
	v_che3=0;
	v_che4=0;
	//Entrada de datos
	Escribir "Por favor escribir el nombre del empleado";
	leer n;
	Escribir n;
	Escribir "Por favor introdusca el valor de la hora";
	Leer v_vh;
	Escribir "El valor de la hora es";
	Escribir v_vh;
	Escribir "Por favor introduzca la cantidad de horas trabajadas de la primera semana";
	Leer v_ch1;
	//Procesos y salidas
	Si v_ch1 > 35 Entonces
		Escribir "La cantidad de horas trabajadas normales es";
		Escribir "35";
		v_che1= v_ch1 - 35;
		Escribir "La cantidad de horas trabajadas extraordinarias es";
		Escribir v_che1;
	SiNo
		Escribir "La cantidad de horas trabajadas normales es";
		Escribir v_ch1;
		Escribir "La cantidad de horas trabajadas extraordinarias es";
		Escribir v_che1;
	Fin Si
	Si v_che1 <> 0 Entonces
		Escribir "El pago por horas normales en la primera semana es";
		v_ph1 = v_vh * 35;
		Escribir v_ph1;
	SiNo
		Escribir "El pago por horas normales en la primera semana es";
		v_ph1 = v_vh * v_ch1;
		Escribir v_ph1;
	Fin Si
	v_phe1 = v_che1 * v_vh * (1.5);
	Escribir "El pago por horas extraordinarias en la primera semana es";
	Escribir v_phe1;
	Escribir "El pago de la primera semana es";
	v_ps1= v_phe1 + v_ph1;
	Escribir v_ps1;
	//pago primera semana//
	//Entrada de datos
	Escribir "Por favor introduzca la cantidad de horas trabajadas de la segunda semana";
	Leer v_ch2;
	//Procesos y salidas
	Si v_ch2 > 35 Entonces
		Escribir "La cantidad de horas trabajadas normales en la segunda semana  es";
		Escribir "35";
		v_che2= v_ch2 - 35;
		Escribir "La cantidad de horas trabajadas extraordinarias en la segunda semana es";
		Escribir v_che2;
	SiNo
		Escribir "La cantidad de horas trabajadas normales en la segunda semana es";
		Escribir v_ch2;
		Escribir "La cantidad de horas trabajadas extraordinarias en la segunda semana es";
		Escribir v_che2;
	Fin Si
	Si v_che2 <> 0 Entonces
		Escribir "El pago por horas normales en la segunda semana es";
		v_ph2 = v_vh * 35;
		Escribir v_ph2;
	SiNo
		Escribir "El pago por horas normales en la segunda semana es";
		v_ph2 = v_vh * v_ch2;
		Escribir v_ph2;
	Fin Si
	v_phe2 = v_che2 * v_vh * (1.5);
	Escribir "El pago por horas extraordinarias en la segunda semana es";
	Escribir v_phe2;
	Escribir "EL pago de la  segunda semana es";
	v_ps2= v_phe2 + v_ph2;
	Escribir v_ps2;
	//pago segunda semana//
	//Entrada de datos
	Escribir "Por favor introduzca la cantidad de horas trabajadas de la tercera semana";
	Leer v_ch3;
	//procesos y salidas
	Si v_ch3 > 35 Entonces
		Escribir "La cantidad de horas trabajadas normales en la tercera semana  es";
		Escribir "35";
		v_che3= v_ch3 - 35;
		Escribir "La cantidad de horas trabajadas extraordinarias en la tercera semana es";
		Escribir v_che3;
	SiNo
		Escribir "La cantidad de horas trabajadas normales en la tercera semana es";
		Escribir v_ch3;
		Escribir "La cantidad de horas trabajadas extraordinarias en la tercera semana es";
		Escribir v_che3;
	Fin Si
	Si v_che3 <> 0 Entonces
		Escribir "El pago por horas normales en la tercera semana es";
		v_ph3 = v_vh * 35;
		Escribir v_ph3;
	SiNo
		Escribir "El pago por horas normales en la tercera semana es";
		v_ph3 = v_vh * v_ch3;
		Escribir v_ph3;
	Fin Si
	v_phe3 = v_che3 * v_vh * (1.5);
	Escribir "El pago por horas extraordinarias en la tercera semana es";
	Escribir v_phe3;
	Escribir "El pago de la tercera semana es";
	v_ps3= v_phe3 + v_ph3;
	Escribir v_ps3;
	//pago tercera semana//
	//Entrada de datos
	Escribir "Por favor introduzca la cantidad de horas trabajadas de la cuarta semana";
	Leer v_ch4;
	//Procesos y salidas
	Si v_ch4 > 35 Entonces
		Escribir "La cantidad de horas trabajadas normales en la cuarta semana  es";
		Escribir "35";
		v_che4= v_ch4 - 35;
		Escribir "La cantidad de horas trabajadas extraordinarias en la cuarta semana es";
		Escribir v_che4;
	SiNo
		Escribir "La cantidad de horas trabajadas normales en la cuarta semana es";
		Escribir v_ch4;
		Escribir "La cantidad de horas trabajadas extraordinarias en la cuarta semana es";
		Escribir v_che4;
	Fin Si
	Si v_che4 <> 0 Entonces
		Escribir "El pago por horas normales en la cuarta semana es";
		v_ph4 = v_vh * 35;
		Escribir v_ph4;
	SiNo
		Escribir "El pago por horas normales en la cuarta semana es";
		v_ph4 = v_vh * v_ch4;
		Escribir v_ph4;
	Fin Si
	v_phe4 = v_che4 * v_vh * (1.5);
	Escribir "El pago por horas extraordinarias en la cuarta semana es";
	Escribir v_phe4;
	Escribir "El pago de la cuarta semana es";
	v_ps4= v_phe4 + v_ph4;
	Escribir v_ps4;
	//pago cuarta semana//
	//Procesos y salidas
	Escribir "El salario bruto es";
	v_sb=v_ps1 + v_ps2 + v_ps3 +v_ps4;
	Escribir v_sb;
	//salario neto//
	Si v_sb<= 300000 Entonces
		Escribir "Esta libre de impuestos";
	Fin si
	Si v_sb<= 400000 y v_sb>300000 Entonces;
		v_impuesto=(v_sb - 300000) * 0.2;
	Fin Si
	Si v_sb> 400000 Entonces
		v_impuesto=(v_sb - 400000) * 0.3 + (100000* 0.2);
	Fin Si
	v_sn= v_sb - v_impuesto;
	Escribir "Salario neto es igual a: " , v_sn, "$";

FinAlgoritmo
