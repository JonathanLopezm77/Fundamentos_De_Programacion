Algoritmo Salario_Ejercicio_05
	//Enunciado: Calcular el salario con descuentos
	//Leer valores de v_VH, v_HTD, v_HTN
	//Pedir cada valor por teclado
	// y hallar el valor de x
	//desarrollado por Jonathan López
	//version 1.0
	//fecha 28/02/23
	//declaracion de variables
	Definir v_VH, v_VH40, v_VHN, v_VTHD, v_VTHN, v_SubSalario, v_RF, v_FE, v_BF, v_SP, v_SalarioNeto Como Real;
	Definir v_HTD, v_HTN Como Entero;
	Definir v_NomEmp como caracter;
	//inicializacion de variables
	v_VH =0.0;
	v_VH40=0.0;
	v_VHN=0.0;
	v_VTHD=0.0;
	v_VTHN=0.0;
	v_SubSalario=0.0;
	v_RF=0.0;
	v_FE=0.0;
	v_BF=0.0;
	v_SP=0.0;
	v_SalarioNeto=0.0;
	v_HTD=0;
	v_HTN=0;
	v_NomEmp=""
	// ENTRADA DE DATOS//
	Escribir "Por favor ingrese el nombre del empleado "
	Leer v_NomEmp
	Escribir "Por favor ingrese el valor de la hora";
	Leer v_VH;
	Escribir 'Por favor ingrese la cantidad de Horas Trabajadas Día';
	Leer v_HTD;
	Escribir 'Por favor ingrese la cantidad de Horas Trabajadas Noche';
	Leer v_HTN;
	//Procesos
	v_VTHD <- (v_VH)*(v_HTD);
	v_VH40 <- v_VH*0.4;
	v_VHN <- (v_VH)+(v_VH40);
	v_VTHN <- (v_VHN)*(v_HTN);
	v_SubSalario <- (v_VTHD)+(v_VTHN);
	v_RF <- (v_SubSalario)*(0.1);
	v_FE <- (v_SubSalario)*(0.03);
	v_BF <- (v_SubSalario)*(0.02);
	v_SP <- (v_SubSalario)*(0.04);
	v_SalarioNeto <- (v_SubSalario)-(v_RF)-(v_FE)-(v_BF)-(v_SP);
	//Salida
	Escribir 'Valo Hora Nocturna: ', v_VHN;
	Escribir 'El Subsalario es: ',v_SubSalario;
	Escribir 'Descuentos';
	Escribir 'Descuento por retencion de fuente';
	Escribir '10%';
	Escribir 'Descuento de fondos de empleados';
	Escribir '3%';
	Escribir 'Descuento de bienestar familiar';
	Escribir '2%';
	Escribir 'Descuento de salud y pension';
	Escribir '4%';
	Escribir 'Salario neto';
	Escribir v_SalarioNeto;
FinAlgoritmo
